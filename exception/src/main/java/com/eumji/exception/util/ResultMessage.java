package com.eumji.exception.util;

/**
 * @author Do
 * @package com.eumji.exception.util
 * @name ErrorInfo
 * @date 2017/3/27
 * @time 13:11
 */
public class ResultMessage<T> {
    public static final Integer ERRORCODE = 404;
    public static final Integer SUCCESSCODE= 200;
    private Integer messageCode;  //200 ok
    private String message; //消息
    private String url; //url
    private T data; //携带的数据

    public Integer getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(Integer messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ErrorInfo{" +
                "messageCode=" + messageCode +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                ", data=" + data +
                '}';
    }
}
