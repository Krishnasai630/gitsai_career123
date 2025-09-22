//3.
import java.util.Scanner;
class C
{
  public static void main(String []args)
  {
    Scanner obj=new Scanner(System.in);
    String str=obj.nextLine();
    String str1="";
    for(int i=str.length()-1;i>=0;i--)
    {
      str1=str1+str.charAt(i);
    }
     if(str1.equals(str))
     System.out.print("given string is palindrome");
     else
     System.out.print("given string is not a palindrome");
  }
}


