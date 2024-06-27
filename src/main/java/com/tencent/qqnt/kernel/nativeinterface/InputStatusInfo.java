package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InputStatusInfo.class */
public final class InputStatusInfo {
    public int chatType;
    public int eventType;
    public String fromUin;
    public long interval;
    public long showTime;
    public String statusText;
    public long timestamp;
    public String toUin;

    public InputStatusInfo() {
        this.fromUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.toUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.statusText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getChatType() {
        return this.chatType;
    }

    public int getEventType() {
        return this.eventType;
    }

    public String getFromUin() {
        return this.fromUin;
    }

    public long getInterval() {
        return this.interval;
    }

    public long getShowTime() {
        return this.showTime;
    }

    public String getStatusText() {
        return this.statusText;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String getToUin() {
        return this.toUin;
    }

    public String toString() {
        return "InputStatusInfo{chatType=" + this.chatType + ",fromUin=" + this.fromUin + ",toUin=" + this.toUin + ",interval=" + this.interval + ",showTime=" + this.showTime + ",eventType=" + this.eventType + ",statusText=" + this.statusText + ",timestamp=" + this.timestamp + ",}";
    }

    public InputStatusInfo(int i, String str, String str2, long j, long j2, int i2, String str3, long j3) {
        this.fromUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.toUin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.statusText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.chatType = i;
        this.fromUin = str;
        this.toUin = str2;
        this.interval = j;
        this.showTime = j2;
        this.eventType = i2;
        this.statusText = str3;
        this.timestamp = j3;
    }
}
