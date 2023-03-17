import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number to Add: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second number to Add: ");
        int num2 = input.nextInt();
        System.out.println("Your Sum is:  ");
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
