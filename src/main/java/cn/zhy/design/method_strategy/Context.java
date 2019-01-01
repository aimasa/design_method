package cn.zhy.design.method_strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double result() {
        return strategy.acceptCash();
    }
}
