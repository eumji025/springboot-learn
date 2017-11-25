package mapper.eumji.customPort.util;

import org.springframework.boot.context.embedded.*;
import org.springframework.context.ApplicationListener;

/**
 * 工具类为了设置端口号
 * eumji.eumji.customPort.util
 *
 * @desc
 * @author:EumJi
 * @year: 2017
 * @month: 03
 * @day: 26
 * @time: 2017/3/26
 */
public class CustomPortUtil implements EmbeddedServletContainerCustomizer{


    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8888);
    }

}
