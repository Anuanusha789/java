import java.util.Scanner;
class Hcf{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=1;
        for(int i=1;i<=Math.min(m,n);i++)
        if(n%i==0&&m%i==0){
            a=i;
        }
        

     System.out.println(a);
}
}