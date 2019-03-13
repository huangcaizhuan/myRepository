package mi.com.myThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * @author Administrator
 *
 */
public class ExecutorServiceDemo {
	public static void main(String[] args) {
		 // 创建一个线程池对象，控制要创建几个线程对象。
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		// 可以执行Runnable对象或者Callable对象代表的线程
		pool.submit(new myRunable());
		pool.submit(new myRunable());
		//结束线程池
		pool.shutdown();
	}
}


class myRunable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}