import java.util.Arrays;
class Cyclicbyone
{
    public static void main(String args[])
    {
        int arr[]={2,4,5,3,1};
        int n=arr.length,backup=arr[n-1];
          for(int i=n-2;i>=0;i--)
          arr[i+1]=arr[i];
          arr[0]=backup;
          System.out.print(Arrays.toString(arr));
    }
    }

