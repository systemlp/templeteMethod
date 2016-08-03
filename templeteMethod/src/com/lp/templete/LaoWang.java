package com.lp.templete;

public class LaoWang extends ActivateCard {

    @Override
    protected void writeInfo() {
        System.out.println("信息填写：老王\t汉族\t18666668888\tVIP");
    }
    
    @Override
    protected boolean isVIP() {
        return true;
    }

}
