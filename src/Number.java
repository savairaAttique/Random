import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = input.nextInt();

        System.out.println("Enter num2: ");
        int num2 = input.nextInt();

        System.out.println("Enter num3: ");
        int num3 = input.nextInt();

        int multi = num1 * num2 * num3;
        System.out.println("OUTPUT of multiplication: num1 * num2 * num3 + multi");
        System.out.print("multiplication: num1 * num2 * num3 = " + multi + "\n" );
        System.out.println("OUTPUT of multiplication: num1 * num2 * num3 = + num1 * num2 * num3");
        System.out.println("multiplication: num1 * num2 * num3 = " + num1 * num2 * num3 + "\n");
        System.out.println("OUTPUT of multi");
        System.out.println(multi + "\n");
        System.out.println("OUTPUT of (multi * multi) ");
        System.out.println(multi * multi + "\n");
        System.out.println("OUTPUT of num1 * num2 * num3");
        System.out.println(num1 * num2 * num3 );




    }
}
