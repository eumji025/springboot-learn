package com.eumji.aspect.vo;

import javax.persistence.*;

/**
 * com.eumji.aspect.vo.LogIInfo.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:EumJi
 * @year: 2017
 * @month: 04
 * @day: 01
 * @time: 2017/4/1
 */
@Entity
@Table(name = "loginfo")
public class LogInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ip;
    private String url;
    private String header;
    private String method;
    private String classMethod;
    private String arges;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getClassMethod() {
        return classMethod;
    }

    public void setClassMethod(String classMethod) {
        this.classMethod = classMethod;
    }

    public String getArges() {
        return arges;
    }

    public void setArges(String arges) {
        this.arges = arges;
    }

    @Override
    public String toString() {
        return "LogIInfo{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", url='" + url + '\'' +
                ", header='" + header + '\'' +
                ", method='" + method + '\'' +
                ", classMethod='" + classMethod + '\'' +
                ", arges='" + arges + '\'' +
                '}';
    }
}
