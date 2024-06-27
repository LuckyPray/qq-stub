package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SecurityButton.class */
public final class SecurityButton {
    public JumpType jumpType;
    public String url;
    public String wording;

    public SecurityButton() {
        this.wording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.jumpType = JumpType.values()[0];
    }

    public JumpType getJumpType() {
        return this.jumpType;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWording() {
        return this.wording;
    }

    public String toString() {
        return "SecurityButton{wording=" + this.wording + ",url=" + this.url + ",jumpType=" + this.jumpType + ",}";
    }

    public SecurityButton(String str, String str2, JumpType jumpType) {
        this.wording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.jumpType = JumpType.values()[0];
        this.wording = str;
        this.url = str2;
        this.jumpType = jumpType;
    }
}
