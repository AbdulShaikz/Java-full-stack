class Calculator {
	// Overloading: same method name, but different parameter types or counts.
	int add(int first, int second) {
		return first + second;
	}

	double add(double first, double second) {
		return first + second;
	}

	int add(int first, int second, int third) {
		return first + second + third;
	}
}

class AdvancedCalculator extends Calculator {
	// Overriding: the subclass provides a new implementation of an inherited method.
	@Override
	int add(int first, int second) {
		return first + second + 10;
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		AdvancedCalculator calculator = new AdvancedCalculator();

		// Overloading is resolved using the argument types/count at compile time.
		System.out.println(calculator.add(1.5, 2.5)); // Calls add(double, double): 4.0
		System.out.println(calculator.add(1, 2, 3));  // Calls add(int, int, int): 6

		// Overriding is resolved using the object's actual class at runtime.
		System.out.println(calculator.add(1, 2));      // Calls AdvancedCalculator.add: 13

		Calculator reference = new AdvancedCalculator();
		System.out.println(reference.add(1, 2));       // Also calls the overridden method: 13
	}
}
