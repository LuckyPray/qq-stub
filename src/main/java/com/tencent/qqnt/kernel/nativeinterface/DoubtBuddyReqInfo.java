package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DoubtBuddyReqInfo.class */
public final class DoubtBuddyReqInfo {
    public int age;
    public int commFriendNum;
    public Long groupCode;
    public String msg;
    public String nameMore;
    public String nick;
    public String reason;
    public long reqTime;
    public int sex;
    public String source;
    public String uid;

    public DoubtBuddyReqInfo() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.source = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.reason = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getAge() {
        return this.age;
    }

    public int getCommFriendNum() {
        return this.commFriendNum;
    }

    public Long getGroupCode() {
        return this.groupCode;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getNameMore() {
        return this.nameMore;
    }

    public String getNick() {
        return this.nick;
    }

    public String getReason() {
        return this.reason;
    }

    public long getReqTime() {
        return this.reqTime;
    }

    public int getSex() {
        return this.sex;
    }

    public String getSource() {
        return this.source;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "DoubtBuddyReqInfo{uid=" + this.uid + ",nick=" + this.nick + ",age=" + this.age + ",sex=" + this.sex + ",commFriendNum=" + this.commFriendNum + ",reqTime=" + this.reqTime + ",msg=" + this.msg + ",source=" + this.source + ",reason=" + this.reason + ",groupCode=" + this.groupCode + ",nameMore=" + this.nameMore + ",}";
    }

    public DoubtBuddyReqInfo(String str, String str2, int i, int i2, int i3, long j, String str3, String str4, String str5, Long l, String str6) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.source = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.reason = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uid = str;
        this.nick = str2;
        this.age = i;
        this.sex = i2;
        this.commFriendNum = i3;
        this.reqTime = j;
        this.msg = str3;
        this.source = str4;
        this.reason = str5;
        this.groupCode = l;
        this.nameMore = str6;
    }
}
