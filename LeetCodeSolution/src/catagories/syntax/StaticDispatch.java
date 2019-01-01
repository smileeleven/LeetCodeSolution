package syntax;

/**
 * @author: create by Gene1994
 * @date:2018/11/27
 */

/**
 * 方法静态分派演示
 */
public class StaticDispatch {
    static abstract class Human{

    }

    static class Man extends Human{

    }
    static class Woman extends Human{

    }

    public void sayHello(Human guy){
        System.out.println("hello,guy!");
    }

    public void sayHello(Man guy){
        System.out.println("hello,gentleman!");
    }

    public void sayHello(Woman guy){
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);//->hello,guy!
        sr.sayHello(woman);//->hello,guy!
//        sr.sayHello((Man)man);//->hello,gentleman!
//        sr.sayHello((Woman) woman);//->hello,lady!
    }
}
