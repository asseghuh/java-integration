package com.integration.designmode.prototypemode;

/**
 * Created by shengR on 2023/5/13
 * @desc: todo
 */
public class IdentityCard implements Cloneable{
    private String identityId;//证件号

    public String getIdentityId() {
        return identityId;
    }

    public IdentityCard(String identityId) {
        this.identityId = identityId;

    }

    @Override
    public Object clone() {
        IdentityCard clone = null;
        try {
            clone = (IdentityCard)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
