import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  int first,last,num;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      String x=String.valueOf(num);
      char c=x.charAt(1);
      System.out.println(c);
    }
}