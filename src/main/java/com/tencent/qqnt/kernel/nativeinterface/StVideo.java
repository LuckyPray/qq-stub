package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StVideo.class */
public final class StVideo {
    public StImage cover;
    public int height;

    /* renamed from: id */
    public String f48id;
    public String url;
    public long videoTime;
    public ArrayList<StPicSpecUrlEntry> videoUrl;
    public int width;

    public StVideo() {
        this.f48id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cover = new StImage();
        this.videoUrl = new ArrayList<>();
    }

    public StImage getCover() {
        return this.cover;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f48id;
    }

    public String getUrl() {
        return this.url;
    }

    public long getVideoTime() {
        return this.videoTime;
    }

    public ArrayList<StPicSpecUrlEntry> getVideoUrl() {
        return this.videoUrl;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCover(StImage stImage) {
        this.cover = stImage;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(String str) {
        this.f48id = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVideoTime(long j) {
        this.videoTime = j;
    }

    public void setVideoUrl(ArrayList<StPicSpecUrlEntry> arrayList) {
        this.videoUrl = arrayList;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public StVideo(String str, String str2, StImage stImage, int i, int i2, long j, ArrayList<StPicSpecUrlEntry> arrayList) {
        this.f48id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cover = new StImage();
        this.videoUrl = new ArrayList<>();
        this.f48id = str;
        this.url = str2;
        this.cover = stImage;
        this.width = i;
        this.height = i2;
        this.videoTime = j;
        this.videoUrl = arrayList;
    }
}
