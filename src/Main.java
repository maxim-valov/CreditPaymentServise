public class Main {
    public static void main(String[] args) {
        CreditCalculatorService service = new CreditCalculatorService();
        int sum = 1_000_000;
        double rateYear = 9.99;
        double payment1year= service.calculate(sum, 12, rateYear);
        System.out.printf("Ежемесячный платёж срок 12 месяцев: %.0f \n", payment1year);

        double payment2year= service.calculate(sum, 24, rateYear);
        System.out.printf("Ежемесячный платёж срок 24 месяцев: %.0f \n", payment2year);

        double payment3year= service.calculate(sum, 36, rateYear);
        System.out.printf("Ежемесячный платёж срок 36 месяцев: %.0f", payment3year);
    }
}