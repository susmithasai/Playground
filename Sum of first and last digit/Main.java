import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int num,first,last;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      int number=num;
      while(number>=10)
      {
        number=number/10;
	  }
      first=number;
      last=num%10;
      System.out.println(first+last);
}
}