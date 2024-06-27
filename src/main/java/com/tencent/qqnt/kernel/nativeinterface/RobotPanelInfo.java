package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotPanelInfo.class */
public final class RobotPanelInfo {
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<PanelItem> items = new ArrayList<>();

    public ArrayList<PanelItem> getItems() {
        return this.items;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "RobotPanelInfo{name=" + this.name + ",items=" + this.items + ",}";
    }
}
