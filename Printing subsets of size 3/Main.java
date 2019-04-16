import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int ind= 0; ind<= arr_size - 1; ind++){
           arr[ind] = sc.nextInt();
       }
       subsets(arr_size, arr);
    }
    public static void subsets(int arr_size, int arr[])
    {
        for(int ind1 = 0; ind1 <= arr_size - 2; ind1++)
        {
            for(int ind2 = ind1 + 1; ind2 <= arr_size - 1; ind2++)
            {
                for(int index3 = ind2 + 1; index3 <= arr_size - 1; index3++)
                {
                    System.out.print("(" + arr[ind1] + "," + " " + arr[ind2] + "," + " " + arr[index3] + ")" + " ");
                }
            }
            System.out.println();
        }
    }
}