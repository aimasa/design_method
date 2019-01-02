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

import java.util.jar.Attributes.Name;

/**
 * (必填，请用一句话描述此类型表示什么).
 * </p>
 * (可填，此类型设计的详细描述).
 *
 * @author zhy
 * @since 1.0.1
 */
public class ConcreteComponent extends Component{

    /**
     * (必填，请用一句话描述此重写方法的作用).
     *
     * @throws (可填，此重写方法需要抛出的异常描述，格式: "@throws 异常类名 描述信息").
     * @see cn.zhy.design.method_decorator.Component#operation().
     * @author zhy
     * @since (可填，operation方法重写开始的版本，应与定义时的pom.xml版本一致)
     */
    private String Name = "NANA";
    @Override
    public void operation() {
        // TODO Auto-generated method stub
        
        System.out.println("我是NANA");
        
    }

}
