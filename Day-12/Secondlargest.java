class Secondlargest
{
    public static void main(String args[])
    {
        int arr[]={21,8,14,6,2};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
          int c=0,n=arr.length;
          for(int i=0;i<n;i++)
            {
                if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
                }
                else if(arr[i]>max2)
                max2=arr[i];
            
          
            
          }
            System.out.println(max2);
       
    }
}
