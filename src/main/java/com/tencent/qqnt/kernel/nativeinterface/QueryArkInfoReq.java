package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QueryArkInfoReq.class */
public final class QueryArkInfoReq {
    public ArrayList<String> bizsrc;
    public int pageNum;
    public int pageSize;

    public QueryArkInfoReq() {
        this.bizsrc = new ArrayList<>();
    }

    public ArrayList<String> getBizsrc() {
        return this.bizsrc;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public String toString() {
        return "QueryArkInfoReq{bizsrc=" + this.bizsrc + ",pageNum=" + this.pageNum + ",pageSize=" + this.pageSize + ",}";
    }

    public QueryArkInfoReq(ArrayList<String> arrayList, int i, int i2) {
        this.bizsrc = new ArrayList<>();
        this.bizsrc = arrayList;
        this.pageNum = i;
        this.pageSize = i2;
    }
}
