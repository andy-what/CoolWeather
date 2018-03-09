package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by arch on 2018/3/8.
 */

public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private int provinceCode;

    public Province() {
    }

    public Province(String provinceName, int provinceCode) {
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
