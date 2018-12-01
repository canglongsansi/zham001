package com.zhanchormanage.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class ThreePartyContract implements Serializable {
    private Integer id;

    private String bName;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fromtime;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date totime;

    private String blance;

    private String aName;

    private String idCard;

    private String address;

    private Integer yyNumber;

    private String tel;

    private String collectionAccount;

    private String householder;

    private String openingBank;

    private String stageName;

    private Integer effectiveDays;

    private Integer effectiveHours;

    private String filehost;

    private Integer tofile;

    private Date createdTime;

    private Date updatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public Date getFromtime() {
        return fromtime;
    }

    public void setFromtime(Date fromtime) {
        this.fromtime = fromtime;
    }

    public Date getTotime() {
        return totime;
    }

    public void setTotime(Date totime) {
        this.totime = totime;
    }

    public String getBlance() {
        return blance;
    }

    public void setBlance(String blance) {
        this.blance = blance == null ? null : blance.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getYyNumber() {
        return yyNumber;
    }

    public void setYyNumber(Integer yyNumber) {
        this.yyNumber = yyNumber;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getCollectionAccount() {
        return collectionAccount;
    }

    public void setCollectionAccount(String collectionAccount) {
        this.collectionAccount = collectionAccount == null ? null : collectionAccount.trim();
    }

    public String getHouseholder() {
        return householder;
    }

    public void setHouseholder(String householder) {
        this.householder = householder == null ? null : householder.trim();
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank == null ? null : openingBank.trim();
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName == null ? null : stageName.trim();
    }

    public Integer getEffectiveDays() {
        return effectiveDays;
    }

    public void setEffectiveDays(Integer effectiveDays) {
        this.effectiveDays = effectiveDays;
    }

    public Integer getEffectiveHours() {
        return effectiveHours;
    }

    public void setEffectiveHours(Integer effectiveHours) {
        this.effectiveHours = effectiveHours;
    }

    public String getFilehost() {
        return filehost;
    }

    public void setFilehost(String filehost) {
        this.filehost = filehost == null ? null : filehost.trim();
    }

    public Integer getTofile() {
        return tofile;
    }

    public void setTofile(Integer tofile) {
        this.tofile = tofile;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}