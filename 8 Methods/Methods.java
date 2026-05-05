public class Methods{
    public void sum(int num1,int num2){
        System.out.println("Sum is: "+(num1+num2));
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Methods obj = new Methods();
        obj.sum(a,b);
    }
}