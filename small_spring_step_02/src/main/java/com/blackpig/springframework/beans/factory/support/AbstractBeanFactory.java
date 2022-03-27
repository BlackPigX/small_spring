package com.blackpig.springframework.beans.factory.support;

import com.blackpig.springframework.BeanFactory;
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
        Object bean = getSingleton(name);
        if (bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition);


}
