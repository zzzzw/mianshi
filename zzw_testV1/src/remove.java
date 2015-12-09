import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class remove {
	public static void main(String args[])
	{
		//List使用ArrayList这个实现接口
		List<String> is=new ArrayList<String>();
		is.add("zengzhiwei");
		is.add("wuweicong");
		is.add("guojiji");
		for(Iterator<String> it=is.iterator();it.hasNext();){
			String has=it.next();
			if("zengzhiwei".equals(has))
			{
				//用迭代器才可以进行移除操作
				it.remove();
			}
			else{
				System.out.println(has);
			}			
		}		
	}
}
