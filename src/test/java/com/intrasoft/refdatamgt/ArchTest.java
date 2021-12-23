package com.intrasoft.refdatamgt;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.intrasoft.refdatamgt");

        noClasses()
            .that()
            .resideInAnyPackage("com.intrasoft.refdatamgt.service..")
            .or()
            .resideInAnyPackage("com.intrasoft.refdatamgt.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.intrasoft.refdatamgt.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
