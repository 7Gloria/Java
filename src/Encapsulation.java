public class Encapsulation {
    private String name;
    private static int age;
    private double gpa;

    // Constructor
    public Encapsulation(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
   
    // Getter methods
    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter methods
    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static void main(String[] args) {
    	Encapsulation student = new Encapsulation("John Doe",25,7);

        // Accessing encapsulated data
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + getAge());
        System.out.println("GPA: " + student.getGpa());

        // Modifying data using setters
        student.setAge(21);
        student.setGpa(3.8);

        // Accessing modified data
        System.out.println("\nUpdated Age: " + getAge());
        System.out.println("Updated GPA: " + student.getGpa());
    }
}

