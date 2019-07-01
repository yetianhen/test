package com.lean.ssm.chapter2.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public Object reflect(){
    	ReflectServiceImpl object=null;
    	try{
    		object=(ReflectServiceImpl)Class.forName("com.lean.ssm.chapter2.reflect.ReflectServiceImpl").newInstance();
    		Method method=object.getClass().getMethod("sayHello", String.class);
    		method.invoke(object, "张三");
    	}catch(NoSuchMethodException|SecurityException|ClassNotFoundException|IllegalAccessException|IllegalArgumentException|InvocationTargetException|InstantiationException ex){
            ex.printStackTrace();    		
    	}
    	return object;
    }
    public static void main(String args[]){
    	//Test test=new Test();
    	//test.reflect();
    	JdkProxyExample jdk=new JdkProxyExample();
    	HelloWorld proxy=(HelloWorld)jdk.bind(new HelloWorldImpl());
    	proxy.sayHelloWorld();
    }
}
