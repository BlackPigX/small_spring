package com.blackpig.springframework.beans.factory.support;

import com.blackpig.springframework.BeanFactory;
import com.blackpig.springframework.beans.factory.BeansException;
import com.blackpig.springframework.beans.factory.config.BeanDefinition;
import com.blackpig.springframework.beans.factory.config.DefaultSingletonBeanRegistry;

/**
 * 继承了类DefaultSingletonBeanRegistry
 *
 * 实现接口BeanFactory
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) {

        return doGetBean(name,null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;



}
