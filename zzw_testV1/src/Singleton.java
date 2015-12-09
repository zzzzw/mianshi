/*
public class Singleton {
	private Singleton(){}
	private static final Singleton instance=new Singleton();
	public Singleton getInstance()
	{
		return instance;
	}
}

*/
/*public class Singleton{
	private Singleton(){}
	//volatile����final
	private volatile static  Singleton instance=null;
	public Singleton getInstance(){
		if(instance==null){
			//synchronized
			synchronized(Singleton.class)
			{
				if(instance==null)
				{
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
	
}*/
public class Singleton{
	private Singleton(){}
	private static class single{
		private static final Singleton instance=new Singleton();
	}
	public static Singleton getInstance(){
		return single.instance;
	}
}


/*
1.public class Singleton {  
2.  
3.     ˽�й��췽������ֹ��ʵ����   
4.    private Singleton() {  
5.    }  
6.  
7.     �˴�ʹ��һ���ڲ�����ά������   
8.    private static class SingletonFactory {  
9.        private static Singleton instance = new Singleton();  
10.    }  
11.  
12.     ��ȡʵ��   
13.    public static Singleton getInstance() {  
14.        return SingletonFactory.instance;  
15.    }  
16.  
17.     ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ��   
18.    public Object readResolve() {  
19.        return getInstance();  
20.    }  
21.}  */