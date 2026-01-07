public class MalayalamConversationServiceImplementation implements ConversationService {

    @Override
    public String welcomeMessage() {
        return "എടിഎമ്മിലേക്ക് സ്വാഗതം!";
    }

    @Override
    public String askPin() {
        return "ദയവായി നിങ്ങളുടെ PIN നൽകുക:";
    }

    @Override
    public String pinInvalid() {
        return "നിങ്ങൾ നൽകിയ PIN അസാധുവാണ്. ദയവായി വീണ്ടും ശ്രമിക്കുക.";
    }

    @Override
    public String welcomeMessageForSystemAdmin() {
        return "സ്വാഗതം, സിസ്റ്റം അഡ്മിനിസ്ട്രേറ്റർ!";
    }
    @Override
    public String pinValid() {  
        return "നിങ്ങൾ നൽകിയ PIN സാധുവാണ്.";
    }

   
}
