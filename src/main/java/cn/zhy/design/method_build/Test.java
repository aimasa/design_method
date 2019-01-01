package cn.zhy.design.method_build;

public class Test {
    public static void main(String[] args) {
        ConcreteObserver concreteObserver = new ConcreteObserver("赵高", "打游戏");
    ConcreteObserver1 concreteObserver1 = new ConcreteObserver1("王老五", "摸麻将");
    Publish publish = new Publish("翻开书本");
    publish.addObserves(concreteObserver);
    publish.addObserves(concreteObserver1);
    publish.notified();
    }
    
}
