import java.util.Scanner;
class B
{
public static void main (String[] args)
{
 Scanner obj=new Scanner(System.in);
 System.out.print("Enter array size");
 int n=obj.nextInt();
 int a[]=new int[n];
 System.out.println("enter array elements");
 for(int i=0;i<a.length;i++)
 {
  a[i]=obj.nextInt();
 }
 int max=0;
for(int i=0;i<a.length;i++)
{
  int c=0;
  for(int j=0;j<a.length;j++)
  {
    if(a[i]==a[j])
    c++;
  }
  if(max<c)
   max=c;
}
for(int i=0;i<a.length;i++)
{
   int c=0;
   for(int j=0;j<a.length;j++)
   {
     if(a[i]==a[j])
     c++;
   }
   if(c==max)
   {
     c=0;
     for(int j=0;j<i;j++)
     {
       if(a[i]==a[j])
       c++;
     }
      if(c==0)
         System.out.print(a[i]+" ");
   }
 }
}
}