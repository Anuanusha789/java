class Minmax
{
    public static void main(String args[])
    {
        int arr[]={12,6,87,54,90,23};
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(var a:arr){
        if(a<min)
            min=a;
        if(a>max)
            max=a;
        }
            System.out.println("max:"+max+    "min:"+min);
        
    }
}
            
        
        
        
            
        
    
