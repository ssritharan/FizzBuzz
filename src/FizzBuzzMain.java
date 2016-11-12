
public class FizzBuzzMain {

	public static void main(String[] args) {
		/*
		 * Write a program that prints the numbers from 1 to 100. 
		 * But for multiples of three print “Fizz” instead of the 
		 * number and for the multiples of five print “Buzz”. 
		 * For numbers which are multiples of both three 
		 * and five print “FizzBuzz”.
		 */
		
	for (int i = 1; i < 101; i++)	{
		
		if ( i%3 ==0 && i%5 ==0){
			print("FizzBuzz");
		}
		else if ( i%3 ==0){
			print("Fizz");
		}
			else if (i%5==0){
				print("Buzz");	
			}
		 else {
			 print(Integer.toString(i));
		}		
	 }
   }
	private static void print(String s1){
		System.out.println(s1);
	  
	}
}


