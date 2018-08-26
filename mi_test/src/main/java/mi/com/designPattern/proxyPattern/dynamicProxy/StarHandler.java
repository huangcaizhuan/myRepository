package mi.com.designPattern.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{

	Star realStar;
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("StarHandler的invoke。。。。");
		Object object = null;
		if(method.getName().equals("sing")) {
			object = method.invoke(realStar, args);
		}
		System.out.println("啦啦啦啦");
		return object;
	}

}
