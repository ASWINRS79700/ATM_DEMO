import java.util.Scanner;

public class Atm {

    public Atm() {
    }    

    public int start() {
        Scanner scanner = new Scanner(System.in);
        ConversationService conversationService;
        System.out.println(ConversationService.welcomeMessageForUser());
        int languageChoice = scanner.nextInt();
        languageChoice = validateLanguageCho(languageChoice);
        if(languageChoice == 1) {
            conversationService = new EnglishConservationServiceImplementation();
        } else{
            conversationService = new MalayalamConversationServiceImplementation();
        }
        System.out.println(conversationService.welcomeMessage());
        System.out.println(conversationService.askPin());

        int enteredPin = scanner.nextInt();
        validatePin(enteredPin,0);
        System.err.println(conversationService.pinValid());
        System.exit(enteredPin);
        return 1;
    }

    public int validateLanguageCho(int n){
        if(n==1 || n==2){
            return n;
        } 
        System.out.println("Invalid choice. Please select again. "); 
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        return validateLanguageCho(n);
        }   

    public int validatePin(int pin, int attempts){
        if(pin==1234){
            return pin;
        }
        attempts++;
        if(attempts>=3){
            System.out.println("Too many invalid attempts. Exiting.");
           return 1;
        }   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Invalid PIN. Please enter again. "); 
        pin=scanner.nextInt();
        return validatePin(pin,attempts);
        }
}
