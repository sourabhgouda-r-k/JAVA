public class Operators {
    public static void main(String[] args) {
        int num1= 10 , num2=20;

        // Arithmetic Operations / Operators
        int add = num1 + num2;
        int sub = num1 -num2;
        double div = num1/num2;
        int prod = num1*num2; 
        double mod = num1%num2;
        System.out.println("Addition: "+add);
        System.out.println("Substraction: "+sub);
        System.out.println("Division: "+div);
        System.out.println("Product: "+prod);
        System.out.println("Modules: "+mod);

        //Relatioal Operators
        System.out.println(num1>num2); // num1 is greater then num2
        System.out.println(num1<num2); // num1 is smaller then num2 
        System.out.println(num1==num2); // num1 and num2 are equal 
        System.out.println(num1!=num2);// num1 and num2 are not equal 
        System.out.println(num1>=num2); // num1 is greater then or equal to num2 
        System.out.println(num1<=num2); // num1 is smaller then or equal to num2 

        
    }
    
}
