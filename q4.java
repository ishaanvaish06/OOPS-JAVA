import java.util.Scanner;

class employee
{
    void work()
    {
        System.out.println("work in progress");
    }
    void salary()
    {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.print("default salary of employee is : ");
        System.out.println(x);
    }
}

class HR extends employee
{
    void work()
    {
        System.out.println("HR work iS FINISHED");
    }
    void addEmployee()
    {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int b=in.nextInt();
        System.out.print("new employee name is: ");
        System.out.println(a);
        System.out.print("salary of new employee is ");
        System.out.println(b);

        
    }
}

public class q4 {
    public static void main(String[] args) {
        employee x=new employee();
        HR y=new HR();
        x.work();
        x.salary();
        y.work();
        y.addEmployee();

        
    }
    
}
