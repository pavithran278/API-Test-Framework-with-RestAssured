package util;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadJsonString {
    public static String getJsonString(String fileName){
        String Json = new String();
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\JSONfile\\"+fileName);
            Json = IOUtils.toString(fileInputStream, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Json;
    }
}
