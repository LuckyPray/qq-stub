package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FirstGroupBulletinInfo.class */
public final class FirstGroupBulletinInfo {
    public int appid;
    public long fromUin;
    public long groupCode;
    public long groupId;
    public long msgSeq;
    public long msgTime;
    public long msgType;
    public long msgUid;
    public long subType;
    public long toUin;
    public String fromUid = "";
    public ArrayList<FirstGroupBulletContent> firstContents = new ArrayList<>();

    public int getAppid() {
        return this.appid;
    }

    public ArrayList<FirstGroupBulletContent> getFirstContents() {
        return this.firstContents;
    }

    public String getFromUid() {
        return this.fromUid;
    }

    public long getFromUin() {
        return this.fromUin;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public long getMsgType() {
        return this.msgType;
    }

    public long getMsgUid() {
        return this.msgUid;
    }

    public long getSubType() {
        return this.subType;
    }

    public long getToUin() {
        return this.toUin;
    }

    public String toString() {
        return "FirstGroupBulletinInfo{fromUin=" + this.fromUin + ",fromUid=" + this.fromUid + ",toUin=" + this.toUin + ",msgTime=" + this.msgTime + ",msgType=" + this.msgType + ",subType=" + this.subType + ",msgSeq=" + this.msgSeq + ",msgUid=" + this.msgUid + ",groupId=" + this.groupId + ",groupCode=" + this.groupCode + ",appid=" + this.appid + ",firstContents=" + this.firstContents + ",}";
    }
}
