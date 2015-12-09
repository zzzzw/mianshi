package thread;

import java.util.HashMap;
import java.util.Map;


public class MyThread implements Runnable{
public static Map<Integer,String> map = new HashMap<Integer,String>();

static{
for(int i=0;i<10;i++){
map.put(i, "值"+i);
}
}
@Override
public void run() {
try {
Thread.sleep(3000);
updateData();
} catch (InterruptedException e) {
e.printStackTrace();
}
}

public void updateData(){
synchronized(this){
System.out.println("------------------------线程"+Thread.currentThread().getName()+"拿到锁--------------------------");

for(int i=0;i<10;i++){
map.put(i, Thread.currentThread().getName()+":"+i);
System.out.println(map.get(i));
}
System.out.println("------------------------线程"+Thread.currentThread().getName()+"释放锁--------------------------");
}
}
public static void main(String[] args) {

Thread t = null;
for(int i=0;i<10;i++){
t= new Thread(new MyThread());
t.start();
}
}
}