package com.eumji.redis;

import java.io.Serializable;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/11/29
 * @time: 12:33
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 8197011460428053489L;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
