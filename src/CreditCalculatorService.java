public class CreditCalculatorService {
    public double calculate (int sum,int period,double rateYear){
        double rateMonth = rateYear / 100 / 12;

        double payment;
        payment= (sum * ((rateMonth * (Math.pow((1 + rateMonth), period)))
                        / (Math.pow((1 + rateMonth), period) - 1)));
        return payment;
    }
}