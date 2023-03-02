class Fibonacci
{
    public static void main(String args[])
    {
        int n=8,ft=0,st=1;
        for(int i=0;i<=n;i++){
            System.out.println(ft+",");
        int nt=ft+st;
        ft=st;
        st=nt;
    }
}
}