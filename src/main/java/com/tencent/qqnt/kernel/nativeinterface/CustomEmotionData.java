package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CustomEmotionData.class */
public final class CustomEmotionData {
    public String RomaingType;
    public int clickNum;
    public String desc;
    public String eId;
    public int emoId;
    public String emoOriginalPath;
    public String emoPath;
    public String epId;
    public int exposeNum;
    public boolean isAPNG;
    public boolean isExist;
    public boolean isMarkFace;
    public String md5;
    public String modifyWord;
    public String ocrWord;
    public String resId;
    public String thumbPath;
    public String uin;
    public String url;

    public CustomEmotionData() {
        this.uin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.emoPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.resId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.emoOriginalPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.thumbPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.RomaingType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.epId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.ocrWord = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.modifyWord = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getClickNum() {
        return this.clickNum;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getEId() {
        return this.eId;
    }

    public int getEmoId() {
        return this.emoId;
    }

    public String getEmoOriginalPath() {
        return this.emoOriginalPath;
    }

    public String getEmoPath() {
        return this.emoPath;
    }

    public String getEpId() {
        return this.epId;
    }

    public int getExposeNum() {
        return this.exposeNum;
    }

    public boolean getIsAPNG() {
        return this.isAPNG;
    }

    public boolean getIsExist() {
        return this.isExist;
    }

    public boolean getIsMarkFace() {
        return this.isMarkFace;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getModifyWord() {
        return this.modifyWord;
    }

    public String getOcrWord() {
        return this.ocrWord;
    }

    public String getResId() {
        return this.resId;
    }

    public String getRomaingType() {
        return this.RomaingType;
    }

    public String getThumbPath() {
        return this.thumbPath;
    }

    public String getUin() {
        return this.uin;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "CustomEmotionData{uin=" + this.uin + ",emoId=" + this.emoId + ",emoPath=" + this.emoPath + ",isExist=" + this.isExist + ",resId=" + this.resId + ",url=" + this.url + ",md5=" + this.md5 + ",emoOriginalPath=" + this.emoOriginalPath + ",thumbPath=" + this.thumbPath + ",RomaingType=" + this.RomaingType + ",isAPNG=" + this.isAPNG + ",isMarkFace=" + this.isMarkFace + ",eId=" + this.eId + ",epId=" + this.epId + ",ocrWord=" + this.ocrWord + ",modifyWord=" + this.modifyWord + ",exposeNum=" + this.exposeNum + ",clickNum=" + this.clickNum + ",desc=" + this.desc + ",}";
    }

    public CustomEmotionData(String str, int i, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z3, String str9, String str10, String str11, String str12, int i2, int i3, String str13) {
        this.uin = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.emoPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.resId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.emoOriginalPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.thumbPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.RomaingType = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.eId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.epId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.ocrWord = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.modifyWord = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uin = str;
        this.emoId = i;
        this.emoPath = str2;
        this.isExist = z;
        this.resId = str3;
        this.url = str4;
        this.md5 = str5;
        this.emoOriginalPath = str6;
        this.thumbPath = str7;
        this.RomaingType = str8;
        this.isAPNG = z2;
        this.isMarkFace = z3;
        this.eId = str9;
        this.epId = str10;
        this.ocrWord = str11;
        this.modifyWord = str12;
        this.exposeNum = i2;
        this.clickNum = i3;
        this.desc = str13;
    }
}
