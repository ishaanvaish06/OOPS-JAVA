class vehicle
{
    void drive()
    {
        System.out.println("vehicle drive method");
    }
}

class car extends vehicle
{
    void drive()
    {
        System.out.println("car drive method");
    }
}




class q2 {
    public static void main(String[] args) {
        vehicle obj1=new vehicle();
        car obj2=new car();
        obj1.drive();
        obj2.drive();
        
    }
}
