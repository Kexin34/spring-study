package com.kexin.demo01;

//客户类，一般客户都会去找代理！
public class Client {
    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();

        // 代理，中介帮房东租房子，代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);

        //你去找中介！你不用面对房东
        proxy.rent();
    }
}
