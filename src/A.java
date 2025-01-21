public interface A {
    /**
     * 1、默认方法（实例方法）：使用default修饰，默认会加上public修饰，
     * 注意：只能使用接口的实现类对象调用
     */
    default void test1() {

    }

    /**
     * 2、私有方法：必须用private修饰（jdk 9开始支持）
     */
    private void test2() {

    }

    /**
     * 3、类方法（静态方法）：使用static修饰，默认会被加上public修饰，
     * 注意：只能用接口名调用
     */
    static void test3() {

    }
}
