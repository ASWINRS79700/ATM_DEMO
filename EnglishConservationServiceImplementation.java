public class EnglishConservationServiceImplementation implements ConversationService {
    @Override
    public String welcomeMessage() {
        return "Welcome to the Conservation Service!";
    }

    @Override
    public String askPin() {
        return "Please enter your PIN:";
    }

    @Override
    public String pinInvalid() {
        return "The PIN you entered is invalid. Please try again.";
    }

    @Override
    public String welcomeMessageForSystemAdmin() {
        return "Welcome, System Administrator!";
    }
    @Override
    public String pinValid() {
        return "The PIN you entered is valid.";
    }
}
