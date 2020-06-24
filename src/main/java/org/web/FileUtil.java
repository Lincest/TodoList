package org.web;

import java.io.*;

/**
 *  实现文件的读写
 */
public class FileUtil {

    public static String ReadFile(String Path) {
        BufferedReader reader = null;
        String laststr = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(Path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            reader = new BufferedReader(inputStreamReader);
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                laststr += tempString;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return laststr;
    }

    public static void WriteFile(String Path, String text) {
        try {
            File file = new File(Path);
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            // ps.append(text); 覆盖写
             ps.println(text); // 追加写
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}