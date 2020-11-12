package com.java.file;


import java.io.File;
import java.io.IOException;

/*
 * @Author maiBangMin
 * @Description [File-常用方法]
 * @Date 9:45 下午 2020/11/12
 * @Version 1.0
 **/
public class FileMethods {
    public static void main(String[] args) throws IOException {

        // 1.返回此文件是否创建成功布尔值
        File file = new File("/Users/maibangmin/app/code");
        System.out.println("CreateFile：" + file.createNewFile());

        // 2.创建文件夹
        File file1 = new File("/Users/maibangmin/app/code/testDir");
        System.out.println("Mkdir：" +  file1.mkdir());

        // 3.递归创建文件夹
        File file2 = new File("/Users/maibangmin/app/code/testDir/testDir2");
        System.out.println("Mkdirs：" + file2.mkdirs());

        // 4.删除文件
        File file3 = new File("/Users/maibangmin/app/code/testDir/testDir2");
        System.out.println("delete：" + file3.delete());

        // 5.修改文件名
        File file4 = new File("/Users/maibangmin/app/code/test.txt");
        File dest = new File("/Users/maibangmin/app/code/test1.txt");
        System.out.println("rename：" + file4.renameTo(dest));

        // 6.判断该文件是否为文件夹
        File file5 = new File("/Users/maibangmin/app/code");
        System.out.println("isDirectory：" + file5.isDirectory());

        // 7.判断该文件是否为文件
        File file6 = new File("/Users/maibangmin/app/code");
        System.out.println("isFile：" + file6.isFile());

        // 8.判断该文件是否存在
        File file7 = new File("/Users/maibangmin/app/code/test.txt");
        System.out.println("isExists：" + file7.exists());

        // 9.判断该文件是否可以读取
        File file8 = new File("/Users/maibangmin/app/code/test.txt");
        System.out.println("canRead：" + file8.canRead());

        // 10.判断该文件是否可以写入
        File file9 = new File("/Users/maibangmin/app/code/test.txt");
        System.out.println("canWrite：" + file9.canWrite());

        // 11.判断该文件是否为隐藏文件
        File file10 = new File("/Users/maibangmin/app/code/test.txt");
        System.out.println("isHiddlen：" + file10.isHidden());

        // 12.获取该文件的绝对路径
        File file11 = new File("/Users/maibangmin/app/code/test.txt");
        System.out.println("absolutePath：" + file11.getAbsolutePath());

        // 13.获取该文件的相对路径
        File file12 = new File("/Users/maibangmin/app/code/test.txt");
        System.out.println("path：" + file12.getPath());

        // 14.获取该文件姓名
        File file13 = new File("/Users/maibangmin/app/code/test.txt");
        System.out.println("fileNmae：" + file13.getName());

        // 15.获取文件的最后的一次修改时间
        File file14 = new File("/Users/maibangmin/app/code/test.txt");
        System.out.println("fileLength：" + file14.lastModified());

    }
}
