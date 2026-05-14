import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк:");
        int s = scan.nextInt();
        System.out.println("Введите кол-во столбов:");
        int h = scan.nextInt();
        int[][] x = new int[s][h];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = scan.nextInt();
            }
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Отсортированный массив:");
        int[] z = new int[h];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < h; j++) {
                z[j] = x[i][j];
            }
            shakerSort(z);
            for (int k = 0; k < h; k++) {
                System.out.print(z[k] + " ");
            }
            System.out.println();
        }
    }

    public static void shakerSort(int[] value) {
        int left = 0;
        int right = value.length - 1;
        while (left < right) {
            for (int i = right; i > left; i--) {
                if (value[i - 1] > value[i]) {
                    int temp = value[i];
                    value[i] = value[i - 1];
                    value[i - 1] = temp;
                }
            }
            ++left;
            for (int i = left; i < right; ++i) {
                if (value[i] > value[i + 1]) {
                    int temp = value[i + 1];
                    value[i + 1] = value[i];
                    value[i] = temp;
                }
            }
            --right;
        }
    }
}