import java.util.Arrays;
class BubbleSort
{
    public static void main(String args[])
    {
        int arr[]={9,3,5,10,4,2,8};
        int n=arr.length,temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;}
        }}
        System.out.print(Arrays.toString(arr));
        
    }
}