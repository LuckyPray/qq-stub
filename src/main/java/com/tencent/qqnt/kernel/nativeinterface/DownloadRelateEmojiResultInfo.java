package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DownloadRelateEmojiResultInfo.class */
public final class DownloadRelateEmojiResultInfo {
    public int clickNum;
    public String eId;
    public int eIdHeight;
    public int eIdIsAPNG;
    public String eIdName;
    public int eIdWeight;
    public int emojiId;
    public String encryptKey;
    public int epId;
    public int exposeNum;
    public boolean isMarkFace;
    public String md5;
    public String msg;
    public String path;
    public RecommentEmojiType recommentEmojiType;
    public String resId;
    public int result;
    public String uin;
    public String url;
    public String word;

    public DownloadRelateEmojiResultInfo() {
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.path = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recommentEmojiType = RecommentEmojiType.values()[0];
        this.resId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eIdName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.encryptKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.word = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getClickNum() {
        return this.clickNum;
    }

    public String getEId() {
        return this.eId;
    }

    public int getEIdHeight() {
        return this.eIdHeight;
    }

    public int getEIdIsAPNG() {
        return this.eIdIsAPNG;
    }

    public String getEIdName() {
        return this.eIdName;
    }

    public int getEIdWeight() {
        return this.eIdWeight;
    }

    public int getEmojiId() {
        return this.emojiId;
    }

    public String getEncryptKey() {
        return this.encryptKey;
    }

    public int getEpId() {
        return this.epId;
    }

    public int getExposeNum() {
        return this.exposeNum;
    }

    public boolean getIsMarkFace() {
        return this.isMarkFace;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getPath() {
        return this.path;
    }

    public RecommentEmojiType getRecommentEmojiType() {
        return this.recommentEmojiType;
    }

    public String getResId() {
        return this.resId;
    }

    public int getResult() {
        return this.result;
    }

    public String getUin() {
        return this.uin;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {
        return "DownloadRelateEmojiResultInfo{result=" + this.result + ",msg=" + this.msg + ",path=" + this.path + ",recommentEmojiType=" + this.recommentEmojiType + ",emojiId=" + this.emojiId + ",resId=" + this.resId + ",uin=" + this.uin + ",url=" + this.url + ",isMarkFace=" + this.isMarkFace + ",exposeNum=" + this.exposeNum + ",clickNum=" + this.clickNum + ",epId=" + this.epId + ",eId=" + this.eId + ",eIdName=" + this.eIdName + ",encryptKey=" + this.encryptKey + ",eIdWeight=" + this.eIdWeight + ",eIdHeight=" + this.eIdHeight + ",eIdIsAPNG=" + this.eIdIsAPNG + ",md5=" + this.md5 + ",word=" + this.word + ",}";
    }

    public DownloadRelateEmojiResultInfo(int i, String str, String str2, RecommentEmojiType recommentEmojiType, int i2, String str3, String str4, String str5, boolean z, int i3, int i4, int i5, String str6, String str7, String str8, int i6, int i7, int i8, String str9, String str10) {
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.path = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recommentEmojiType = RecommentEmojiType.values()[0];
        this.resId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eIdName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.encryptKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.word = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.result = i;
        this.msg = str;
        this.path = str2;
        this.recommentEmojiType = recommentEmojiType;
        this.emojiId = i2;
        this.resId = str3;
        this.uin = str4;
        this.url = str5;
        this.isMarkFace = z;
        this.exposeNum = i3;
        this.clickNum = i4;
        this.epId = i5;
        this.eId = str6;
        this.eIdName = str7;
        this.encryptKey = str8;
        this.eIdWeight = i6;
        this.eIdHeight = i7;
        this.eIdIsAPNG = i8;
        this.md5 = str9;
        this.word = str10;
    }
}
