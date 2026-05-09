import java.util.Scanner;
public class Solution_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        if(num%5 == 0){
            System.out.println(num+" is Divisable by 5.");
        }
        else{
            System.out.println(num+"is not Divisable by 5");
        }
        
    }
}
