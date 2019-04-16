import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        reverse_string(sb, 0, str_len - 1);
        int start_index= 0;
        for(int index=0; index<str_len;index++)
        {
            if(sb.charAt(index) == ' ')
            {
                
                reverse_string(sb, start_index, index- 1);
                start_index = index+ 1;
            }
            else if(index== (str_len - 1))
            {
                reverse_string(sb, start_index, index);
                start_index= index+ 1;
            }
        }
        System.out.print(sb);
    }
    public static void reverse_string(StringBuilder sb, int start_index, int end_index)
    {
        int end = end_index;
        int front = start_index;
        while(front < end)
        {
            char tmp_ch = sb.charAt(front);
            sb.setCharAt(front, sb.charAt(end));
            sb.setCharAt(end, tmp_ch);
            front++;
            end--;
        }
    }
}