import java.util.Scanner;
public class Solution_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        if(num>=50 && num <=100 ){
            System.out.println(num +" is Between 50 to 100");
        }else{
            System.out.println(num +" number is not between 50 to 100 ");
        }
    }
    
}
