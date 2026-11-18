import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

enum VehicleType {
	CAR,
	BIKE
}

abstract class Vehicle {
	private final String licensePlate;
	private final VehicleType type;

	protected Vehicle(String licensePlate, VehicleType type) {
		this.licensePlate = licensePlate;
		this.type = type;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public VehicleType getType() {
		return type;
	}
}

class Car extends Vehicle {
	public Car(String licensePlate) {
		super(licensePlate, VehicleType.CAR);
	}
}

class Bike extends Vehicle {
	public Bike(String licensePlate) {
		super(licensePlate, VehicleType.BIKE);
	}
}

class ParkingSpot {
	private final VehicleType type;
	private Vehicle vehicle;

	ParkingSpot(VehicleType type) {
		this.type = type;
	}

	public boolean isAvailable() {
		return vehicle == null;
	}

	void park(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	Vehicle release() {
		Vehicle parkedVehicle = vehicle;
		vehicle = null;
		return parkedVehicle;
	}

	public VehicleType getType() {
		return type;
	}
}

class Ticket {
	private final String licensePlate;
	private final Instant entryTime;
	private long fee;

	Ticket(String licensePlate) {
		this.licensePlate = licensePlate;
		this.entryTime = Instant.now();
	}

	void close() {
		long seconds = Duration.between(entryTime, Instant.now()).getSeconds();
		long hours = seconds / 3600;
		if (seconds % 3600 != 0) {
			hours++;
		}
		this.fee = Math.max(1, hours) * 10;
	}

	public long getFee() {
		return fee;
	}
}

public class ParkingLot {
	private final List<ParkingSpot> spots = new ArrayList<>();

	public ParkingLot(int carSpots, int bikeSpots) {
		for (int i = 0; i < carSpots; i++) {
			spots.add(new ParkingSpot(VehicleType.CAR));
		}
		for (int i = 0; i < bikeSpots; i++) {
			spots.add(new ParkingSpot(VehicleType.BIKE));
		}
	}

	public Ticket park(Vehicle vehicle) {
		for (ParkingSpot spot : spots) {
			if (spot.isAvailable() && spot.getType() == vehicle.getType()) {
				spot.park(vehicle);
				return new Ticket(vehicle.getLicensePlate());
			}
		}
		throw new IllegalStateException("No available spot");
	}

	public Ticket exit(Vehicle vehicle) {
		for (ParkingSpot spot : spots) {
			if (!spot.isAvailable()) {
				Vehicle parkedVehicle = spot.release();
				if (parkedVehicle.getLicensePlate().equals(vehicle.getLicensePlate())) {
					Ticket ticket = new Ticket(vehicle.getLicensePlate());
					ticket.close();
					return ticket;
				}
			}
		}
		throw new IllegalStateException("Vehicle is not parked");
	}

	public int getAvailableSpots(VehicleType type) {
		int available = 0;
		for (ParkingSpot spot : spots) {
			if (spot.getType() == type && spot.isAvailable()) {
				available++;
			}
		}
		return available;
	}
}
