package com.integration.designmode.proxypattern;

/**
 * Created by asseghuh on 2023/6/9
 * @desc: todo
 */
public class Client2 {
    public static void main(String[] args) {
        Player player=new VPlayer();
        Player proxy=new JDKProxyFactory(player).getProxy();
        proxy.loadVideo("aaa.mp4");
        proxy.playVideo("aaa.mp4");

/*      或者
        Player p=new VPlayer();
        Player o = (Player) Proxy.newProxyInstance(
                p.getClass().getClassLoader(),
                p.getClass().getInterfaces(),
                new VPlayerProxyFactory(p)
        );
        o.loadVideo("aaaa.mp4");
*/

    }
}
