package HomeAssignments;

public class PrimeNumbers 
{
   public static void main(String[] args) 
   {
              int num = 9;
       
       if(isPrime(num)) //function call
       {
           System.out.println(num + " is a prime number"); //print statements if the value is true it executes the if condition
       } else  //otherwise it will executes the else part
       {
           System.out.println(num + " is not a prime number");
       }
   }
   public static boolean isPrime(int num) //method to check the number is prime or not
   {
       if (num < 2) { //since 0 and 1 is not a prime number, it checks the given value is a 0 or 1
           return false; //if it's false it will return the false and prints the else part
       } //if it's true it will run the next line
       
       for (int i = 2; i <= Math.sqrt(num); i++) //Math.sqrt is a method to find the square root of a given number
       {
           if (num % i == 0) //Sqrt of 9 is 3 so the condition is true, and 9%3==0
           { 
               return false; //condition satifies and returns false.
           }
       }
       return true;
   }
}