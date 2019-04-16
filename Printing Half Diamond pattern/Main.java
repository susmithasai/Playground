import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=1,b=n;
      int c=b-1;
      for(int i=0;i<b;i++)
      {
        for(int j=c;j>i;j--)
        {
          System.out.print(" ");
        }
        for(int k=0;k<a;k++)
        {
          System.out.print("*");
        }
        a+=2;
        System.out.println();
      }
	}
}