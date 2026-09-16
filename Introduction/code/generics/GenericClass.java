class Box<T> {
	private T value;

	public void set(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}
}

public class GenericClass {
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<>();
		integerBox.set(42);
		System.out.println(integerBox.get());

		Box<String> stringBox = new Box<>();
		stringBox.set("Hello");
		System.out.println(stringBox.get());
	}
}

// Learning points:
// - Generics provide compile-time type safety and reduce the need for casting.
// - The type parameter T allows Box to store and return different data types.
// - The diamond operator <> lets Java infer the generic type from the variable declaration.
