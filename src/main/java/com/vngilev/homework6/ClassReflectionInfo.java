package com.vngilev.homework6;

//import com.vngilev.homework2_2.Int.IntTruck;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassReflectionInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        if(args== null){
            System.out.println("Нет аргументов! В аргументе укажите полный путь к классу.");
            return;
        }
        try {
            Class tClass = Class.forName(args[0]);

            System.out.println("Рассматриваем класс: "+tClass.getName());
            System.out.println("");
            System.out.println("Модификаторы доступа следующие:");
            printModifiers(tClass);
            System.out.println("");
            System.out.println("Суперклассы следующие:");
            ClassHierarchy.printSuperClasses(tClass);
            System.out.println("");
            System.out.println("Реализует следующие интерфейсы:");
            printInterfaces(tClass);
            System.out.println("");
            System.out.println("Имеет следующие конструкторы:");
            printConstructors(tClass);
            System.out.println("");
            System.out.println("Имеет следующие поля:");
            printFields(tClass);
            System.out.println("");
            System.out.println("Реализует следующие методы:");
            printMethods(tClass);



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void printConstructors(Class tClass) {
        for(Constructor constructor: tClass.getConstructors()){
            System.out.println(constructor);
        }
    }

    private static void printFields(Class tClass) {
        Field[] fields = tClass.getDeclaredFields();
        for(Field field: fields){
            System.out.println(field.getType()+" "+field.getName());
        }
    }

    private static void printModifiers(Class tClass) {

    }

    private static void printInterfaces(Class tClass) {
        Class[] interfaces = tClass.getInterfaces();

        for(Class i: interfaces){
            System.out.println(i.getName());
        }
    }

    private static void printMethods(Class tClass) {
        for(Method method: tClass.getDeclaredMethods()){
            System.out.println(method);
        }
    }




}
