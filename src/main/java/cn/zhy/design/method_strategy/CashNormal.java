package cn.zhy.design.method_strategy;

public class CashNormal extends Strategy{
    private double money;  
    public CashNormal(double money) {
        // TODO Auto-generated constructor stub
        this.money = money;
    }
    @Override
    public double acceptCash() {
        // TODO Auto-generated method stub
        return money;
    }
    
}
