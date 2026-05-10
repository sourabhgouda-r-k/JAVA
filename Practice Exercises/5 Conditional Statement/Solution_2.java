import java.util.Scanner;
public class Solution_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int num1 = in.nextInt();
        System.out.println("Enter the Number 2");
        int num2 = in.nextInt();
        if( num1 > num2){
            System.out.println(num1+" is Greater");
        }else{
            System.out.println(num2+" is Greater");
        }
        
    }
    
}
