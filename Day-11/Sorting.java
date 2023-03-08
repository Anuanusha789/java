import java.util.Arrays;
class Sorting
{
    public static void main(String args[])
    {
        int arr[]={12,6,25,8,34};
        int len=arr.length;
        for(int i=0;i<=len-1;i++)
        {
          int small=i;
          for(int j=i;j<len;j++)
        {
          if(arr[j]<arr[small])
          small=j;
        }
        int temp=arr[i];
        arr[i]=arr[small];
        arr[small]=temp;         
}
System.out.print(Arrays.toString(arr));
}
}