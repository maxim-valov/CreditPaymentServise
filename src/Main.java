public class Main {
    public static void main(String[] args) {
        CreditCalculatorService service = new CreditCalculatorService();
        int sum = 1_000_000;
        double rateYear = 9.99;
        int period_1 = 12;
        int period_2 = 24;
        int period_3 = 36;
        double payment1year= service.calculate(sum, period_1, rateYear);
        System.out.printf("Ежемесячный платёж срок 12 месяцев: %.0f \n", payment1year);

        double payment2year= service.calculate(sum, period_2, rateYear);
        System.out.printf("Ежемесячный платёж срок 24 месяцев: %.0f \n", payment2year);

        double payment3year= service.calculate(sum, period_3, rateYear);
        System.out.printf("Ежемесячный платёж срок 36 месяцев: %.0f", payment3year);
    }
}