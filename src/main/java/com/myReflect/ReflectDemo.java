package com.myReflect;

import java.lang.reflect.Method;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2021/7/14 17:41
 */
public class ReflectDemo {
    public static void test() throws IllegalAccessException, InstantiationException, NoSuchMethodException {
        //使用Class对象的newInstance()方法来创建Class对象对应类的实例。
        Class<?> c = MethodClass.class;
        Object object = c.newInstance();
        Method[] methods = c.getMethods();
        Method[] declaredMethods = c.getDeclaredMethods();
        //获取MethodClass类中的add方法
        Method method = c.getMethod("add",int.class,int.class);
        //getMethods()方法获取的所有方法
        System.out.println("getMethods获取的方法：");
        for(Method m:methods)
            System.out.println(m);
        //getDeclaredMethods()方法获取的所有方法
        System.out.println("getDeclaredMethods获取的方法：");
        for(Method m:declaredMethods)
            System.out.println(m);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException {
        test();
    }
}

class MethodClass{

    public final int flag = 3;
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
