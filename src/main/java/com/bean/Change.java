package com.bean;

import java.util.Date;

public class Change {
    private Integer id;

    private String olddept;

    private String newdept;

    private String deptype;

    private String deptreason;

    private Date depttime;

    private String oldjob;

    private String newjob;

    private String type;

    private String time;

    private Date jobtime;

    private String explanation1;

    private String explanation2;

    private String explanation3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOlddept() {
        return olddept;
    }

    public void setOlddept(String olddept) {
        this.olddept = olddept == null ? null : olddept.trim();
    }

    public String getNewdept() {
        return newdept;
    }

    public void setNewdept(String newdept) {
        this.newdept = newdept == null ? null : newdept.trim();
    }

    public String getDeptype() {
        return deptype;
    }

    public void setDeptype(String deptype) {
        this.deptype = deptype == null ? null : deptype.trim();
    }

    public String getDeptreason() {
        return deptreason;
    }

    public void setDeptreason(String deptreason) {
        this.deptreason = deptreason == null ? null : deptreason.trim();
    }

    public Date getDepttime() {
        return depttime;
    }

    public void setDepttime(Date depttime) {
        this.depttime = depttime;
    }

    public String getOldjob() {
        return oldjob;
    }

    public void setOldjob(String oldjob) {
        this.oldjob = oldjob == null ? null : oldjob.trim();
    }

    public String getNewjob() {
        return newjob;
    }

    public void setNewjob(String newjob) {
        this.newjob = newjob == null ? null : newjob.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Date getJobtime() {
        return jobtime;
    }

    public void setJobtime(Date jobtime) {
        this.jobtime = jobtime;
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