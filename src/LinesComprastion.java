import java.util.Scanner;
public class LinesComprastion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of X1");
        int X1 = sc.nextInt();
        System.out.println("Enter the values of X2");
        int X2 = sc.nextInt();
        System.out.println("Enter the values of Y1");
        int Y1 = sc.nextInt();
        System.out.println("Enter the values of Y2");
        int Y2 = sc.nextInt();
        int length1 = (int)Math.sqrt(Math.pow(X2 - X1,2) + Math.pow(Y2 - Y1, 2));
        System.out.println("Enter the values of X3");
        int X3 = sc.nextInt();
        System.out.println("Enter the values of X4");
        int X4 = sc.nextInt();
        System.out.println("Enter the values of Y3");
        int Y3 = sc.nextInt();
        System.out.println("Enter the vaules of Y4");
        int Y4 = sc.nextInt();
        int Length2 = (int)Math.sqrt((Math.pow(X4 - X3, 2) + Math.pow(Y4 - Y3, 2)));
        if (length1 == Length2)
        {
            System.out.println("\n Lines are Equal");
        }
        else if (length1 > Length2)
        {
            System.out.println("\n Line1 is greater");
        }
        else
        {
            System.out.println("\n Line2 is greater");
        }

    }
}
