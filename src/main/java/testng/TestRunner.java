package testng;

import org.testng.TestNG;
import java.util.Collections;

public class TestRunner {
    public static void runTests() {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("testng.xml")); 
        testng.setOutputDirectory("test-output"); 
        testng.run();
    }
}
