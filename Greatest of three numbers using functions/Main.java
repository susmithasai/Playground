import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int res=gcf(n1,n2);
      System.out.print(gcf(res,n3));
    }
  public static int gcf(int num1,int num2)
  {
    int max=0;
    if(num1>num2)
    {
      max=num1;
    }
    else
    {
      max=num2;
    }
    return max;
	}
}