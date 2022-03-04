import java.util.Scanner;

public class Board {
    private static int put[];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your board size: ");
        int boardSize = sc.nextInt();
        put = new int[boardSize];
        for (int i = 0; i < boardSize; i++) {
            System.out.println("Please enter number [" + i + "]");
            put[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < boardSize; i++) {
            sum += put[i];
        }
        double avg = sum / boardSize;
        System.out.println("The average of your numbers is " + avg);

        int size = put.length;
        int max = put[0];
        for (int i = 0; i < size; i++) {
            if (put[i] > max)
                max = put[i];
        }
        System.out.println("The highest number is: " + max);

        sc.close();
    }

}
