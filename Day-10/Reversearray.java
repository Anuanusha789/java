class Reversearray
{
    public static void main(String args[])
    {
        int arr[]={3,5,6,7,8};
        System.out.println(" the original array:");

        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]);
    }
    System.out.println();
    System.out.println(" the new array:");
for(int i=arr.length-1;i>=0;i--)
        System.out.print(arr[i]);
    }
}

