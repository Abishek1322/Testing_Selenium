package HomeAssignments;

public class Fibonacci {

	public static void main(String args[])
	{
		//for fibonacci series the series starts with 0 and 1
		//so declared the first and second number of the fibonacci series
		//how many fibonacci series should run is declared in the variable "n"
		int n = 10, firstnum = 0, secondnum = 1;
		//we have declared the variable nextnum to store the next fibonacci number
		int nextnum;

		//statement to print the sequence
		System.out.print("Fibonacci Series up to " + n + " terms: ");
		//for loop to create the sequence of fibonacci series
		//loop starts with 1 and will run until 10, since the n value is 10
		for (int i = 1; i <= n; i++) {
			System.out.print(firstnum + ", "); //first it prints the first value "0"
			nextnum = firstnum + secondnum; //0+1 = 1 (Second number in fibonacci)
			firstnum = secondnum; //firstnum=1
			secondnum = nextnum;//secondnum=1
			//for every loop it prints the value of firstnum
		}
	}
}