package ch12.practiceExample.practiceExample09;

import java.io.UnsupportedEncodingException;

public class DecodingExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = { -20, -107, -120, -21, -123, -107 };
        String str = new String(bytes, "UTF-8");
        System.out.println("str: " + str);
    }
}
