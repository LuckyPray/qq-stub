package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildMedal.class */
public final class GuildMedal {
    public long endTime;
    public long startTime;
    public String url = "";
    public String desc = "";

    public String getDesc() {
        return this.desc;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "GuildMedal{startTime=" + this.startTime + ",endTime=" + this.endTime + ",url=" + this.url + ",desc=" + this.desc + ",}";
    }
}
