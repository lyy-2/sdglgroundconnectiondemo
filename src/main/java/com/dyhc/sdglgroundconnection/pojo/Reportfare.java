package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 导游报账车费表
 **/
@Table(name = "reportfare")
public class Reportfare {
    @Id
    @Column(name = "reportFareId")
    private int reportFareId; // 导游报账车费表编号
    private Double tolls; // 过路费
    @Column(name = "parkingFee")
    private Double parkingFee; // 停车费
    @Column(name = "prepaidFare")
    private Double prepaidFare; // 预付车费
    private Integer status; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "`upDate`")
    private Date upDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "`createDate`")
    private Date createDate; // 创建时间
    public Integer getReportDetailId() {
        return reportDetailId;
    }

    public void setReportDetailId(Integer reportDetailId) {
        this.reportDetailId = reportDetailId;
    }



    @Column(name = "reportDetailId")
    private Integer reportDetailId; //导游报账明细id
    private String value2;
    private String value3;

    @Id
    @Column(name = "reportFareId")
    public int getReportFareId() {
        return reportFareId;
    }

    public void setReportFareId(int reportFareId) {
        this.reportFareId = reportFareId;
    }

    @Basic
    @Column(name = "tolls")
    public Double getTolls() {
        return tolls;
    }

    public void setTolls(Double tolls) {
        this.tolls = tolls;
    }

    @Basic
    @Column(name = "parkingFee")
    public Double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(Double parkingFee) {
        this.parkingFee = parkingFee;
    }

    @Basic
    @Column(name = "PrepaidFare")
    public Double getPrepaidFare() {
        return prepaidFare;
    }

    public void setPrepaidFare(Double prepaidFare) {
        this.prepaidFare = prepaidFare;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "createBy")
    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "updateBy")
    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "upDate")
    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    @Basic
    @Column(name = "createDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



    @Basic
    @Column(name = "value2")
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Basic
    @Column(name = "value3")
    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reportfare that = (Reportfare) o;
        return reportFareId == that.reportFareId &&
                Objects.equals(tolls, that.tolls) &&
                Objects.equals(parkingFee, that.parkingFee) &&
                Objects.equals(prepaidFare, that.prepaidFare) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(upDate, that.upDate) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(reportDetailId, that.reportDetailId) &&
                Objects.equals(value2, that.value2) &&
                Objects.equals(value3, that.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(reportFareId, tolls, parkingFee, prepaidFare, status, createBy, updateBy, upDate, createDate, reportDetailId, value2, value3);
    }
}
