public class Modifiers_SocialService {

    
    public void provideShelter(String person) {
        System.out.println(person + " is provided with shelter.");
    }

   
    void provideFood(String person) {
        System.out.println(person + " is provided with food.");
    }

    
    private void provideClothing(String person) {
        System.out.println(person + " is provided with clothing.");
    }

    public static void main(String[] args) {
        Modifiers_SocialService service =     new Modifiers_SocialService();

        
        service.provideShelter("John");

        
        service.provideFood("Jane");
service.provideClothing("Glo");
        
    }
}
