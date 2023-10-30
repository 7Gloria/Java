
public class Methodoverloading {
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void greet(String name, String role) {
        System.out.println("Hello, " + role + " " + name + "!");
    }

   

    public void greet(String name, String role, String petName) {
        System.out.println("Hello, " + role + " " + name + " and " + petName + "!");
    }

    public static void main(String[] args) {
    	Methodoverloading greeter = new Methodoverloading();

        greeter.greet("John");
        greeter.greet("Dr. Bro", "Doctor");
        greeter.greet("Glo", "Engineer", "Ria");
    }
}
