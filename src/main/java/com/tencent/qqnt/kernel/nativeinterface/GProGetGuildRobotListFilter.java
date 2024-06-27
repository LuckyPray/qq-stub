package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGetGuildRobotListFilter.class */
public final class GProGetGuildRobotListFilter {
    public boolean audio;

    public GProGetGuildRobotListFilter() {
    }

    public boolean getAudio() {
        return this.audio;
    }

    public String toString() {
        return "GProGetGuildRobotListFilter{audio=" + this.audio + ",}";
    }

    public GProGetGuildRobotListFilter(boolean z) {
        this.audio = z;
    }
}
