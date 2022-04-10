package com.blackpig.springframework.beans.factory.config;

/**
 * 接口:定义通过bean名称获取bean的方法
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
