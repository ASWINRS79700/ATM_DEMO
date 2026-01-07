public class Application {

    public static void main(String[] args) {
        Atm atm = new Atm();
        int n=atm.start();
        while(n==1){
            n=atm.start();
        }
    }
}
