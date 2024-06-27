package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GproEmojiDownloadParams.class */
public final class GproEmojiDownloadParams {
    public String md5;
    public String resId;
    public String url;

    public GproEmojiDownloadParams() {
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.resId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getResId() {
        return this.resId;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "GproEmojiDownloadParams{url=" + this.url + ",resId=" + this.resId + ",md5=" + this.md5 + ",}";
    }

    public GproEmojiDownloadParams(String str, String str2, String str3) {
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.resId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = str;
        this.resId = str2;
        this.md5 = str3;
    }
}
