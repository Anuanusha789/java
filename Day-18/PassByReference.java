import java.util.Arrays;
class PassByReference
{
    public static void main(String args[])
    {
        int arr[]={5,6,7};
        System.out.println(Arrays.toString(arr));
        remain(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void remain(int arr2[])
    {
        for(int i=0;i<arr2.length;i++)
        arr2[i]=arr2[i]+1;
        System.out.println(Arrays.toString(arr2));
    }
    }
