package cn.zhy.design.method_strategy;

public class CashRebate extends Strategy {
    private double money;
    private double moneyRebate;

    public CashRebate(double money, double moneyRebate) {
        // TODO Auto-generated constructor stub
        this.money = money;
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash() {
        return money * moneyRebate;
    }

}
