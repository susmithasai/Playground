import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    for(int factors = 1; factors <= num; factors++)
	    {
	        if(num % factors == 0)
	        {
	             System.out.println(factors);
	        }
	    }
	}
}