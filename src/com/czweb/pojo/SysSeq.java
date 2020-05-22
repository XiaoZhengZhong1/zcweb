package com.czweb.pojo;

public class SysSeq {
    /*

  `SEQ_NAME` varchar(128) NOT NULL,
  `SEQ_OWNER` varchar(128) DEFAULT NULL,
  `MIN_VALUE` bigint(20) NOT NULL,
  `MAX_VALUE` bigint(20) NOT NULL,
  `LAST_NUMBER` bigint(20) NOT NULL,
  `INCREMENT_BY` int(11) NOT NULL,
  `CYCLE_FLAG` int(11) NOT NULL,
  `ORDER_FLAG` int(11) DEFAULT NULL,
  `CACHE_SIZE` int(11) NOT NULL,
  `REAMRK` varchar(512) DEFAULT NULL,


    * */

    private String SEQ_NAME;
    private String SEQ_OWNER;
    private String REAMRK;
    private int MIN_VALUE;
    private int MAX_VALUE;
    private int LAST_NUMBER;
    private int INCREMENT_BY;
    private int CYCLE_FLAG;
    private int ORDER_FLAG;
    private int CACHE_SIZE;

    public String getSEQ_NAME() {
        return SEQ_NAME;
    }

    public void setSEQ_NAME(String SEQ_NAME) {
        this.SEQ_NAME = SEQ_NAME;
    }

    public String getSEQ_OWNER() {
        return SEQ_OWNER;
    }

    public void setSEQ_OWNER(String SEQ_OWNER) {
        this.SEQ_OWNER = SEQ_OWNER;
    }

    public String getREAMRK() {
        return REAMRK;
    }

    public void setREAMRK(String REAMRK) {
        this.REAMRK = REAMRK;
    }

    public int getMIN_VALUE() {
        return MIN_VALUE;
    }

    public void setMIN_VALUE(int MIN_VALUE) {
        this.MIN_VALUE = MIN_VALUE;
    }

    public int getMAX_VALUE() {
        return MAX_VALUE;
    }

    public void setMAX_VALUE(int MAX_VALUE) {
        this.MAX_VALUE = MAX_VALUE;
    }

    public int getLAST_NUMBER() {
        return LAST_NUMBER;
    }

    public void setLAST_NUMBER(int LAST_NUMBER) {
        this.LAST_NUMBER = LAST_NUMBER;
    }

    public int getINCREMENT_BY() {
        return INCREMENT_BY;
    }

    public void setINCREMENT_BY(int INCREMENT_BY) {
        this.INCREMENT_BY = INCREMENT_BY;
    }

    public int getCYCLE_FLAG() {
        return CYCLE_FLAG;
    }

    public void setCYCLE_FLAG(int CYCLE_FLAG) {
        this.CYCLE_FLAG = CYCLE_FLAG;
    }

    public int getORDER_FLAG() {
        return ORDER_FLAG;
    }

    public void setORDER_FLAG(int ORDER_FLAG) {
        this.ORDER_FLAG = ORDER_FLAG;
    }

    public int getCACHE_SIZE() {
        return CACHE_SIZE;
    }

    public void setCACHE_SIZE(int CACHE_SIZE) {
        this.CACHE_SIZE = CACHE_SIZE;
    }
}
