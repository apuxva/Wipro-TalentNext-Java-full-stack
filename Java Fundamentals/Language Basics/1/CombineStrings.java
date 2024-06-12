//Combining Two Strings with "Technologies" in Between
/*Write a Program that accepts two Strings as command line 
arguments and generate the output in the required format. */
public class CombineStrings {
    public static void main(String [] args){
        String firstString = args[0];
        String secondString = args[1];
        System.out.println(firstString + " Technologies " + secondString );
    }
}