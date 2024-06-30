package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSCheckLikeRsp.class */
public final class OSCheckLikeRsp {
    public int businessType;
    public int errCode;
    public String errMsg;
    public ArrayList<OSUinLikeInfo> likeInfo;

    public OSCheckLikeRsp() {
        this.likeInfo = new ArrayList<>();
        this.errMsg = "";
    }

    public int getBusinessType() {
        return this.businessType;
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public ArrayList<OSUinLikeInfo> getLikeInfo() {
        return this.likeInfo;
    }

    public String toString() {
        return "OSCheckLikeRsp{businessType=" + this.businessType + ",likeInfo=" + this.likeInfo + ",errCode=" + this.errCode + ",errMsg=" + this.errMsg + ",}";
    }

    public OSCheckLikeRsp(int i, ArrayList<OSUinLikeInfo> arrayList, int i2, String str) {
        this.likeInfo = new ArrayList<>();
        this.errMsg = "";
        this.businessType = i;
        this.likeInfo = arrayList;
        this.errCode = i2;
        this.errMsg = str;
    }
}
