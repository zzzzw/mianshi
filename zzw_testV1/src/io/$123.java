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
			//�ļ�д��
		pw.print(j+"*"+i+"="+i*j+" ");
		}
		pw.println();
		}
		//�ر������
		pw.close();
		InputStreamReader isr = new InputStreamReader(new FileInputStream("99.txt"));
		int d = -1;
		int n = 0;
		while((d=isr.read()) != -1 ){
		n++;
		System.out.print((char)d);//���������ݣ��ǵ�ת��Ϊd
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
	//�ļ�д��
pw.print(j+"*"+i+"="+i*j+" ");
}
pw.println();
}
//�ر������
pw.close();
InputStreamReader isr = new InputStreamReader(new FileInputStream("99.txt"));
int d = -1;
int n = 0;
while((d=isr.read()) != -1 ){
n++;
System.out.print((char)d);//���������ݣ��ǵ�ת��Ϊd
}
System.out.println(n);
isr.close();
}
}*/
//http://www.lidetao.com/printwrite-use.html
/***
 * //�����ֽ���
 fos = new FileOutputStream(��newPoem.txt��);
 //ͨ�������ӣ����ֽ���ת��Ϊ�ַ�������ָ�������ʽ
 osw = new OutputStreamWriter(fos,��UTF-8��);//д���ļ�ʱָ�������ʽ
 //��װ�ַ����Ĺ�����
 pw = new PrintWriter(osw);
 //�ļ�д��
 pw.println(���������������);
 
 
 ����InputStreamReader��

InputStreamReader ���ֽ���ת��Ϊ�ַ��������ֽ���ͨ���ַ����������������ָ���ַ������룬�ý�����̽�ʹ��ƽ̨Ĭ�ϵ��ַ����룬�磺GBK�� 
���췽��  �� 
     InputStreamReader isr = new InputStreamReader(InputStream in);//����һ��Ĭ�ϱ��뼯��InputStreamReader�� 
     InputStreamReader isr = new InputStreamReader(InputStream in,String charsetName);//����һ��ָ�����뼯��InputStreamReader�ࡣ 
     
     ���� in����ͨ�� InputStream in = System.in;��á�//��ȡ�����ϵ����ݡ� 
     ���� InputStream in = new FileInputStream(String fileName);//��ȡ�ļ��е����ݡ����Կ��� FileInputStream ΪInputStream�����ࡣ 

 */
//http://www.tuicool.com/articles/U7VFFr
