package com.java.file;


import java.io.File;

/*
 * @Author maiBangMin
 * @Description [File的创建方式]
 * @Date 9:32 下午 2020/11/12
 * @Version 1.0
 **/
public class CraeteFile {
    public static void main(String[] args) {

        // 方法一  路径和文件逗号分隔
        File file = new File("//Users//maibangmin//app//code","test123.txt");
        // 方法二  路径文件一体
        File file1 = new File("/Users/maibangmin/app/code/test.txt");
        // 方法三 先指定文件夹，后创建文件
        File file2 = new File("/Users/maibangmin/app/code");
        new File(file2,"test.txt");

    }
}
