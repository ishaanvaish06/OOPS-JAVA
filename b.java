class Dog
{
    String name;
    String color;
    public Dog(String name, String color)
    {
        this.name="x";
        this.color="red";
    }
}



public class b {
    public static void main(String[] args) {
            Dog mydog=new Dog("Buddy","Brown");
            System.out.println("Dog Name: " + mydog.name + ", Color: " + mydog.color);

        
    }

    
}
