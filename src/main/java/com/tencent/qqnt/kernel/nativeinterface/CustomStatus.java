package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CustomStatus.class */
public final class CustomStatus {
    public long faceId;
    public long faceType;
    public String wording;

    public CustomStatus() {
        this.wording = "";
    }

    public long getFaceId() {
        return this.faceId;
    }

    public long getFaceType() {
        return this.faceType;
    }

    public String getWording() {
        return this.wording;
    }

    public String toString() {
        return "CustomStatus{faceId=" + this.faceId + ",faceType=" + this.faceType + ",wording=" + this.wording + ",}";
    }

    public CustomStatus(long j, long j2, String str) {
        this.wording = "";
        this.faceId = j;
        this.faceType = j2;
        this.wording = str;
    }
}
