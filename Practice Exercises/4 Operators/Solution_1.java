import java.util.Scanner;
public class Solution_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        int diff = num1-num2;
        int prod = num1 * num2;
        double div = num1 /num2;
        double mod = num1 %num2;
        System.out.println("sum: "+sum);
        System.out.println("Substraction: "+diff);
        System.out.println("Product: "+prod);
        System.out.println("Division: "+div);
        System.out.println("Modules: "+mod);
    }
}