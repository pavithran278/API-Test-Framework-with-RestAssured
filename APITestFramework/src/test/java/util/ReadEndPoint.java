package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadEndPoint {
    public static String getValue(String key){
        Properties prop=new Properties();
        InputStream is = null;
        try {
            is = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\EndPoint.config");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value=prop.getProperty(key);
        return  value;
    }

}
