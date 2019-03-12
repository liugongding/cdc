package com.dingding.cdc.dto;

/**
 * @author liudingding
 * @date 2019/1/17
 * @param <T>
 *     封装响应结果
 */
public class ResultCod<T>{
    /**
     * 状态码
     */
    private int stateCode;

    /**
     * 状态信息
     */
    private String message;

    public ResultCod() {

    }
    public ResultCod(com.dingding.cdc.enums.ResultCode resultCode) {
        this.stateCode = resultCode.getStatCode();
        this.message = resultCode.getMessage();
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
