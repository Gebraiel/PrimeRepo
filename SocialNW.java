import java.util.Scanner;
class SocialNW
{
  public static void main(String args[])
  {
    Scanner input= new Scanner (System.in);
    boolean flag = true ; 
    int num = input.nextInt();
    if(num == 0|| num==1)
      flag =false;
    for(int i=2;i<num;i++)
      {
        if(num%i ==0)
        {
          flag = false;
        }
      }
    if(flag == true)
      System.out.println("Number is prime");
    else
      System.out.println("Number isn't prime");
  }
}