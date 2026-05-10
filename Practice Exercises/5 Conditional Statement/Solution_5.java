import java.util.Scanner;
public class Solution_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = in.nextInt();
        if (marks> 90) {
            System.out.println("Grade A");
        }else if(marks >= 75 && marks <=89){
            System.out.println("Grade B");
        }else if(marks >= 50 && marks <= 74){
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }
    }
    
}
