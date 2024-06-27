package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SecurityInfo.class */
public final class SecurityInfo {
    public ArrayList<SecurityButton> buttons;
    public String wording;

    public SecurityInfo() {
        this.wording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.buttons = new ArrayList<>();
    }

    public ArrayList<SecurityButton> getButtons() {
        return this.buttons;
    }

    public String getWording() {
        return this.wording;
    }

    public String toString() {
        return "SecurityInfo{wording=" + this.wording + ",buttons=" + this.buttons + ",}";
    }

    public SecurityInfo(String str, ArrayList<SecurityButton> arrayList) {
        this.wording = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.buttons = new ArrayList<>();
        this.wording = str;
        this.buttons = arrayList;
    }
}
