package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();


    static {

        try {

            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);

            //It is better to close it if it is not in use.
            file.close();


        } catch (IOException e) {
            System.out.println("Something happened in the ConfigurationReader class ");
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
