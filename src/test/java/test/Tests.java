package test;

import org.junit.Test;

public class Tests {
    @Test
    public void MavenParamTest(){
        String browser = System.getProperty("browserName", "chrome");

        if(browser.contains("chrome")){
            System.out.println("Chrome");
        }else
        if(browser.contains("firefox")){
            System.out.println("firefox");
        }
    }
}
