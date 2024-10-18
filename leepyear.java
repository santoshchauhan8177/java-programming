public class leepyear
{
    public static void main(String[] args)
    {
        int year=2004;
        if(year%4==0 && year%100!=0)
        {
             System.out.println("The year is the leep year.");
        
        }else{
            System.out.println("The year is not leep year");
        }
    }
}