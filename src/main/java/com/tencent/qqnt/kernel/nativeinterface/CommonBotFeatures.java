package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CommonBotFeatures.class */
public final class CommonBotFeatures {
    public CommonBotInfo botInfo;
    public ArrayList<CommonBotFeatureInfo> commandInfo;
    public ArrayList<CommonBotFeatureInfo> serviceInfo;

    public CommonBotFeatures() {
        this.botInfo = new CommonBotInfo();
        this.serviceInfo = new ArrayList<>();
        this.commandInfo = new ArrayList<>();
    }

    public CommonBotInfo getBotInfo() {
        return this.botInfo;
    }

    public ArrayList<CommonBotFeatureInfo> getCommandInfo() {
        return this.commandInfo;
    }

    public ArrayList<CommonBotFeatureInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    public String toString() {
        return "CommonBotFeatures{botInfo=" + this.botInfo + ",serviceInfo=" + this.serviceInfo + ",commandInfo=" + this.commandInfo + ",}";
    }

    public CommonBotFeatures(CommonBotInfo commonBotInfo, ArrayList<CommonBotFeatureInfo> arrayList, ArrayList<CommonBotFeatureInfo> arrayList2) {
        this.botInfo = new CommonBotInfo();
        this.serviceInfo = new ArrayList<>();
        this.commandInfo = new ArrayList<>();
        this.botInfo = commonBotInfo;
        this.serviceInfo = arrayList;
        this.commandInfo = arrayList2;
    }
}
