class PassByValue
{
    public static void main(String args[])
    {
        int a=6;
        System.out.println(a);
        remain(a);
        System.out.println(a);
    }
        static void remain(int a)
        {
        a++;
        System.out.println(a);
    }
}