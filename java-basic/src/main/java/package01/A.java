package package01;

public interface A {
    default void abc(){
        System.out.println("我是接口A中的方法abc");
    }
}
interface B{
    default void abc(){
        System.out.println("我是接口B中的方法abc");
    }
}
class AB implements A,B{

    @Override
    public void abc() {

    }
}
