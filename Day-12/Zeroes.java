import java.util.Arrays;
class Zeroes
{
    public static void main(String args[])
    {
        int arr[]={12,0,4,3,0,0,1,0};
        int temp=0,n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i] !=0)
              for(int j=0;j<i;j++)
            {
                if(arr[j]==0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;}
             
            }
        
         }
         System.out.print(Arrays.toString(arr));
}
}
