package homework1;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 9, 2, 11, 24, 5, 3, 5, 7};
        int n = 6;
        int quantity = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == n) {
                quantity = quantity + 1;
                System.out.print(quantity);
                System.out.println();
            }
        }
        int[] numbs = {2, 4, 5, 5, 6, 7, 8, 6, 55, 7};
        for (int i = 9; i > -1; i--) {
            System.out.print(numbs[i] + " ");
        }
    }
}