package cn.lcdiao.starter;

/**
 * @Author: diao
 * @Description:
 * @Date: 2019/5/21 15:00
 */
public class HelloService {

    HelloProperties helloProperties;

    public String sayHello(String name) {
        return helloProperties.getPrefix() + "-" + name + helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
