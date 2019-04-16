import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a,b,sum=0,temp;
      temp=n;
      while(n>0)
      {
        a=n%10;
        b=a*a*a;
        sum=sum+b;
        n=n/10;
	}
      n=temp;
      if(n==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
}
}