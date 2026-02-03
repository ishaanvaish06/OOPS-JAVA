class student
{

    int id;
    String name;
    int score;

    public student(int id, String name)
    {
        this.id=id;
        this.name=name;
        this.score=0;
    }
}


public class d {   
    public static void main(String[] args) {
        student s1=new student(101,"Alice");
        System.out.println("Student ID: " + s1.id + ", Name: " + s1.name + ", Score: " + s1.score);
        
    }
    
}
