package com.sethanantp.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
