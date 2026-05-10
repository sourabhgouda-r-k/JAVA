import java.util.Scanner;
public class Solution_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = in.nextInt();
        if(num >0){
            System.out.println(num +" is Positive");
        }else if(num<0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is Zero");
        }
    }
    
}
