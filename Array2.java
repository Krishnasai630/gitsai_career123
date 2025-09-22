import java.util.Scanner;
class S
{
public static void main(String[] args)
{
 Scanner obj=new Scanner(System.in);
 System.out.print("enter array size");
 int k=obj.nextInt();
 int a[]=new int[k];
 System.out.print("Enter array elements");
 for(int i=0;i<a.length;i++)
 {
  a[i]=obj.nextInt();
 }
 System.out.print("Given array values are");
 for(int i=0;i<a.length;i++)
 {
  System.out.print(a[i]);
 }
}
}
 