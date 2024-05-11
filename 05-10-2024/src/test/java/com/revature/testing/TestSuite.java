package com.revature.testing;

import com.revature.testing.assignment1.TestAddition;
import com.revature.testing.assignment1.TestDivision;
import com.revature.testing.assignment1.TestSubAndMul;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@Suite
@SelectClasses({
        TestAddition.class,
        TestSubAndMul.class,
        TestDivision.class
})
public class TestSuite {
}
