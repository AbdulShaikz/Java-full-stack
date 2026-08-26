interface Swimmable {
    void swim();
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
    public void fly() {
        System.out.println("Duck is flying");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
    }
}