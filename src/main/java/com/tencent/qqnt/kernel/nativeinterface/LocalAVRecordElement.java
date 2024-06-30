package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/LocalAVRecordElement.class */
public final class LocalAVRecordElement {
    public String avAbstract;
    public Integer extraType;
    public boolean hasRead;
    public long sendTime;
    public int sendType;
    public String senderUid;
    public String text;
    public long time;
    public int type;

    public LocalAVRecordElement() {
        this.senderUid = "";
        this.text = "";
        this.avAbstract = "";
    }

    public String getAvAbstract() {
        return this.avAbstract;
    }

    public Integer getExtraType() {
        return this.extraType;
    }

    public boolean getHasRead() {
        return this.hasRead;
    }

    public long getSendTime() {
        return this.sendTime;
    }

    public int getSendType() {
        return this.sendType;
    }

    public String getSenderUid() {
        return this.senderUid;
    }

    public String getText() {
        return this.text;
    }

    public long getTime() {
        return this.time;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "LocalAVRecordElement{type=" + this.type + ",time=" + this.time + ",senderUid=" + this.senderUid + ",sendType=" + this.sendType + ",text=" + this.text + ",avAbstract=" + this.avAbstract + ",hasRead=" + this.hasRead + ",sendTime=" + this.sendTime + ",extraType=" + this.extraType + ",}";
    }

    public LocalAVRecordElement(int i, long j, String str, int i2, String str2, String str3, boolean z, long j2, Integer num) {
        this.senderUid = "";
        this.text = "";
        this.avAbstract = "";
        this.type = i;
        this.time = j;
        this.senderUid = str;
        this.sendType = i2;
        this.text = str2;
        this.avAbstract = str3;
        this.hasRead = z;
        this.sendTime = j2;
        this.extraType = num;
    }
}
