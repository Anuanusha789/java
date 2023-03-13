class Pairofnum
{
    public static void main(String args[])
    {
        int x=4;
        int arr[]={1,3,2,0,4};

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]+arr[j]==x)
            System.out.println(arr[i]+","+arr[j]);
        }    
    }  
}