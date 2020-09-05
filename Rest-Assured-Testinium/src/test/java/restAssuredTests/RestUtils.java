package restAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RestUtils {

    public static String getFirstEmail(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Cemal"+generatedString);
    }

    public static String getFirstPassword(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Test"+generatedString);
    }
}
