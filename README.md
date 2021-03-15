# **Расчёт аннуитетного платежа.**

**[Main](https://github.com/maxim-valov/CreditPaymentServise/blob/master/src/Main.java)**

```java
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
```
**[CreditCalculatorService](https://github.com/maxim-valov/CreditPaymentServise/blob/master/src/CreditCalculatorService.java)**

```java
public class CreditCalculatorService {
    public double calculate (int sum,int period,double rateYear){
        double rateMonth = rateYear / 100 / 12;
        double payment;
        payment= (sum * ((rateMonth * (Math.pow((1 + rateMonth), period)))
                        / (Math.pow((1 + rateMonth), period) - 1)));
        return payment;
    }
}
```
Пример расчёта ежемесячного платежа:

![creditcalculate_chg](https://user-images.githubusercontent.com/74412798/111163355-ceaf5200-857b-11eb-8b71-9f2ca2fdd158.PNG)
