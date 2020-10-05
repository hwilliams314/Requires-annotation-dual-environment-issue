package com.issue;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(environments = Environment.TEST)
public class RequiresIssueTest {

    @Inject
    ApplicationContext context;

    @Test
    void testItWorksOneEnvVar() {
        assertTrue(context.containsBean(RequiresBean.class));
    }

}
