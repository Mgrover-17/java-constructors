public class Circle {
    double radius;

    Circle(double radius){
        this.radius=radius;
        System.out.println("parameterized constructor called");
    }
    Circle(){
        System.out.println("default constructor called");
    }

    public static void main(String[] args) {
        //Circle obj=new Circle();
        Circle obj1=new Circle(5.5);
    }
}
