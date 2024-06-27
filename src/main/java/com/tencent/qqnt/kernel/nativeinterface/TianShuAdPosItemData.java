package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TianShuAdPosItemData.class */
public final class TianShuAdPosItemData {
    public HashMap<String, String> mExtraData;
    public int mNeedCnt;
    public int mPosId;

    public TianShuAdPosItemData() {
    }

    public HashMap<String, String> getMExtraData() {
        return this.mExtraData;
    }

    public int getMNeedCnt() {
        return this.mNeedCnt;
    }

    public int getMPosId() {
        return this.mPosId;
    }

    public String toString() {
        return "TianShuAdPosItemData{mPosId=" + this.mPosId + ",mNeedCnt=" + this.mNeedCnt + ",mExtraData=" + this.mExtraData + ",}";
    }

    public TianShuAdPosItemData(int i, int i2, HashMap<String, String> hashMap) {
        this.mPosId = i;
        this.mNeedCnt = i2;
        this.mExtraData = hashMap;
    }
}
