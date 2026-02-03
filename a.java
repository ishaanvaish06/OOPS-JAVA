class Cat
{
    String name;
    int age;

    public void cat(String name, int age)
    {
        this.name="UNKNOWN";
        this.age=0;
    }
    
}


public class a {
    public static void main(String[] args) {
        Cat c1=new Cat();
        System.out.println("Cat 1: Name = " + c1.name + ", Age = " + c1.age);
    }
    
    
}
