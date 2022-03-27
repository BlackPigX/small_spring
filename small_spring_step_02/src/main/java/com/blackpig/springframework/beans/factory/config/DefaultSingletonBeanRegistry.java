package com.blackpig.springframework.beans.factory.config;

import java.util.HashMap;
import java.util.Map;

/**
 * 实现了SingletonBeanRegistry中的getSingleton方法
 * 定义一个portected方法addSingleton()
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry{
    private Map<String,Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        //通过beanName从singletonObjects获取object
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName,Object singletonObject){
        //将object注册到singletonObjects
        singletonObjects.put(beanName,singletonObject);
    }

}
