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
public class ShoesComponent extends Decorator{
    private int size;
    public ShoesComponent(int size){
        super();
        this.size = size;
    }
        public void operation(){
            this.component.operation();
            System.out.println("穿上"+size+"的鞋子");
        }
    }
