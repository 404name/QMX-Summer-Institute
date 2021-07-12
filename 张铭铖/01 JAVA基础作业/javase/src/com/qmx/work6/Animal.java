package com.qmx.work6;
//引用类型:类，接口，数组
//interface,接口关键词
//定义一些方法,让不同的人实现
//接口中的所有方法类型默认为 public abstract
//接口中的所有变量类型默认为 public static final(常量)
//关键词implements来实现多个接口(弥补多继承)
public interface Animal {//接口
     String cry();
     String getAnimalName();
}
