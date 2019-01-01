package cn.zhy.method_simplefactory;

public class Test {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.createOPeration("-").calcu(1, 2));
    }
}
