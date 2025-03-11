public class PersonCopyConstructor {
    String name;
    int age;

    // Constructor to initialize a Person object
    PersonCopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor - creates a new object with the same attributes
    PersonCopyConstructor(PersonCopyConstructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create original person
        PersonCopyConstructor p1 = new PersonCopyConstructor("Manvi", 21);
        System.out.println("Original Person:");
        p1.display();

        // Create a copy using the copy constructor
        PersonCopyConstructor p2 = new PersonCopyConstructor(p1);
        System.out.println("Cloned Person:");
        p2.display();
    }
}
