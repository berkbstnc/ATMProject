public class App {
    public static void main(String[] args){

        ATM atm = new ATM();

        Hesap hesap = new Hesap("berkbstnc", "12345", 1000);

        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");
    }
}
