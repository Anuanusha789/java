import java.util.Arrays;
class Maxmin
{
    public static void main(String args[])
    {
        int arr[]={23,20,35,14,9,43,6,16};
        int k=2,len=arr.length;
        Arrays.sort(arr);
        System.out.println(arr[len-2]);
        System.out.println(arr[k-1]);
    }
}