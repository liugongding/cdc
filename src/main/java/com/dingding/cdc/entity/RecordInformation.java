package com.dingding.cdc.entity;

/**
 * @author liudingding
 * @date 2016/1/13
 */
public class RecordInformation {
    private Integer id;
    private String type;

    public RecordInformation() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RecordInformation{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
