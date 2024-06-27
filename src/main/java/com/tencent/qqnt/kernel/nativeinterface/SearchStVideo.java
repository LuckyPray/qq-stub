package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchStVideo.class */
public final class SearchStVideo {
    public int duration;
    public int fileSize;
    public int height;
    public String playUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public int width;

    public int getDuration() {
        return this.duration;
    }

    public int getFileSize() {
        return this.fileSize;
    }

    public int getHeight() {
        return this.height;
    }

    public String getPlayUrl() {
        return this.playUrl;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "SearchStVideo{fileSize=" + this.fileSize + ",duration=" + this.duration + ",width=" + this.width + ",height=" + this.height + ",playUrl=" + this.playUrl + ",}";
    }
}
