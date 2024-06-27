package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DataImportGameChatSession.class */
public final class DataImportGameChatSession {
    public String friendUin;
    public String fromOpenId;
    public String fromRoleId;
    public long fromTinyId;
    public long gameAppId;
    public String nickName;
    public int redpointSwitch;
    public int sayHiType;
    public String toOpenId;
    public String toRoleId;
    public long toTinyId;
    public long windowFlag;

    public DataImportGameChatSession() {
        this.friendUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fromRoleId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fromOpenId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.toRoleId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.toOpenId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFriendUin() {
        return this.friendUin;
    }

    public String getFromOpenId() {
        return this.fromOpenId;
    }

    public String getFromRoleId() {
        return this.fromRoleId;
    }

    public long getFromTinyId() {
        return this.fromTinyId;
    }

    public long getGameAppId() {
        return this.gameAppId;
    }

    public String getNickName() {
        return this.nickName;
    }

    public int getRedpointSwitch() {
        return this.redpointSwitch;
    }

    public int getSayHiType() {
        return this.sayHiType;
    }

    public String getToOpenId() {
        return this.toOpenId;
    }

    public String getToRoleId() {
        return this.toRoleId;
    }

    public long getToTinyId() {
        return this.toTinyId;
    }

    public long getWindowFlag() {
        return this.windowFlag;
    }

    public String toString() {
        return "DataImportGameChatSession{friendUin=" + this.friendUin + ",fromRoleId=" + this.fromRoleId + ",fromOpenId=" + this.fromOpenId + ",toRoleId=" + this.toRoleId + ",toOpenId=" + this.toOpenId + ",gameAppId=" + this.gameAppId + ",fromTinyId=" + this.fromTinyId + ",toTinyId=" + this.toTinyId + ",windowFlag=" + this.windowFlag + ",nickName=" + this.nickName + ",redpointSwitch=" + this.redpointSwitch + ",sayHiType=" + this.sayHiType + ",}";
    }

    public DataImportGameChatSession(String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, long j4, String str6, int i, int i2) {
        this.friendUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fromRoleId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fromOpenId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.toRoleId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.toOpenId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.friendUin = str;
        this.fromRoleId = str2;
        this.fromOpenId = str3;
        this.toRoleId = str4;
        this.toOpenId = str5;
        this.gameAppId = j;
        this.fromTinyId = j2;
        this.toTinyId = j3;
        this.windowFlag = j4;
        this.nickName = str6;
        this.redpointSwitch = i;
        this.sayHiType = i2;
    }
}
