package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberIllegalInfoResult.class */
public final class GroupMemberIllegalInfoResult {
    public String subGroupTitle = "";
    public ArrayList<Long> uinList = new ArrayList<>();
    public String msgBoxTitle = "";
    public String msgBoxContent = "";

    public String getMsgBoxContent() {
        return this.msgBoxContent;
    }

    public String getMsgBoxTitle() {
        return this.msgBoxTitle;
    }

    public String getSubGroupTitle() {
        return this.subGroupTitle;
    }

    public ArrayList<Long> getUinList() {
        return this.uinList;
    }

    public String toString() {
        return "GroupMemberIllegalInfoResult{subGroupTitle=" + this.subGroupTitle + ",uinList=" + this.uinList + ",msgBoxTitle=" + this.msgBoxTitle + ",msgBoxContent=" + this.msgBoxContent + ",}";
    }
}
