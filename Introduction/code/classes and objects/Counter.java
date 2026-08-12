public class Counter {
    private static int count = 0;

    private int id;

    public Counter() {
        count++;
        this.id = count;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("c1 id = " + c1.getId());
        System.out.println("c2 id = " + c2.getId());
        System.out.println("c3 id = " + c3.getId());
        System.out.println("Total instances created: " + Counter.getCount());
    }
}
