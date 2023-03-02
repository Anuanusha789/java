class Factorial
{
    public static void main(String args[])
    {
        int n=5;
        long f=1;
        while(n!=0)
        {
        f=f*(n);
        n--;}
        System.out.println(f);
    }
}