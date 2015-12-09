package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class $123 {
	public static void main(String args[]) throws IOException
	{
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("99.txt")));
		for(int i=1;i<10;i++){
		for(int j=1;j<=i;j++){
			//文件写入
		pw.print(j+"*"+i+"="+i*j+" ");
		}
		pw.println();
		}
		//关闭外层流
		pw.close();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("99.txt"));
		int d = -1;
		int n = 0;
		while((d=isr.read()) != -1 ){
		n++;
		System.out.print((char)d);//读出来数据，记得转化为d
		}
		System.out.println(n);
		isr.close();
		}
		}
			
	


/*
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
public class Hello {
public static void main(String[] args) throws IOException{
PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("99.txt")));
for(int i=1;i<10;i++){
for(int j=1;j<=i;j++){
	//文件写入
pw.print(j+"*"+i+"="+i*j+" ");
}
pw.println();
}
//关闭外层流
pw.close();
InputStreamReader isr = new InputStreamReader(new FileInputStream("99.txt"));
int d = -1;
int n = 0;
while((d=isr.read()) != -1 ){
n++;
System.out.print((char)d);//读出来数据，记得转化为d
}
System.out.println(n);
isr.close();
}
}*/
//http://www.lidetao.com/printwrite-use.html
/***
 * //创建字节流
 fos = new FileOutputStream(“newPoem.txt”);
 //通过桥连接，把字节流转变为字符流，并指定编码格式
 osw = new OutputStreamWriter(fos,”UTF-8″);//写入文件时指定编码格式
 //封装字符流的过滤流
 pw = new PrintWriter(osw);
 //文件写入
 pw.println(“阳关万里道，”);
 
 
 二、InputStreamReader类

InputStreamReader 将字节流转换为字符流。是字节流通向字符流的桥梁。如果不指定字符集编码，该解码过程将使用平台默认的字符编码，如：GBK。 
构造方法  ： 
     InputStreamReader isr = new InputStreamReader(InputStream in);//构造一个默认编码集的InputStreamReader类 
     InputStreamReader isr = new InputStreamReader(InputStream in,String charsetName);//构造一个指定编码集的InputStreamReader类。 
     
     参数 in对象通过 InputStream in = System.in;获得。//读取键盘上的数据。 
     或者 InputStream in = new FileInputStream(String fileName);//读取文件中的数据。可以看出 FileInputStream 为InputStream的子类。 

 */
//http://www.tuicool.com/articles/U7VFFr
