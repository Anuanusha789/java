import java.util.Scanner;
class Cube
{
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value:");
        int n=sc.nextInt();
        int cube;
        for(int i=1;i<=n;i++)
        {
            cube=i*i*i;
            System.out.println("the cube of the "+i+" is"+cube);
            
        }
    }
}