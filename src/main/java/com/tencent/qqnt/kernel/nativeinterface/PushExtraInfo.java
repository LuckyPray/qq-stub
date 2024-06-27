package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PushExtraInfo.class */
public final class PushExtraInfo {
    public HashMap<String, byte[]> transInfoMap;

    public PushExtraInfo() {
        this.transInfoMap = new HashMap<>();
    }

    public HashMap<String, byte[]> getTransInfoMap() {
        return this.transInfoMap;
    }

    public String toString() {
        return "PushExtraInfo{transInfoMap=" + this.transInfoMap + ",}";
    }

    public PushExtraInfo(HashMap<String, byte[]> hashMap) {
        this.transInfoMap = new HashMap<>();
        this.transInfoMap = hashMap;
    }
}
