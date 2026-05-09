import java.util.Scanner;
public class Solution_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = in.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
    
}
