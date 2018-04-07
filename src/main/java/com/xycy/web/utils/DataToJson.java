package com.xycy.web.utils;

import java.io.Serializable;
import java.util.List;


/**
 * 针对easyUI封装的分页包装类
 * @author asus
 *
 * @param <T>
 */
public class DataToJson<T> implements Serializable {
    private Integer total;//总行数
    private List<T> rows;

    public DataToJson(Integer total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public DataToJson() {

    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
