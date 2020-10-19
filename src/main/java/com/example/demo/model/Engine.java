package com.example.demo.model;

public class Engine {
    private Integer id;
    private String gcmc;
    private String dz;
    private Integer delete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGcmc() {
        return gcmc;
    }

    public void setGcmc(String gcmc) {
        this.gcmc = gcmc;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", gcmc='" + gcmc + '\'' +
                ", dz='" + dz + '\'' +
                ", delete=" + delete +
                '}';
    }
}
