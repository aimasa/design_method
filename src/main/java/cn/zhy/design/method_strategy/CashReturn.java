package cn.zhy.design.method_strategy;

public class CashReturn extends Strategy {
    private double money;
    private double moneyReturn;

    public CashReturn(double money, double moneyReturn) {
        // TODO Auto-generated constructor stub
        this.money = money;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash() {
        double result = money;
        if (money > moneyReturn) {
            result = money - moneyReturn;
        }
        return result;
    }

}
