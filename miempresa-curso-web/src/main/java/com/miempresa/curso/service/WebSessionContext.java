package com.miempresa.curso.service;

public class WebSessionContext {

	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
