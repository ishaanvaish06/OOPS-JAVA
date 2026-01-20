import java.util.Scanner;

class shape
{
    void getarea()
    {
        System.out.println("this will show area of shape");
    }
}

class rectangle extends shape
{
    void getarea()
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(a*b);
        in.close();
    }
}


public class q3 {
    public static void main(String[] args) {
        shape obj1=new shape();
        rectangle obj2=new rectangle();
        obj1.getarea();
        obj2.getarea();
        
    }
    
}
