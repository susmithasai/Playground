import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i = 2; i <= n; i++)
	    {
	        if(prime(i))
	        {
	            System.out.println(i);
	        }
	    }
    }
	public static boolean prime(int m)
	{
	    boolean prime = true;
	    for(int num = 2; num <= m/2; num++)
	    {
	        if(m % num == 0)
	        {
	            prime = false;
	            break;
	        }
	    }
	    return prime;
	}
}// End of Main class