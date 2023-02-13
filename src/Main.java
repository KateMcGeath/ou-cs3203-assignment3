import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //int array[] = {1, 2, 3, 4};
        int sum = 0;
        int product = 0;
        int len = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        len = scan.nextInt();
        System.out.println("Enter values for array (with a space in between each value): ");

        int[] array = new int[len];

        for(int i = 0; i < len; i++) {

            array[i]= scan.nextInt();
        }

        sum = sum(array);
        System.out.println("The sum of the array is: " + sum);

        product = multiply(array);
        System.out.println("The product of the inputted array is: " + product);

    }
    //Method that takes in an array and sums up its values.
    public static int sum(int[] array) {

        int value = 0;

        for(int i = 0; i < array.length; i++) {

            value += array[i];
        }

        return value;
    }

    //Method that takes in an array and computes the product of the values.
    public static int multiply(int[] array) {

        int value = 1;

        for(int i = 0; i < array.length; i++) {

            value *= array[i];
        }

        return value;
    }

}