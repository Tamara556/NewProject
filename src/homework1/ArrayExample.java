package homework1;

public class ArrayExample {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 5;
        number[1] = 6;
        number[2] = 88;
        number[3] = 34;
        number[4] = 7;
        System.out.println(number[4]);
        int[][] twoD = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++)
                twoD[i][j] = k;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
