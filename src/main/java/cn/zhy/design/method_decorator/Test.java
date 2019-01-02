/*
 * Copyright © 2019 signit.cn. All rights reserved.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package cn.zhy.design.method_decorator;

/**
 * (必填，请用一句话描述此类型表示什么).
 * </p>
 * (可填，此类型设计的详细描述).
 *
 * @author zhy
 * @since 1.0.1
 */
public class Test {
    public static void main(String[] args) {
        ConcreteComponent person = new ConcreteComponent();
//        person.operation();
        
        ShoesComponent shoesComponent = new ShoesComponent(40);
        shoesComponent.setComponent(person);
//        shoesComponent.operation();
//        shoesComponent.setComponent(person);
        ClothesComponent clothesComponent = new ClothesComponent(20);
        clothesComponent.setComponent(shoesComponent);
        clothesComponent.operation();
    }
}
