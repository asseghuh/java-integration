package package01;

public interface Ai {
    void method1();
    //静态方法，仅用static修饰即可，指定public编译器提示是多余的
    static void method2(){
        System.out.println("我是接口中的静态方法method2");
    }
    class A implements Ai{
        @Override
        public void method1() {
            System.out.println("method1");
        }
        public static void main(String[] args) {
            A a=new A();
            a.method1();
            Ai.method2();
        }
    }
}
