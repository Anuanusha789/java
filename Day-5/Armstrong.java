
class Armstrong
{
    public static void main(String args[])
    {
        
        
     for(int i=1;i<=500;i++){
      int result=i;  int sum=0,rem;
      while(result>0){
      
        rem=result%10;

        
        sum=sum+(rem*rem*rem);
        result =result/10;}
        if(sum==i)
        System.out.println(i);}



    }
}
