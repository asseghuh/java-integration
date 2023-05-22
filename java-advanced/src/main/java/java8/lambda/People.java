package java8.lambda;

/**
 * Created by shengR on 2023/4/18
 * @desc: todo
 */
public class People {
    private String name;
    public People() {

    }
    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say(){
        System.out.println("我的名字是:"+name);
    }
}
