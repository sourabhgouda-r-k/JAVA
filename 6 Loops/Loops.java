public class Loops {
    public static void main(String[] args) {
        int i=0;

        // for loop 
        System.out.println("Printing Numbers:");
        for(i=0;i<5;i++){
            System.out.println(i);
        }

       // while loop
        while(i<5) {
            System.out.println(i);
            i++;
        }

        // do While 
        do{
            System.out.println(i);
            i++;
        }while(i<5);
    }
    
}
