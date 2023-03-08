import java.util.Arrays;
class Count
{
    public static void main(String args[])
    {
        int arr[]={1,4,5,2,4,3,0,2,2,4,3};
        int count=0,x;
        x=2;
        int len=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<len;i++)
        {
           if(arr[i]==x)
           count++;
            if(arr[i]>x)
        break;
    } 
    System.out.print(count);
}
}
