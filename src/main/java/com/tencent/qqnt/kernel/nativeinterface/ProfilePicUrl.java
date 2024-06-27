package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ProfilePicUrl.class */
public final class ProfilePicUrl {
    public String picPath;
    public String picUrl;

    public ProfilePicUrl() {
        this.picUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.picPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public String toString() {
        return "ProfilePicUrl{picUrl=" + this.picUrl + ",picPath=" + this.picPath + ",}";
    }

    public ProfilePicUrl(String str, String str2) {
        this.picUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.picPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.picUrl = str;
        this.picPath = str2;
    }
}
