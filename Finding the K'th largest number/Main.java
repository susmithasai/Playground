import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++)
        {
            arr[idx] = sc.nextInt();
        }
        int k = sc.nextInt();
        selectionsort(n, arr);
        System.out.println(arr[n-k]);
    }
    public static void selectionsort(int n, int arr[])
    {
        for(int start_idx = 0; start_idx <= n - 2; start_idx++)
        {
            int minidx = find_minimun_idx(start_idx, arr, n-1);
            swap(start_idx, minidx, arr);
        }
    }
     public static void swap(int start_idx, int minidx, int arr[])
     {
         int temp = arr[start_idx];
         arr[start_idx] = arr[minidx];
         arr[minidx] = temp;
     }
     public static int find_minimun_idx(int start_idx, int arr[], int end_idx)
     {
         int minidx = 0;
         if(arr[start_idx] < arr[start_idx + 1])
         {
             minidx = start_idx;
         }
         else{
             minidx = start_idx + 1;
         }
         for(int i = start_idx + 2; i <= end_idx; i++)
         {
             if(arr[minidx] > arr[i])
             {
                 minidx = i;
             }
         }
         return minidx;
     }
}

