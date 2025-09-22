import java.util.Scanner;
class M
{
public static void main (String[] args)
{
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter array size");
 int n=obj.nextInt();
 int a[]=new int[n];
 System.out.println("enter array elements");
 int sum=0;
 float v=0;
 for(int i=0;i<a.length;i++)
 {
  a[i]=obj.nextInt();
 }
 for(int i=0;i<a.length;i++)
 {
      int c=0;
    for(int j=1;j<=a[i];j++)
    {
      if(a[i]%j==0)
      {
        c++;
      }
    }
   if(c==2)
   {
    sum=sum+a[i];
    v++;
   }
 }
  System.out.print("average of all prime numbers from array is");
  System.out.print(sum/v);
}
}