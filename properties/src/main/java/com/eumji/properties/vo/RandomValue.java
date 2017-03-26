package com.eumji.properties.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 *
 * com.eumji.properties.vo.RandomValue.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:EumJi
 * @year: 2017
 * @month: 03
 * @day: 26
 * @time: 2017/3/26
 */
@Component
public class RandomValue {
    @Value("${eumji.random.strValue}")
    private String strValue;
    @Value("${eumji.random.intValue}")
    private int intValue;
    @Value("${eumji.random.longValue}")
    private long longValue;
    @Value("${eumji.random.uuidValue}")
    private UUID uuidValue;
    @Value("${eumji.random.rangeValue}")
    private int rangeValue;

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public UUID getUuidValue() {
        return uuidValue;
    }

    public void setUuidValue(UUID uuidValue) {
        this.uuidValue = uuidValue;
    }

    public int getRangeValue() {
        return rangeValue;
    }

    public void setRangeValue(int rangeValue) {
        this.rangeValue = rangeValue;
    }

    @Override
    public String toString() {
        return "RandomValue{" +
                "strValue='" + strValue + '\'' +
                ", intValue=" + intValue +
                ", longValue=" + longValue +
                ", uuidValue=" + uuidValue +
                ", rangeValue=" + rangeValue +
                '}';
    }
}
