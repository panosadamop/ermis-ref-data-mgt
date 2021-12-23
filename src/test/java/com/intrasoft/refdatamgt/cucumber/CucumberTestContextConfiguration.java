package com.intrasoft.refdatamgt.cucumber;

import com.intrasoft.refdatamgt.ErmisReferenceDataApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = ErmisReferenceDataApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
