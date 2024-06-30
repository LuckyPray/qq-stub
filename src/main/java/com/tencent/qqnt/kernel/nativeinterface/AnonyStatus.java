package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AnonyStatus.class */
public final class AnonyStatus {
    public int forbidTalking;
    public String statusInfo;

    public AnonyStatus() {
        this.statusInfo = "";
    }

    public int getForbidTalking() {
        return this.forbidTalking;
    }

    public String getStatusInfo() {
        return this.statusInfo;
    }

    public String toString() {
        return "AnonyStatus{forbidTalking=" + this.forbidTalking + ",statusInfo=" + this.statusInfo + ",}";
    }

    public AnonyStatus(int i, String str) {
        this.statusInfo = "";
        this.forbidTalking = i;
        this.statusInfo = str;
    }
}
