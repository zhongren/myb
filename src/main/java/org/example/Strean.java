//package org.example;
//
//import com.google.common.collect.Lists;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class Strean {
//    public static void main(String[] args) {
//        List<Good> list= Lists.newArrayList();
//        Good good1=new Good("red",1);
//        Good good2=new Good("green",4);
//        Good good3=new Good("blue",3);
//        Good good4=new Good("green",2);
//        Good good5=new Good("grey",5);
//        list.add(good1);
//        list.add(good2);
//        list.add(good3);
//        list.add(good4);
//        list.add(good5);
//        int sum=list.stream().filter(good -> good.color.equals("green")).mapToInt(good->good.weight).sum();
//
//        List<String> word=Lists.newArrayList();
//        word.add("a");
//        word.add("b");
//        word.stream().peek(i-> System.out.println(i)).map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
//
//        System.out.println(Optional.ofNullable(null).ifPresent(System.out::println));;
//    }
//
//}
//class  Good{
//    String color;
//    Integer weight;
//    Good(String color,Integer weight){
//        this.color=color;
//        this.weight=weight;
//    }
//}
