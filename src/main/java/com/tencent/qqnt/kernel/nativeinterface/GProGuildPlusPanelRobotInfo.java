package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildPlusPanelRobotInfo.class */
public final class GProGuildPlusPanelRobotInfo {
    public long appid;
    public String avatar;
    public int inlineSearch;
    public long mark;
    public String name;
    public long tinyid;
    public String uid;
    public long uin;

    public GProGuildPlusPanelRobotInfo() {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getAppid() {
        return this.appid;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public int getInlineSearch() {
        return this.inlineSearch;
    }

    public long getMark() {
        return this.mark;
    }

    public String getName() {
        return this.name;
    }

    public long getTinyid() {
        return this.tinyid;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "GProGuildPlusPanelRobotInfo{tinyid=" + this.tinyid + ",uin=" + this.uin + ",name=" + this.name + ",inlineSearch=" + this.inlineSearch + ",appid=" + this.appid + ",mark=" + this.mark + ",uid=" + this.uid + ",avatar=" + this.avatar + ",}";
    }

    public GProGuildPlusPanelRobotInfo(long j, long j2, String str, int i, long j3, long j4, String str2, String str3) {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tinyid = j;
        this.uin = j2;
        this.name = str;
        this.inlineSearch = i;
        this.appid = j3;
        this.mark = j4;
        this.uid = str2;
        this.avatar = str3;
    }
}
