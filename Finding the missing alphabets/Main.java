import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        int freq[] = new int[26]; 
        for(int index=0;index<26;index++){
            freq[index] = 0;
        }
        for(int index=0;index<str_len;index++)
        {
            if(sb.charAt(index)>='A'&&sb.charAt(index)<='Z')
            {
                freq[sb.charAt(index)-'A']++;
            }
            if(sb.charAt(index)>='a'&&sb.charAt(index)<='z')
            {
                freq[sb.charAt(index) - 'a']++;
            }  
        }
        for(int i = 0;i<= 25;i++)
        {
            if(freq[i]==0)
           {
                char missing_alphabet = (char)(i + 'a');
                System.out.print(missing_alphabet + " ");
            }
        }
    }
}