public class Conditional_Statement {
    public static void main(String[] args) {
        int age = 21;

        
        // simple if statement 
        if(age>18){
            System.out.println("You can vote!");
        }


        // if - else statement
        if( age > 18 ){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can't vote");
        }


        //else-if ladder
        boolean isParent =true;
        if(age>18){
            System.out.println("you can Enter");
        } 
        else if (isParent){
            System.out.println("You can Enter");
        }
        else{
            System.out.println("You can't enter you are not 18+ and not have parent");
        }


        // nested if
        if(age >18){
            if(isParent){
                System.out.println("You are 18+ and you also have parent");
            }
            else{
                System.out.println("You don't have parent");
            }
        }else{
            System.out.println("You are not 18+ and not having parent");
        }


        // switch case 
        char choice ='B';
        switch (choice) {
            case 'A' : 
                System.out.println("Apple");
                break;

            case 'B' : 
                System.out.println("Ball");
                break;

            default:
                System.out.println("Enter Correct choice!");
                break;
        }

    }
}
