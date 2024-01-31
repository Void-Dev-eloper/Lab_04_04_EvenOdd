public class Main {
    public static void main(String[] args) {

        /*
        A program that takes a integer (java int) and uses the modulo function to indicate if the number is odd or even.  Since we can’t do input in java yet, just hard code the value for the input as a variable instantiation.

Instead of inputing the value which we can’t do yet, set the value in the code.

int numToExamine = 2;
// program will then determine that since 2 mod 2 is 0 that numToExamine is Even.

         */
        int numToExamine = 2;
        int secNumToExamine = 23;
        int even;
        int odd;

        even =  numToExamine % 2;
        odd = secNumToExamine % 2;


        System.out.println(numToExamine + " mod " + 2 + " is " + even + " so that it is even");
        System.out.println(secNumToExamine + " mod " + 2+ " is " + odd + " so that is odd");
    }
}