package com.issue;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;

import javax.inject.Singleton;

@Singleton
//@Requires(env="test")
@Requires(env=Environment.TEST)
public class RequiresBean {

}
