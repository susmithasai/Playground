import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
  int max;
for(int ind=0;ind<n;ind++)
{
list[ind] = sc.nextInt();
}
if(list[0]>list[1])
{
  max=0;
}
  else
  {
    max=1;
  }
  for(int ind=2;ind<=n-1;ind++)
  {
  if(list[max]<list[ind])
  {
    max=ind;
  }
    }
     System.out.println(max);
     }
     }
     