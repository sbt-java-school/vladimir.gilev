package com.vngilev.homework6;

import java.util.Stack;

public class ClassHierarchy {

    public static void main(String[] args) {
        Class<Test> testClass = Test.class;
        printSuperClasses(testClass);

    }

    static <T> void printSuperClasses(Class<T> classT){

        Stack<String> stack = new Stack<>();
        stack.push(classT.getName());

        Class<? super T> currentClass;
        for(currentClass = classT.getSuperclass();currentClass!=null;){
            stack.push("|");
            stack.push("^");
            stack.push(currentClass.getName());
            currentClass = currentClass.getSuperclass();
        }

        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    abstract class GrandParentTest <T>{
        abstract void doSomething(T var);
    }

    class ParentTest <T> extends GrandParentTest<T>{
        public void doSomething(T var){
            return;
        }
    }

    class Test extends  ParentTest <String>{
        private String fio;

        public void setFio(String fio) {
            this.fio = fio;
        }

        public String getFio() {

            return fio;
        }

        public Test(String fio) {

            this.fio = fio;
        }

        private int add (int a, int b){
            return a+b;
        }
    }
}
