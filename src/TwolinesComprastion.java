import java.util.Scanner;
public class TwolinesComprastion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of X1,X2,X3,X4");
        int X1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y1 = sc.nextInt();
        int Y2 = sc.nextInt();
        int LengthofLine1 = (int) Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
        System.out.println("Enter the values of x3,X4,Y3,Y4");
        int X3 = sc.nextInt();
        int X4 = sc.nextInt();
        int Y3 = sc.nextInt();
        int Y4 = sc.nextInt();
        int LengthofLine2 = (int) Math.sqrt(Math.pow(X4 - X3, 2) + Math.pow(Y4 - Y3, 2));
        if ((LengthofLine1 > LengthofLine2)) {
            System.out.println("\n Two Lines are Equal");
        } else {
            System.out.println("\n Two Lines are Not Equal");
        }

    }
}