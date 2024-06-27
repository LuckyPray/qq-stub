package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MenuInfo.class */
public final class MenuInfo {
    public CommonBotInfo botInfo = new CommonBotInfo();
    public ArrayList<CommonBotFeatureInfo> featureInfo = new ArrayList<>();

    public CommonBotInfo getBotInfo() {
        return this.botInfo;
    }

    public ArrayList<CommonBotFeatureInfo> getFeatureInfo() {
        return this.featureInfo;
    }

    public String toString() {
        return "MenuInfo{botInfo=" + this.botInfo + ",featureInfo=" + this.featureInfo + ",}";
    }
}
