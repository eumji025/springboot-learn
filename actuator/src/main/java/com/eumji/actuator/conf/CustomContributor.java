package com.eumji.actuator.conf;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/11/25
 * @time: 19:09
 */
@Component
public class CustomContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("custom","this is my custom").build();
    }
}
