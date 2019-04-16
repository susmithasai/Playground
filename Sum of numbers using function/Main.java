import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    System.out.print(sum_of_numbers(n)); 
	}
	public static int sum_of_numbers(int y)
	{
	    int sum = 0;
	    for(int i = 1; i<= y; i++)
	    {
	        sum = sum + i;
	    }
	    return sum;
	}
} 