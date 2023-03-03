import java.util.Scanner;
class Tables
{
    public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=10;i++){
        for(int j=1;j<n;j++){
            System.out.print(j+"*"+i+"="+(j*i)+" ");
        }
        System.out.println();
    }

}}