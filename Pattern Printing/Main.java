import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        for(int i= 1;i<= row;i++)
        {
            for(int j=column; j>column-i;j--)
            {
                System.out.print(j);
            }
            for(int j=1;j<=column-i;j++)
            {
                System.out.print(row-i+1);
            }
            System.out.println();
        }
    }
}