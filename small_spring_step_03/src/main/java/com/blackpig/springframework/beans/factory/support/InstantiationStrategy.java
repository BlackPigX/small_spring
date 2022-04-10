package com.blackpig.springframework.beans.factory.support;

import com.blackpig.springframework.beans.factory.BeansException;
import com.blackpig.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String name, Constructor ctor,Object[] args) throws BeansException;
}
