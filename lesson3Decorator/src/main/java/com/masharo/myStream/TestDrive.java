package com.masharo.myStream;

import java.io.*;

public class TestDrive {

    public static void main(String[] args) {
        try {
            int c;

            InputStream in = new LowerCaseInputStream(
                                new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\U-003-106\\Desktop\\myProject\\JP\\patterns\\lesson3Decorator\\src\\main\\java\\com\\masharo\\myStream\\resources\\file.txt")
                                ));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
