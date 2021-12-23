package com.intrasoft.refdatamgt;

import com.intrasoft.refdatamgt.ErmisReferenceDataApp;
import com.intrasoft.refdatamgt.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ErmisReferenceDataApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
