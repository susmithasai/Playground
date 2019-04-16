import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int index=0;index<=arr_size-1;index++)
      {
        arr[index]=sc.nextInt();
      }
      int search_1=sc.nextInt();
      int search_2=sc.nextInt();
      int ele_1=-1;
      int ele_2=-1;
      for(int index=0;index<=arr_size-1;index++)
      {
        if(search_1==arr[index])
        {
          ele_1=index;
        }
        if(search_2==arr[index])
        {
        ele_2=index;
      }
    }
  System.out.println(ele_1);
  System.out.println(ele_2);
} 
    
}