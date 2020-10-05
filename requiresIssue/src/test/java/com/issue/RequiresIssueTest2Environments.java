package com.issue;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertFalse;

@MicronautTest(environments = {Environment.TEST, Environment.DEVELOPMENT})
//@MicronautTest(environments = Environment.DEVELOPMENT)
public class RequiresIssueTest2Environments {

    @Inject
    ApplicationContext context;

    @Test
    void testItWorksTwoEnvVars() {
        assertFalse(context.containsBean(RequiresBean.class));
    }

}
