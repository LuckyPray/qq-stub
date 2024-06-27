package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NoticePattonInfo.class */
public final class NoticePattonInfo {
    public int pattonType;
    public PlainTxtInfo plainTxt = new PlainTxtInfo();
    public LeftTxtRightPicInfo lefttxtRightPic = new LeftTxtRightPicInfo();

    public LeftTxtRightPicInfo getLefttxtRightPic() {
        return this.lefttxtRightPic;
    }

    public int getPattonType() {
        return this.pattonType;
    }

    public PlainTxtInfo getPlainTxt() {
        return this.plainTxt;
    }
}
