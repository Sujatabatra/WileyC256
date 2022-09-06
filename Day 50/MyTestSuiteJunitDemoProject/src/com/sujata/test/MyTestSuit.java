package com.sujata.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Testing all methods of MyCalculatorClass")
@SelectClasses({MyTestToCheckSequence.class,TestMyDivide.class})
public class MyTestSuit {

}
