class Armstrong
{
    public static void main(String args[])
    {
    int num=153,originalNumber,rem,res=0;
    originalNumber =num;
while(num>0) 
    {
        rem=num%10;
        num=num/10;
        res=res+rem*rem*rem;
    }
        
        if(res==originalNumber)
        {
        System.out.println(num +"is armstrong num");
        }
        else
        {
        System.out.println(num +"is not a armstrong num");
        }
    }
}