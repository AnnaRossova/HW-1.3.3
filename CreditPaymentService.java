public class CreditPaymentService {
    public double calculate(double rate, int creditTerm, int creditAmount) {
        double rate1 = rate + 1;
        double rate2 = Math.pow(rate1, creditTerm);
        int annuity = (int) ((int) creditAmount * ((rate * rate2) / (rate2 - 1)));
        return annuity;
    }
}

