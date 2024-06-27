package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotInlineSearchRsp.class */
public final class GProGuildRobotInlineSearchRsp {
    public String keyword;
    public ArrayList<GProGuildRobotInlineLayout> layoutList;

    public GProGuildRobotInlineSearchRsp() {
        this.keyword = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.layoutList = new ArrayList<>();
    }

    public String getKeyword() {
        return this.keyword;
    }

    public ArrayList<GProGuildRobotInlineLayout> getLayoutList() {
        return this.layoutList;
    }

    public String toString() {
        return "GProGuildRobotInlineSearchRsp{keyword=" + this.keyword + ",layoutList=" + this.layoutList + ",}";
    }

    public GProGuildRobotInlineSearchRsp(String str, ArrayList<GProGuildRobotInlineLayout> arrayList) {
        this.keyword = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.layoutList = new ArrayList<>();
        this.keyword = str;
        this.layoutList = arrayList;
    }
}
