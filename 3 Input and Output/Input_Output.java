import java.util.Scanner;
public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: "); // Output Statement 
        int num = sc.nextInt(); // Input Statement. 
        System.out.println("you are "+num+" Year old");
    }
}
