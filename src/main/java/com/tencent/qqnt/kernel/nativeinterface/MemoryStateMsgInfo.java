package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MemoryStateMsgInfo.class */
public final class MemoryStateMsgInfo {
    public int memoryStateMsgType;

    public MemoryStateMsgInfo() {
    }

    public int getMemoryStateMsgType() {
        return this.memoryStateMsgType;
    }

    public String toString() {
        return "MemoryStateMsgInfo{memoryStateMsgType=" + this.memoryStateMsgType + ",}";
    }

    public MemoryStateMsgInfo(int i) {
        this.memoryStateMsgType = i;
    }
}
