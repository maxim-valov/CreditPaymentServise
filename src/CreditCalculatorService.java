public class CreditCalculatorService {
    public double calculate (int sum,int period,double rateYear){
        double rateMont = rateYear / 100 / 12;
        double payment = (sum * ((rateMont * (Math.pow((1 + rateMont), period)))
                        / (Math.pow((1 + rateMont), period) - 1)));
        return payment;
    }

}