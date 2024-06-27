package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupBulletinFeedMsg.class */
public final class GroupBulletinFeedMsg {
    public String text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String textFace = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<GroupBulletinPicInfo> pics = new ArrayList<>();
    public String title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public ArrayList<GroupBulletinPicInfo> getPics() {
        return this.pics;
    }

    public String getText() {
        return this.text;
    }

    public String getTextFace() {
        return this.textFace;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "GroupBulletinFeedMsg{text=" + this.text + ",textFace=" + this.textFace + ",pics=" + this.pics + ",title=" + this.title + ",}";
    }
}
