public class BookDetails{
    String title;
    String author;
    double price;

    //paramtereized constructor
    BookDetails(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    //default constructor
    BookDetails(){
    this.title="Ikigai";
    this.author="Marllenus";
    this.price=150.75;
    }

    public void display(){
        System.out.println("title:"+title);
        System.out.println("author:"+author);
        System.out.println("price:"+price);
    }

    public static void main(String[] args){
        BookDetails obj=new BookDetails("Wish I could tell you","Durjoy Dutta", 200);
        BookDetails obj1=new BookDetails();
        System.out.println("using parameterized constructor:");
        obj.display();
        System.out.println("\nusing default constructor:");
        obj1.display();
    }


}