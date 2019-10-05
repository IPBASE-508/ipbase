package com.ipbase.DataBack.utils;

/**
 * @author tianyi
 * @date 2019-05-13 08:11
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Tianyi
 * @Date 2019年4月12日
 */
public class FileUtil {

    public static boolean saveFile(String filePath, String content) {
        return saveFile(filePath, content.getBytes());
    }

    public static boolean saveFile(String filePath, byte[] content) {
        try {
            OutputStream output = new FileOutputStream(new File(filePath));
            output.write(content);
            output.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String getKind(String name){
        String rt = name.substring(name.lastIndexOf("."));
        // System.out.println("[originName]:" + name + "  [passName]:" + rt);
        return rt;
    }


}
