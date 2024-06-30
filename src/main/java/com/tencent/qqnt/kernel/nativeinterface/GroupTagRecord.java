package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupTagRecord.class */
public final class GroupTagRecord {
    public int badNum;
    public int goodNum;
    public long groupCode;
    public long setTime;
    public int tagLen;
    public String fromUid = "";
    public String tagId = "";
    public String tagValue = "";

    public int getBadNum() {
        return this.badNum;
    }

    public String getFromUid() {
        return this.fromUid;
    }

    public int getGoodNum() {
        return this.goodNum;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public long getSetTime() {
        return this.setTime;
    }

    public String getTagId() {
        return this.tagId;
    }

    public int getTagLen() {
        return this.tagLen;
    }

    public String getTagValue() {
        return this.tagValue;
    }

    public String toString() {
        return "GroupTagRecord{fromUid=" + this.fromUid + ",groupCode=" + this.groupCode + ",tagId=" + this.tagId + ",setTime=" + this.setTime + ",goodNum=" + this.goodNum + ",badNum=" + this.badNum + ",tagLen=" + this.tagLen + ",tagValue=" + this.tagValue + ",}";
    }
}
