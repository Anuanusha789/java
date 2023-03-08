import java.util.Scanner;
public class Nnatural
{
    public static void main(String args[])
    {int i,n,sum=0;{
        Scanner sc=new Scanner(System.in);
        System.out.println("input number:");
        n=sc.nextInt();
    }
    System.out.println(" n natural numbers:");
    for(i=1;i<=n;i++)
    {
        System.out.println(i);
        sum+=i;

    }
    System.out.println("the sum of n natural numbers is:"+sum);
    }
}