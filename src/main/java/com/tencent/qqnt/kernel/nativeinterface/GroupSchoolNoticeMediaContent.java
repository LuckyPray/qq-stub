package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolNoticeMediaContent.class */
public final class GroupSchoolNoticeMediaContent {
    public String coverUrl;
    public long duration;
    public int fileType;
    public int height;
    public String md5;
    public String name;
    public long size;
    public String url;
    public int width;

    public GroupSchoolNoticeMediaContent() {
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.coverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getFileType() {
        return this.fileType;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "GroupSchoolNoticeMediaContent{url=" + this.url + ",md5=" + this.md5 + ",name=" + this.name + ",size=" + this.size + ",duration=" + this.duration + ",coverUrl=" + this.coverUrl + ",fileType=" + this.fileType + ",height=" + this.height + ",width=" + this.width + ",}";
    }

    public GroupSchoolNoticeMediaContent(String str, String str2, String str3, long j, long j2, String str4, int i, int i2, int i3) {
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.coverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = str;
        this.md5 = str2;
        this.name = str3;
        this.size = j;
        this.duration = j2;
        this.coverUrl = str4;
        this.fileType = i;
        this.height = i2;
        this.width = i3;
    }
}
