package com.dingding.cdc.enums;

/**
 * @author liudingding
 * @date 2019/1/17
 * 封装前端api响应码
 */
public enum ResultCode {
    /**
     * 成功
     */
    SUCCESS(200,"请求成功"),
    /**
    *失败
     */
    FAIL(400,"传递参数错误"),
    /**
     * 未认证
     */
    UNAUTHORIZED(401,"未认证"),
    /**
     * 接口不存在
     */
    NOT_FOUND(404,"接口不存在"),
    /**
     * 服务器内部错误
     */
    SERVER_ERROR(500,"服务端出错");

    private int statCode;

    private String message;

    ResultCode(int statCode, String message) {
        this.statCode = statCode;
        this.message = message;
    }

    public int getStatCode() {
        return statCode;
    }

    public String getMessage() {
        return message;
    }
}
