package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RMBeaconReportInfo.class */
public final class RMBeaconReportInfo {
    public RMBizTypeEnum bizType;
    public String eventCode;
    public boolean isRealTime;
    public boolean isSuc;
    public String md5HexStr;
    public ArrayList<HashMap<String, String>> reportInfos;
    public int storeID;
    public int transType;

    public RMBeaconReportInfo() {
        this.eventCode = "";
        this.bizType = RMBizTypeEnum.values()[0];
        this.reportInfos = new ArrayList<>();
        this.md5HexStr = "";
    }

    public RMBizTypeEnum getBizType() {
        return this.bizType;
    }

    public String getEventCode() {
        return this.eventCode;
    }

    public boolean getIsRealTime() {
        return this.isRealTime;
    }

    public boolean getIsSuc() {
        return this.isSuc;
    }

    public String getMd5HexStr() {
        return this.md5HexStr;
    }

    public ArrayList<HashMap<String, String>> getReportInfos() {
        return this.reportInfos;
    }

    public int getStoreID() {
        return this.storeID;
    }

    public int getTransType() {
        return this.transType;
    }

    public String toString() {
        return "RMBeaconReportInfo{eventCode=" + this.eventCode + ",bizType=" + this.bizType + ",isSuc=" + this.isSuc + ",isRealTime=" + this.isRealTime + ",reportInfos=" + this.reportInfos + ",storeID=" + this.storeID + ",transType=" + this.transType + ",md5HexStr=" + this.md5HexStr + ",}";
    }

    public RMBeaconReportInfo(String str, RMBizTypeEnum rMBizTypeEnum, boolean z, boolean z2, ArrayList<HashMap<String, String>> arrayList, int i, int i2, String str2) {
        this.eventCode = "";
        this.bizType = RMBizTypeEnum.values()[0];
        this.reportInfos = new ArrayList<>();
        this.md5HexStr = "";
        this.eventCode = str;
        this.bizType = rMBizTypeEnum;
        this.isSuc = z;
        this.isRealTime = z2;
        this.reportInfos = arrayList;
        this.storeID = i;
        this.transType = i2;
        this.md5HexStr = str2;
    }
}
