package fanshe;

/**
 * Created by asseghuh on 2023/6/9
 * @desc: todo
 */
public class Stu {
    private int id;
    private String name;

    public Stu(){

    }

    public Stu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println(id+"--"+name);
    }

    public int length(String name){
        return name.length();
    }

}
