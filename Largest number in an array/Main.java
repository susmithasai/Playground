import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arrsize = sc.nextInt();
        int arr[] = new int[arrsize];
        for(int ind=0; ind<=arrsize-1;ind++)
        {
            arr[ind] = sc.nextInt();
        }
        int max;
        if(arr[0]>arr[1])
        {
            max=arr[0];
        }
        else{
             max=arr[1];
        } 
        for(int ind=2;ind<=arrsize-1;ind++)
        {
            if(max<arr[ind])
            {
                max=arr[ind];
            }
        }
        System.out.println(max);
    }
}