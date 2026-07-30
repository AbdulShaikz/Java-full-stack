import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("\tCalculator\t");
            System.out.println("---------------------------\t");
            System.out.println("1. Addition \n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            int option = input.nextInt();
            switch(option){
                case 1: {
                    double[] values = takeInput(input);
                    System.out.println("Result: " + (values[0] + values[1]));
                    break;
                }
                case 2: {
                    double[] values = takeInput(input);
                    System.out.println("Result: " + (values[0] - values[1]));
                    break;
                }
                case 3: {
                    double[] values = takeInput(input);
                    System.out.println("Result: " + (values[0] * values[1]));
                    break;
                }
                case 4: {
                    double[] values = takeInput(input);
                    if (values[1] == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Result: " + (values[0] / values[1]));
                    }
                    break;
                }
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static double[] takeInput(Scanner input){
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        return new double[]{first, second};
    }
}