package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StatusInfo.class */
public final class StatusInfo implements IKernelModel {
    public int abiFlag;
    public int batteryStatus;
    public CustomStatus customStatus;
    public int eNetworkType;
    public int extStatus;
    public int iconType;
    public int netType;
    public long setTime;
    public int specialFlag;
    public int status;
    public int termType;
    public long uin;
    public String uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String showName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String termDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public StatusMusicInfo musicInfo = new StatusMusicInfo();
    public StatusBusinessInfo extOnlineBusinessInfo = new StatusBusinessInfo();
    public StatusExtBuffer extBuffer = new StatusExtBuffer();

    public int getAbiFlag() {
        return this.abiFlag;
    }

    public int getBatteryStatus() {
        return this.batteryStatus;
    }

    public CustomStatus getCustomStatus() {
        return this.customStatus;
    }

    public int getENetworkType() {
        return this.eNetworkType;
    }

    public StatusExtBuffer getExtBuffer() {
        return this.extBuffer;
    }

    public StatusBusinessInfo getExtOnlineBusinessInfo() {
        return this.extOnlineBusinessInfo;
    }

    public int getExtStatus() {
        return this.extStatus;
    }

    public int getIconType() {
        return this.iconType;
    }

    public StatusMusicInfo getMusicInfo() {
        return this.musicInfo;
    }

    public int getNetType() {
        return this.netType;
    }

    public long getSetTime() {
        return this.setTime;
    }

    public String getShowName() {
        return this.showName;
    }

    public int getSpecialFlag() {
        return this.specialFlag;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTermDesc() {
        return this.termDesc;
    }

    public int getTermType() {
        return this.termType;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public void setAbiFlag(int i) {
        this.abiFlag = i;
    }

    public void setBatteryStatus(int i) {
        this.batteryStatus = i;
    }

    public void setCustomStatus(CustomStatus customStatus) {
        this.customStatus = customStatus;
    }

    public void setENetworkType(int i) {
        this.eNetworkType = i;
    }

    public void setExtBuffer(StatusExtBuffer statusExtBuffer) {
        this.extBuffer = statusExtBuffer;
    }

    public void setExtOnlineBusinessInfo(StatusBusinessInfo statusBusinessInfo) {
        this.extOnlineBusinessInfo = statusBusinessInfo;
    }

    public void setExtStatus(int i) {
        this.extStatus = i;
    }

    public void setIconType(int i) {
        this.iconType = i;
    }

    public void setMusicInfo(StatusMusicInfo statusMusicInfo) {
        this.musicInfo = statusMusicInfo;
    }

    public void setNetType(int i) {
        this.netType = i;
    }

    public void setSetTime(long j) {
        this.setTime = j;
    }

    public void setShowName(String str) {
        this.showName = str;
    }

    public void setSpecialFlag(int i) {
        this.specialFlag = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTermDesc(String str) {
        this.termDesc = str;
    }

    public void setTermType(int i) {
        this.termType = i;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUin(long j) {
        this.uin = j;
    }

    public String toString() {
        return "StatusInfo{uid=" + this.uid + ",uin=" + this.uin + ",status=" + this.status + ",extStatus=" + this.extStatus + ",batteryStatus=" + this.batteryStatus + ",termType=" + this.termType + ",netType=" + this.netType + ",iconType=" + this.iconType + ",customStatus=" + this.customStatus + ",setTime=" + this.setTime + ",specialFlag=" + this.specialFlag + ",abiFlag=" + this.abiFlag + ",eNetworkType=" + this.eNetworkType + ",showName=" + this.showName + ",termDesc=" + this.termDesc + ",musicInfo=" + this.musicInfo + ",extOnlineBusinessInfo=" + this.extOnlineBusinessInfo + ",extBuffer=" + this.extBuffer + ",}";
    }
}
