import java.util.Scanner;

public class LengthofLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int X1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y1 = sc.nextInt();
        int Y2 = sc.nextInt();
        System.out.println("\n\n Length of the Line is " + Length(X1, X2, Y1, Y2));
        System.out.println();
    }
    private static int Length(int X1, int Y1, int X2, int Y2)
    {
        return (int) Math.sqrt(Math.pow(X2 - X1,2) + Math.pow(Y2 - Y1,2));
    }

}


