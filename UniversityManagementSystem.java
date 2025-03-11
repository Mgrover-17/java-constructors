class Student {

    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int rollNumber, String name, double cgpa){
        this.rollNumber=rollNumber;
        this.name=name;
        this.cgpa=cgpa;
    }

    public double getCgpa(){
        return cgpa;
    }

    // Public method to modify CGPA (setter)
    public void setCGPA(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) { // Ensuring CGPA is within valid range
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value. Must be between 0.0 and 10.0.");
        }
    }

    public void displayStudentDetails(){
        System.out.println(rollNumber);
        System.out.println(name);
        System.out.println(cgpa);
    }       
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA); // Call superclass constructor as cgpa is private
        this.researchTopic = researchTopic;
    }

    // Method to display student details including protected member
    public void displayPostgraduateInfo() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Public member accessible
        System.out.println("Name: " + name); // Protected member accessible
        System.out.println("Research Topic: " + researchTopic);
    }
}


public class UniversityManagementSystem{
    public static void main(String[] args){
       Student obj=new Student(862, "manvi", 8.99);
       obj.displayStudentDetails();

    //    obj.name = "Naman";
    //    obj.displayStudentDetails();

        // obj.cgpa = 5.6;    //cgpa is private so cannot be accessed
        // obj.displayStudentDetails();

        obj.setCGPA(9.5);
        System.out.println("updated cgpa:"+obj.getCgpa());

        PostgraduateStudent pgStudent = new PostgraduateStudent(913, "naman", 9.4, "Java");
        pgStudent.displayPostgraduateInfo();
    }
}