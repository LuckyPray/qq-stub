package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotInlineLayout.class */
public final class GProGuildRobotInlineLayout {
    public int action;
    public ArrayList<GProGuildRobotInlineLayoutData> layoutDataList;
    public String title;
    public int type;

    public GProGuildRobotInlineLayout() {
        this.title = "";
        this.layoutDataList = new ArrayList<>();
    }

    public int getAction() {
        return this.action;
    }

    public ArrayList<GProGuildRobotInlineLayoutData> getLayoutDataList() {
        return this.layoutDataList;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "GProGuildRobotInlineLayout{type=" + this.type + ",action=" + this.action + ",title=" + this.title + ",layoutDataList=" + this.layoutDataList + ",}";
    }

    public GProGuildRobotInlineLayout(int i, int i2, String str, ArrayList<GProGuildRobotInlineLayoutData> arrayList) {
        this.title = "";
        this.layoutDataList = new ArrayList<>();
        this.type = i;
        this.action = i2;
        this.title = str;
        this.layoutDataList = arrayList;
    }
}
