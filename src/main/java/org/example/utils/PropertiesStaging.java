package org.example.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesStaging {

    static String filePath = "src/main/resources/config.properties";

    public static String readData(String key) throws IOException {
        FileReader fileReader = new FileReader(filePath);

        Properties properties = new Properties();
        properties.load(fileReader);

        return properties.getProperty(key);

    }
}
