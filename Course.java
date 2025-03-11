public class Course {
    String courseName;
    int duration;
    int fee;

    static String instituteName="bridgelabz";

    Course(String courseName, int duration, int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println();
    }

    public static void updateInstituteName(String newName){
        instituteName=newName;
    }

    public static void main(String[] args) {
        Course obj=new Course("Java Programming", 6, 500);
        System.out.println("Course Details Before Updating Institute Name:");
        obj.displayCourseDetails();

        Course.updateInstituteName("unacademy");

        System.out.println("Course Details After Updating Institute Name:");
        obj.displayCourseDetails();
    }
}
