package com.bean;

import java.util.Date;

public class Occupationcareer {
    private Integer empno;

    private Date begintime;

    private Date endtime;

    private String jobname;

    private String jobdiscrip;

    private String position;

    private Integer salary;

    private String reference;

    private String referenceposition;

    private String referencetel;

    private String explanation1;

    private String explanation2;

    private String explanation3;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobdiscrip() {
        return jobdiscrip;
    }

    public void setJobdiscrip(String jobdiscrip) {
        this.jobdiscrip = jobdiscrip == null ? null : jobdiscrip.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getReferenceposition() {
        return referenceposition;
    }

    public void setReferenceposition(String referenceposition) {
        this.referenceposition = referenceposition == null ? null : referenceposition.trim();
    }

    public String getReferencetel() {
        return referencetel;
    }

    public void setReferencetel(String referencetel) {
        this.referencetel = referencetel == null ? null : referencetel.trim();
    }

    public String getExplanation1() {
        return explanation1;
    }

    public void setExplanation1(String explanation1) {
        this.explanation1 = explanation1 == null ? null : explanation1.trim();
    }

    public String getExplanation2() {
        return explanation2;
    }

    public void setExplanation2(String explanation2) {
        this.explanation2 = explanation2 == null ? null : explanation2.trim();
    }

    public String getExplanation3() {
        return explanation3;
    }

    public void setExplanation3(String explanation3) {
        this.explanation3 = explanation3 == null ? null : explanation3.trim();
    }
}