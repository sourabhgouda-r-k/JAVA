import java.util.Scanner;
public class Strings{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 2 method to declare the strings in java  
        String name = "Sourabh"; // old method

        String language = new String("Java"); // new method 

        System.out.println(name);
        System.out.println(language);

        // Taking the string input from user 
        System.out.println("Enter your name: ");
        String First_name = in.nextLine();  // nextline() Takes full sentence.
        String Last_name = in.next();  // next() Takes only one word.
        System.out.println(First_name);
        System.out.println(Last_name);


        // String Methods
        //Length method: Used to find total characters Counting Starts from 1.
        System.out.println(name.length()); 

        // CharAt(): Used to get a character at a specific index.
        System.out.println(name.charAt(3));

        // toUpperCase(): Converts all letters to uppercase.
        System.out.println(name.toUpperCase());

        // toLowercase(): Converts all letters to lowercase.
        System.out.println(name.toLowerCase());

        // SubString(): Used to extract part of a string.
        System.out.println(name.substring(0,3));

        //contains(): Checks whether a word exists or not.
        System.out.println(name.contains("our")); // Returns true or false
        
        //equals(): Compares string contents.
        String name2 = "Java";
        System.out.println(language.equals(name2));

        // equalsIgnoreCase(): Ignores uppercase/lowercase differences.
        String Firstname = new String("SOURABH");
        System.out.println(Firstname.equalsIgnoreCase(name));

        // replace(): Replaces characters or words.
        String text = "i Love Python";
        System.out.println(text.replace("Python", "Java"));
        System.out.println(text.replace("Python", name)); 

        // trim(): Removes extra spaces from start and end.
        String data = "  name: sourabh ";
        System.out.println(data.trim());

        //indexOf(): Finds position of character/word.
        System.out.println(name.indexOf("o"));


    }
}