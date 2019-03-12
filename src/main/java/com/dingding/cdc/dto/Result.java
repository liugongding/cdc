package com.dingding.cdc.dto;

/**
 * @author liudingding
 * @date 2019/1/21
 * @param <T>
 *     封装json结果
 */
public class Result<T> {
    /**
     * 操作是否成功
     */
    private boolean success;

    /**
     * 操作成功的响应值
     */
    private T data;

    /**
     * 操作失败的响应值
     */
    private String error;

    public Result(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public Result(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", data=" + data +
                ", error='" + error + '\'' +
                '}';
    }
}
