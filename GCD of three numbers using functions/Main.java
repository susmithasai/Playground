import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    int n3 = sc.nextInt();
	    int result = gcd(n1, n2);
	    System.out.print(gcd(n1, n2));
	}
	public static int gcd(int num1, int num2)
	{
	    int min;
	    if(num1<num2)
	    {
	        min=num1;
	    }
	    else{
	        min= num2;
	    }
	    while(min>=1)
	    {
	        if((num1%min==0)&&(num2%min== 0))
	        {
	            return min;
	        }
	        ++min;
	    }
	    return 0;
	}
}