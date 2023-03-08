import java.util.Scanner;
class Sumofodd
{
    public static void main(String args[])
    {
        int sum=0;
        System.out.println("enter the n value:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
         if(i%2==1)
        {System.out.println(i);
            sum=sum+i;

        }}
        System.out.println("the sum of n odd numbers is:"+sum);
    }}








    


