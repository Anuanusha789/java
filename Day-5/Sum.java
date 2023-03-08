import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {int evensum=0,oddsum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        
            if(i%2==0){
            evensum=evensum+i;}
             

            else
            oddsum=oddsum+i;
            System.out.println("the sum of even numbers is:"+evensum);
        
        System.out.println("the sum of odd numbers is:"+oddsum);
    }
}