class Missingelement
{
    public static void main(String args[])
    {
        int n=6;
        int arr[]={1,2,5,4,6};
        int sum=n*(n+1)/2;
         int actualsum=0;
        for(int i=0;i<arr.length;i++)
          actualsum +=arr[i];
         System.out.print(sum-actualsum);
    }
}