package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UserSimpleInfo.class */
public final class UserSimpleInfo implements IKernelModel {
    public BaseInfo baseInfo;
    public CoreInfo coreInfo;
    public Intimate intimate;
    public boolean isBuddy;
    public OtherFlag otherFlags;
    public RelationFlag relationFlags;
    public StatusInfo status;
    public String uid;
    public long uin;
    public VasInfo vasInfo;

    public UserSimpleInfo() {
        this.uid = "";
    }

    public BaseInfo getBaseInfo() {
        return this.baseInfo;
    }

    public CoreInfo getCoreInfo() {
        return this.coreInfo;
    }

    public Intimate getIntimate() {
        return this.intimate;
    }

    public boolean getIsBuddy() {
        return this.isBuddy;
    }

    public OtherFlag getOtherFlags() {
        return this.otherFlags;
    }

    public RelationFlag getRelationFlags() {
        return this.relationFlags;
    }

    public StatusInfo getStatus() {
        return this.status;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public VasInfo getVasInfo() {
        return this.vasInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public void setCoreInfo(CoreInfo coreInfo) {
        this.coreInfo = coreInfo;
    }

    public void setIntimate(Intimate intimate) {
        this.intimate = intimate;
    }

    public void setIsBuddy(boolean z) {
        this.isBuddy = z;
    }

    public void setOtherFlags(OtherFlag otherFlag) {
        this.otherFlags = otherFlag;
    }

    public void setRelationFlags(RelationFlag relationFlag) {
        this.relationFlags = relationFlag;
    }

    public void setStatus(StatusInfo statusInfo) {
        this.status = statusInfo;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUin(long j) {
        this.uin = j;
    }

    public void setVasInfo(VasInfo vasInfo) {
        this.vasInfo = vasInfo;
    }

    public String toString() {
        return "UserSimpleInfo{uid=" + this.uid + ",uin=" + this.uin + ",isBuddy=" + this.isBuddy + ",coreInfo=" + this.coreInfo + ",baseInfo=" + this.baseInfo + ",status=" + this.status + ",vasInfo=" + this.vasInfo + ",relationFlags=" + this.relationFlags + ",otherFlags=" + this.otherFlags + ",intimate=" + this.intimate + ",}";
    }

    public UserSimpleInfo(String str, long j, boolean z, CoreInfo coreInfo, BaseInfo baseInfo, StatusInfo statusInfo, VasInfo vasInfo, RelationFlag relationFlag, OtherFlag otherFlag, Intimate intimate) {
        this.uid = "";
        this.uid = str;
        this.uin = j;
        this.isBuddy = z;
        this.coreInfo = coreInfo;
        this.baseInfo = baseInfo;
        this.status = statusInfo;
        this.vasInfo = vasInfo;
        this.relationFlags = relationFlag;
        this.otherFlags = otherFlag;
        this.intimate = intimate;
    }
}
