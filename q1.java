class animal
{
    void makesound()
    {
        System.out.println("animal sound");
    }
}
class cat extends animal
{
    void makesound()
    {
        System.out.println("bark");
    }
}

class q1
{
    public static void main(String[] args) {
        
    
    
        animal obj=new animal();
        cat obj1=new cat();

        obj.makesound();
        obj1.makesound();

    }
}