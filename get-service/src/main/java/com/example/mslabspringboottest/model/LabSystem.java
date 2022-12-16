package com.example.mslabspringboottest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LabSystem {
    @Id
    private String Id;
    @Column
    private String brand;
    @Column
    private String ram;
    @Column
    private String hdd;
    @Column
    private String os;
    @Column
    private String dualBoot;

    public LabSystem() {
    }

    public LabSystem(String id, String brand, String ram, String hdd, String os, String dualBoot) {
        Id = id;
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.dualBoot = dualBoot;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDualBoot() {
        return dualBoot;
    }

    public void setDualBoot(String dualBoot) {
        this.dualBoot = dualBoot;
    }
}
