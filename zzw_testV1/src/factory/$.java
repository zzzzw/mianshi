package factory;

public class $ {
	public factory fac(int a){
		if(a==1)
		{
			return new A();
		}
		if(a==2)
		{
			return new B();
		}
		else
		{
			System.out.println("xxx");
			return null;
		}
				
	}
	public static void main(String args[])
	{
		int a=2;
		$ gongchang=new $();
		factory result=gongchang.fac(a);
		result.a();
	}

}
