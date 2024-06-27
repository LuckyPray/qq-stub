package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SetServiceAssistantSwitchReq.class */
public final class SetServiceAssistantSwitchReq {
    public Long appId;
    public Integer appType;
    public int msgSwitch;
    public int msgType;
    public HashMap<String, Integer> templateMap;

    public SetServiceAssistantSwitchReq() {
        this.templateMap = new HashMap<>();
    }

    public Long getAppId() {
        return this.appId;
    }

    public Integer getAppType() {
        return this.appType;
    }

    public int getMsgSwitch() {
        return this.msgSwitch;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public HashMap<String, Integer> getTemplateMap() {
        return this.templateMap;
    }

    public String toString() {
        return "SetServiceAssistantSwitchReq{msgSwitch=" + this.msgSwitch + ",msgType=" + this.msgType + ",appType=" + this.appType + ",appId=" + this.appId + ",templateMap=" + this.templateMap + ",}";
    }

    public SetServiceAssistantSwitchReq(int i, int i2, Integer num, Long l, HashMap<String, Integer> hashMap) {
        this.templateMap = new HashMap<>();
        this.msgSwitch = i;
        this.msgType = i2;
        this.appType = num;
        this.appId = l;
        this.templateMap = hashMap;
    }
}
