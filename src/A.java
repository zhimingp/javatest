public class A {
    //1.私有化类的构造器
    private A() {

    }

    //2.定义一个类变量记住类的一个对象
    private static final A a = new A();

    //3.定义一个类方法返回类的对象
    public static A getObject() {
        return a;
    }

}
