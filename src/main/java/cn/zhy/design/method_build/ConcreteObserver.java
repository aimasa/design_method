package cn.zhy.design.method_build;

public class ConcreteObserver extends Observe{
    private String name;
    private String sub;
    public ConcreteObserver(String name ,String sub) {
        this.name = name;
        this.sub = sub;
    }
    public void update(String notified) {
        System.out.println(name+"开始"+notified);
    }

}
