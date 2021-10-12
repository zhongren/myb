package org.example;

import java.net.URL;

public class MyClassLoader extends ClassLoader {
    @Override
    protected URL findResource(String name) {
        System.out.println("我开始找了");
        return super.findResource(name);
    }

    public static void main(String[] args) {
        MyClassLoader myClassLoader=new MyClassLoader();
        URL url= myClassLoader.getResource("");
        System.out.println(url);
    }
}
