public class Product {

    //instance variables
    String productName;
    int price;

    //static variable
    static int totalProducts=0;
    
    Product(String productName, int price){
        this.productName=productName;
        this.price=price;
        Product.totalProducts+=1;  //static variable are accessed using class name
    }

    public void displayProductDetails(){
        System.out.println("product name is:"+productName);
        System.out.println("product price is:"+price);
    }

    public static int displayTotalProducts(){
        return totalProducts;
    }

    public static void main(String[] args){
        Product obj=new Product("soap", 100);
        obj.displayProductDetails();
        System.out.println();
        Product obj2=new Product("perfume", 500);
        obj2.displayProductDetails();
        System.out.println();
        System.out.println("total products created: "+Product.displayTotalProducts());

    }
}
