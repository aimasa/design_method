package cn.zhy.design.method_build;

public class ConcreteObserver1 extends Observe{
    private String name ;
    private String sub;
    public ConcreteObserver1(String name,String sub) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.sub = sub;
    }
    @Override
    public void update(String notified) {
        // TODO Auto-generated method stub
        System.out.println(name+"开始"+notified);
    }
}
