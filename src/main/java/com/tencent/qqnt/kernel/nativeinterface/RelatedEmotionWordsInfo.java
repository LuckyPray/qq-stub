package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RelatedEmotionWordsInfo.class */
public final class RelatedEmotionWordsInfo {
    public int age;
    public int count;
    public int gender;
    public String uiVersion;
    public String uid;
    public String word;

    public RelatedEmotionWordsInfo() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.word = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uiVersion = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getAge() {
        return this.age;
    }

    public int getCount() {
        return this.count;
    }

    public int getGender() {
        return this.gender;
    }

    public String getUiVersion() {
        return this.uiVersion;
    }

    public String getUid() {
        return this.uid;
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {
        return "RelatedEmotionWordsInfo{uid=" + this.uid + ",word=" + this.word + ",uiVersion=" + this.uiVersion + ",gender=" + this.gender + ",age=" + this.age + ",count=" + this.count + ",}";
    }

    public RelatedEmotionWordsInfo(String str, String str2, String str3, int i, int i2, int i3) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.word = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uiVersion = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uid = str;
        this.word = str2;
        this.uiVersion = str3;
        this.gender = i;
        this.age = i2;
        this.count = i3;
    }
}
