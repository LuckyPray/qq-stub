package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AndroidImportTinyIdInfo.class */
public final class AndroidImportTinyIdInfo {
    public String friendUin;
    public String fromTinyId;
    public String selfTinyId;
    public String toTinyId;

    public AndroidImportTinyIdInfo() {
        this.friendUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.selfTinyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fromTinyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.toTinyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFriendUin() {
        return this.friendUin;
    }

    public String getFromTinyId() {
        return this.fromTinyId;
    }

    public String getSelfTinyId() {
        return this.selfTinyId;
    }

    public String getToTinyId() {
        return this.toTinyId;
    }

    public String toString() {
        return "AndroidImportTinyIdInfo{friendUin=" + this.friendUin + ",selfTinyId=" + this.selfTinyId + ",fromTinyId=" + this.fromTinyId + ",toTinyId=" + this.toTinyId + ",}";
    }

    public AndroidImportTinyIdInfo(String str, String str2, String str3, String str4) {
        this.friendUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.selfTinyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fromTinyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.toTinyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.friendUin = str;
        this.selfTinyId = str2;
        this.fromTinyId = str3;
        this.toTinyId = str4;
    }
}
