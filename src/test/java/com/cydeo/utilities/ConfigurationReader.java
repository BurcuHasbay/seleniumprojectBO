package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
  private static Properties properties = new Properties();

static {

    //2-We need to open the file in java memory: FileInputStream



    //3-Load the properties object using FileInputStream object
    try {


        FileInputStream file = new FileInputStream("configuration.properties");
        properties.load(file);
        //close the file-It is better to close it if ir is not in used.
        file.close();

    } catch (IOException e) {
        System.out.println(" Something happened in the ConfigurationReader class. ");;
    }

}

}
