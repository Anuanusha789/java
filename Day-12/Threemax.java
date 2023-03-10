class Threemax
{
    public static void main(String args[])
    {
        int arr[]={12,5,23,40,15,35};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max1){
            max3=max2;
            max2=max1;
            max1=arr[i];
        }
        else if(arr[i]>max2)
        {
        max3=max2;
        max2=arr[i];
        }
        else if(arr[i]>max3)
        max3=arr[i];
        
         }
         System.out.print(max1+" "+max2+" "+max3);
}
}