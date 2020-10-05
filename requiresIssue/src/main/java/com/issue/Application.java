package com.issue;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = Micronaut.run(Application.class, args);
        boolean itsThere = context.containsBean(RequiresBean.class);
        System.out.println("The context is there: "+ itsThere);
    }
}
