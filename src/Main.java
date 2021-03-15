public class Main {
    public static void main(String[] args) {
        CreditCalculatorService service = new CreditCalculatorService();
        int sum = 1_000_000;
        int period = 36;
        double rateYear = 9.99;
        double payment = service.calculate(sum, period, rateYear);
        System.out.println(payment);
    }
}