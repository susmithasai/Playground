import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n,sum=0;
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      while(m>0)
      {
        n=m%10;
        sum=sum+n;
        m=m/10;
      }
        System.out.println(sum);
	}
}