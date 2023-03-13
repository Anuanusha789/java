class BinarySearch
{
    public static void main(String args[])
    {
        int arr[]={2,6,10,15,19,24,29,30,38,44,49,50};
        int x=20,low=0,end=arr.length-1;
         while(low<=end)
        {
            int mid=(low+end)/2;
            if(arr[mid]==x)
            {
                System.out.print("element found");
                return;
            }
           else if(arr[mid]>x)
         {  end=mid-1;
         }
         else if(arr[mid]<x){
            low=mid+1;
         }}
         System.out.print("element not found");
            }
}