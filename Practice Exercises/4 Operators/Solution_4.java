import java.util.Scanner;
public class Solution_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        if(num>100){
            System.out.println(num +" is greater then 100");
        }else{
            System.out.println(num +" is Less then 100");
        }
    }
    
}
