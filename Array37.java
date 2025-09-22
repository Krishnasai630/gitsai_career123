oimport java.util.Scanner;
class B
{
public static void main (String[] args)
{
 Scanner obj=new Scanner(System.in);
 int n=obj.nextInt();
 String bin="";
 while(n>0)
 {
  int r=n%2;
  bin=r+bin;
  n/=2;
 }
int s=bin.length();
int a[]=new int[s];
for(int i=0;i<s;i++)
{
 if(bin.charAt(i)=='1')
 a[i]=1;
 else
 a[i]=0;
}
for(int i=0;i<s;i++)
System.out.print(a[i]);
}
}