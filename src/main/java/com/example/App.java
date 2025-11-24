package com.example;

// 故意未使用到的 import，PMD (UnusedImports rule) 會在這裡報錯
import java.util.List;

/**
 * Hello world!
 */
public class App
{
    public static void main( String[] args )
    {
        // 故意格式不符合 Google Java Format 標準 (Spotless 會報錯)
        System.out.println( "Hello World!" );
    }
}