import java.util.Scanner;
public class Solution_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number 1");
        int num1 = in.nextInt();
        System.out.println("Enter the Number 2");
        int num2 = in.nextInt();
        System.out.println("Enter the Number 3");
        int num3 = in.nextInt();
        if(num1>=num2 && num1>=num3 ){
            System.out.println(num1+ " is Greater");
        }else if(num2>=num1 && num2>=num3){
            System.out.println(num2+ " is Greater");
        }else{
            System.out.println(num3+" is Greater");
        }
    }
    
}
