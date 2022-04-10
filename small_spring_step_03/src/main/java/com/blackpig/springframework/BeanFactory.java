package com.blackpig.springframework;

import com.blackpig.springframework.beans.factory.BeansException;
import com.blackpig.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 接口:定义
 */
public interface BeanFactory {
    Object getBean(String name);

    Object getBean(String name,Object... args) throws BeansException;
}
