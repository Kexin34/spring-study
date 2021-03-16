package com.kexin.demo01;

//代理角色：中介
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }
    public Proxy(Host host) {
        this.host = host;
    }

    //租房
    public void rent(){
        seeHouse();
        host.rent();
        fee();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fee(){
        System.out.println("收中介费");
    }
}
