public interface ConversationService {

    public static String welcomeMessageForUser() {
        return "Welcome, User! for english press 1 for malayalam press 2";
    }

    String welcomeMessage();

    String welcomeMessageForSystemAdmin();

    String askPin();

    String pinInvalid();

    String pinValid();
}
