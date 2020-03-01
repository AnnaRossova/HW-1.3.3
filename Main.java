public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double rate = 9.99 / 100 / 12;
        int creditTerm = 12;
        int creditAmount = 1000000;
        double annuityCreditTerm12 = service.calculate(rate, creditTerm, creditAmount);
        System.out.println(annuityCreditTerm12);

        double annuityCreditTerm24 = service.calculate(rate, 24, creditAmount);
        System.out.println(annuityCreditTerm24);

        double annuityCreditTerm36 = service.calculate(rate, 36, creditAmount);
        System.out.println(annuityCreditTerm36);
    }
}
