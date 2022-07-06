package com.tencent.mobileqq.msf.sdk;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

public final class RdmReq extends JceStruct {
    static Map cache_params;
    public long elapse;
    public String eventName = "";
    public boolean isMerge;
    public boolean isRealTime;
    public boolean isSucceed = true;
    public Map params;
    public int reportType;
    public long size;

    public String className() {
        return "rdm.RdmReq";
    }

    public String fullClassName() {
        return "rdm.RdmReq";
    }

    public RdmReq(int i, String str, boolean z, long j, long j2, Map map, boolean z2, boolean z3) {
        this.reportType = i;
        this.eventName = str;
        this.isSucceed = z;
        this.elapse = j;
        this.size = j2;
        this.params = map;
        this.isRealTime = z2;
        this.isMerge = z3;
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.reportType, 1);
        jceOutputStream.write(this.eventName, 2);
        jceOutputStream.write(this.isSucceed, 3);
        jceOutputStream.write(this.elapse, 4);
        jceOutputStream.write(this.size, 5);
        jceOutputStream.write(this.params, 6);
        jceOutputStream.write(this.isRealTime, 7);
        jceOutputStream.write(this.isMerge, 8);
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.reportType = jceInputStream.read(this.reportType, 1, true);
        this.eventName = jceInputStream.readString(2, true);
        this.isSucceed = jceInputStream.read(this.isSucceed, 3, true);
        this.elapse = jceInputStream.read(this.elapse, 4, true);
        this.size = jceInputStream.read(this.size, 5, true);
        if (cache_params == null) {
            cache_params = new HashMap();
            cache_params.put("", "");
        }
        this.params = (Map) jceInputStream.read(cache_params, 6, true);
        this.isRealTime = jceInputStream.read(this.isRealTime, 7, true);
        this.isMerge = jceInputStream.read(this.isMerge, 8, true);
    }
}
