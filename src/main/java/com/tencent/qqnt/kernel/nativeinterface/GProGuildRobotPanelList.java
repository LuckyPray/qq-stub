package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotPanelList.class */
public final class GProGuildRobotPanelList {
    public ArrayList<GProGuildRobotPanelListItem> items;
    public String name;

    public GProGuildRobotPanelList() {
        this.name = "";
        this.items = new ArrayList<>();
    }

    public ArrayList<GProGuildRobotPanelListItem> getItems() {
        return this.items;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "GProGuildRobotPanelList{name=" + this.name + ",items=" + this.items + ",}";
    }

    public GProGuildRobotPanelList(String str, ArrayList<GProGuildRobotPanelListItem> arrayList) {
        this.name = "";
        this.items = new ArrayList<>();
        this.name = str;
        this.items = arrayList;
    }
}
