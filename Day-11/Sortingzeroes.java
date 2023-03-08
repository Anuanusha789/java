import java.util.Arrays;
class Sortingzeroes
{
    public static void main(String args[])
    {
        int arr[]={1,0,0,2,1,1,0,0,0,1,1,2,2};
        int zeroes=0,ones=0,twos=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            zeroes++;
            else if(arr[i]==1)
            ones++;
            else
            twos++;

        }
        for(int i=0;i<zeroes;i++)
        arr[i]=0;
        for(int i=zeroes;i<zeroes+ones;i++)
        arr[i]=1;
        for(int i=zeroes+ones;i<arr.length;i++)
        arr[i]=2;
        System.out.print(Arrays.toString(arr));
        }
}