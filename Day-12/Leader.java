class Leader
{
    public static void main(String args[])
    {
        int arr[]={12,3,14,23,9,6,2,15};
        
        for(int i=0;i<arr.length;i++)
        
        {
            int c=0;
            for(int j=i+1;j<arr.length;j++)
          {  if(arr[i]<arr[j])
            c++;
            
        }
        if(c==0)
        System.out.println(arr[i]);    }
}
}
