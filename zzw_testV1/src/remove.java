import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class remove {
	public static void main(String args[])
	{
		//Listʹ��ArrayList���ʵ�ֽӿ�
		List<String> is=new ArrayList<String>();
		is.add("zengzhiwei");
		is.add("wuweicong");
		is.add("guojiji");
		for(Iterator<String> it=is.iterator();it.hasNext();){
			String has=it.next();
			if("zengzhiwei".equals(has))
			{
				//�õ������ſ��Խ����Ƴ�����
				it.remove();
			}
			else{
				System.out.println(has);
			}			
		}		
	}
}
