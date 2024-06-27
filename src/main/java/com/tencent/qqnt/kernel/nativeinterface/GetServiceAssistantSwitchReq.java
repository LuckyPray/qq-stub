package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetServiceAssistantSwitchReq.class */
public final class GetServiceAssistantSwitchReq {
    public Long appId;
    public Integer appType;
    public int msgType;

    public GetServiceAssistantSwitchReq() {
    }

    public Long getAppId() {
        return this.appId;
    }

    public Integer getAppType() {
        return this.appType;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public String toString() {
        return "GetServiceAssistantSwitchReq{msgType=" + this.msgType + ",appType=" + this.appType + ",appId=" + this.appId + ",}";
    }

    public GetServiceAssistantSwitchReq(int i, Integer num, Long l) {
        this.msgType = i;
        this.appType = num;
        this.appId = l;
    }
}
