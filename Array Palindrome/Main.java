import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for(int index=0; index<=arr_size - 1;index++)
        {
            arr[index] = sc.nextInt();
        }
        int left = 0;
        int rig=arr_size - 1;
        boolean ispalindrome = true;
        while(left<=rig)  
        {
            if(arr[left]!=arr[rig])
            {
                ispalindrome=false;
                break;
            }
            left++;
            rig--;
        }
        if(ispalindrome == true)
        {
            System.out.println("Yes");
        }
        else
        {
             System.out.println("No");
        }
    }
}