import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int ind=0;ind<=arr_size-1;ind++)
      {
        arr[ind]=sc.nextInt();
      }
      zero(arr_size,arr);
      for(int ind=0;ind<=arr_size-1;ind++)
      {
        System.out.print(arr[ind]+" ");
      }
    }
  public static void zero(int arr_size,int arr[])
  {
    int count=0;
    for(int ind=0;ind<=arr_size-1;ind++)
    {
      if(arr[ind]!=0)
      {
      int temp=arr[ind];
      arr[ind]=arr[count];
      arr[count]=temp;
      count++;
    }
   }
}
}
