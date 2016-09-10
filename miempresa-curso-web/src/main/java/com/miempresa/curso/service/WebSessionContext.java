package com.miempresa.curso.service;

/**
 * 利用 ThreadLocal 给当前 Session 请求的 Thread 对象 保存 LoginInfo对象
 * 使用：set和remove均由平台调用，业务模块只使用 get     

 * 好处: 减少参数的显式传递，利于扩展。如：公共模块、业务模块，随时可以通过 SessionContext.get() 来得到 LoginInfo
 * 缺点：必须保证 ThreadLocal 内的对象的 remove , 否则 map 的容量会越来越多.
 * 
 * 注：还不能使用get()，因为还没有想好，在那里使用 set()--- RemoteServiceServlet 子类可以 重载 三个方法
 * 
 * @author aibo
 * @since 2007-08-30
 *
 */

public class WebSessionContext {

	/**
	 * ThreadLocal里面有一个Map,按 CurrentThread 放置 LoginInfo对象的引用。
	 */
	private static ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
        protected String initialValue() {
        	return "inicio";
        }
    };

	public static void set(String info){
		threadLocal.set(info);
	}
	
	public static String get(){
		if(threadLocal.get()==null){
			return "new vacio";
		}
		return threadLocal.get();
	}
	
	public static void remove(){
		threadLocal.remove();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
