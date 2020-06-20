package day03;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("D:\\xlhomework\\dir\\1000513S0_1.jpg");
            File f = new File("D:\\xlhomework\\dir\\1000513S0_1.jpg");
            if(!f.exists()){
                f.mkdirs();
            }
            fos = new FileOutputStream("D:\\xlhomework\\dir1\\b.txt");


            byte [] arr = new byte[1024*5];
            int len;
            while((len=fis.read(arr))!=-1){
                fos.write(arr,0,len);
            }


        }catch(FileNotFoundException e){
            System.out.println("要操作的文件未发现");


        }catch (IOException e){
            System.out.println("文件读写失败");

        }finally {
            try{
                fis.close();
                fos.close();

            }catch(Exception e){


            }
        }
        System.out.println("文件复制成功");

        //使用缓冲字节流进行文件复制

    }
}
