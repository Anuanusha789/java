class Firstrepeating
{
    public static void main(String args[])
    {
        int arr[]={1,13,2,4,2,1,8,9};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[j]==arr[i]){
             System.out.println(arr[i]);
            return;
            }
            
            }  
        }  
    }
}