package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotInlineRenderData.class */
public final class GProGuildRobotInlineRenderData {
    public String cover;
    public String tips;
    public String title;

    public GProGuildRobotInlineRenderData() {
        this.cover = "";
        this.title = "";
        this.tips = "";
    }

    public String getCover() {
        return this.cover;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "GProGuildRobotInlineRenderData{cover=" + this.cover + ",title=" + this.title + ",tips=" + this.tips + ",}";
    }

    public GProGuildRobotInlineRenderData(String str, String str2, String str3) {
        this.cover = "";
        this.title = "";
        this.tips = "";
        this.cover = str;
        this.title = str2;
        this.tips = str3;
    }
}
