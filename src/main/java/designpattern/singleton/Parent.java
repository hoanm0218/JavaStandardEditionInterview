package designpattern.singleton;

public class Parent {
     void method1(){
        System.out.println("method1-pa");
    }
    void method2(){
        System.out.println("method2-pa");
        method1();
    }
}

class  Child extends Parent{
    void method1(){
        System.out.println("method1-chi");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.method2();
    }
}