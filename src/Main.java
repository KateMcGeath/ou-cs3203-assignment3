public class Main {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4};
        int sum = 0;

        sum = sum(array);
        System.out.println("The sum of the array is: " + sum);

    }
    //Method that takes in an array and sums up its values.
    public static int sum(int[] array) {

        int value = 0;

        for(int i = 0; i < array.length; i++) {

            value += array[i];
        }

        return value;
    }

}