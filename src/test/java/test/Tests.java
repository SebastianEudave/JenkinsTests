package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Tests {
    @Test
    public void MavenParamTest(){
        String browser = System.getProperty("browserName", "Chrome");

        assertEquals(browser,"Chrome");
    }
}
