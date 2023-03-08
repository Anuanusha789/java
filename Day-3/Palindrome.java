class Palindrome
{
public static void main(String args[])
{
int n,sum,rem;
n=121;sum=0;
int m=n;
while(m!=0)
{
rem=m%10;
sum=(sum*10)+rem;
m=m/10;
}
if(sum==n)
System.out.println("palindrome:");
else
System.out.println("not a palindrome:");
}
}