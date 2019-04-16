import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(s(n));
    }
  public static int s(int p)
  {
    int res=p*p;
    return res;
	} 
}