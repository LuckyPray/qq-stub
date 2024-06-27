package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UserDetailInfo.class */
public final class UserDetailInfo implements IKernelModel {
    public BaseExtendedInfo commonExt;
    public boolean isBuddy;
    public UserSimpleInfo simpleInfo;
    public String uid;
    public long uin;

    public UserDetailInfo() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public BaseExtendedInfo getCommonExt() {
        return this.commonExt;
    }

    public boolean getIsBuddy() {
        return this.isBuddy;
    }

    public UserSimpleInfo getSimpleInfo() {
        return this.simpleInfo;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public void setCommonExt(BaseExtendedInfo baseExtendedInfo) {
        this.commonExt = baseExtendedInfo;
    }

    public void setIsBuddy(boolean z) {
        this.isBuddy = z;
    }

    public void setSimpleInfo(UserSimpleInfo userSimpleInfo) {
        this.simpleInfo = userSimpleInfo;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUin(long j) {
        this.uin = j;
    }

    public String toString() {
        return "UserDetailInfo{uid=" + this.uid + ",uin=" + this.uin + ",isBuddy=" + this.isBuddy + ",simpleInfo=" + this.simpleInfo + ",commonExt=" + this.commonExt + ",}";
    }

    public UserDetailInfo(String str, long j, boolean z, UserSimpleInfo userSimpleInfo, BaseExtendedInfo baseExtendedInfo) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uid = str;
        this.uin = j;
        this.isBuddy = z;
        this.simpleInfo = userSimpleInfo;
        this.commonExt = baseExtendedInfo;
    }
}
