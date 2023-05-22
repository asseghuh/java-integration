package com.integration.designmode.prototypemode;

/**
 * Created by shengR on 2023/5/13
 * @desc: todo
 */
public class ClonePeople implements Cloneable{
    private String name;
    private int age;
    private IdentityCard idCard;

    public ClonePeople(String name, int age, IdentityCard idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    public void setIdCard(IdentityCard idCard) {
        this.idCard = idCard;
    }

    public IdentityCard getIdCard() {
        return idCard;
    }

    @Override
    public String toString() {
        return "我是克隆人[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard=" + idCard.getIdentityId() +
                ']';
    }

    @Override
    public Object clone() {
        ClonePeople clone = null;
        try {
            clone = (ClonePeople)super.clone();
            clone.setIdCard((IdentityCard)clone.getIdCard().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
