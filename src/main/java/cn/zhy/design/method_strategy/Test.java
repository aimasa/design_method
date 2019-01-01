package cn.zhy.design.method_strategy;

public class Test {
    public static void main(String[] args) {
        Context moneyContext = new Context(new CashNormal(100));
        System.out.println("需要支付的钱："+moneyContext.result());
        Context moneyContext1 = new Context(new CashRebate(100, 0.5));
        System.out.println("需要支付的钱："+moneyContext1.result());
        Context moneyContext2 = new Context(new CashReturn(300, 100));
        System.out.println("需要支付的钱："+moneyContext2.result());
    }
    
}
