package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SysEmojiGroup.class */
public final class SysEmojiGroup {
    public String groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<SysEmoji> SysEmojiList = new ArrayList<>();

    public String getGroupName() {
        return this.groupName;
    }

    public ArrayList<SysEmoji> getSysEmojiList() {
        return this.SysEmojiList;
    }

    public String toString() {
        return "SysEmojiGroup{groupName=" + this.groupName + ",SysEmojiList=" + this.SysEmojiList + ",}";
    }
}
