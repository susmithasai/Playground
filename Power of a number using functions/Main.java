import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner sc = new Scanner(System.in);
      int base=sc.nextInt();
      int exp=sc.nextInt();
      System.out.print(power(base,exp));
    }
  public static int power(int base,int exp)
  {
    int pow=1;
  while(exp>=1)
  {
    pow=pow*base;
    exp--;
  }
  return pow;
}
}



