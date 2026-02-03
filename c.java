class book
{
    String title;
    String author;
    int price;
    public book(String title, String author, int price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
}

public class c {
    public static void main(String[] args) {
        book b1=new book("Java Programming","John Doe",500);
        System.out.println("Book Title: " + b1.title + ", Author: " + b1.author + ", Price: " + b1.price);
    }
    
}
