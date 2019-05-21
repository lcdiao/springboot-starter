package cn.lcdiao.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: diao
 * @Description:
 * @Date: 2019/5/21 15:01
 */
@ConfigurationProperties(prefix = "lcdiao.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
