import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int index= 0;index<=n-1;index++)
        {
            arr[index]=sc.nextInt();
        }
        int missingvalue = 0;
        for(int value=1;value<=n;value++)
        {
            boolean isfound=false;
            for(int index=0;index<=n-1;index++)
            {
                if(arr[index]==value)
                {
                    isfound = true;
                    break;
                }
            }
            if(isfound == false)
            {
                missingvalue=value;
                break;
            }
        }
        System.out.print(missingvalue);
    }
}

