package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't run until we fix  JIRA #123 in resolved")
    void basicTest() {

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {

    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {

    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    void testForMacAndWindowsOnly(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testOnlyForJava13(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testOnlyForJava17(){

    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11)
    void testOnlyForJavaRangeMin(){

    }

    @Test
    @EnabledIfEnvironmentVariable(named="LUV2CODE_ENV", matches = "DEV")
    void testOnlyForDevEnvironment() {

    }

    @Test
    @EnabledIfSystemProperty(named="LUV2CODE_SYS_PROP", matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty() {

    }
}
