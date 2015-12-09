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
	//volatile不用final
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
3.     私有构造方法，防止被实例化   
4.    private Singleton() {  
5.    }  
6.  
7.     此处使用一个内部类来维护单例   
8.    private static class SingletonFactory {  
9.        private static Singleton instance = new Singleton();  
10.    }  
11.  
12.     获取实例   
13.    public static Singleton getInstance() {  
14.        return SingletonFactory.instance;  
15.    }  
16.  
17.     如果该对象被用于序列化，可以保证对象在序列化前后保持一致   
18.    public Object readResolve() {  
19.        return getInstance();  
20.    }  
21.}  */