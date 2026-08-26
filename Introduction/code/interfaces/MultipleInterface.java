interface Swimmable {
    void swim();

    default void rest() {
        System.out.println("Taking a rest");
    }
}

interface Flyable {
    void fly();
}

class Duck implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void rest() {
        System.out.println("Duck is resting");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.rest();
        duck.fly();
    }
}