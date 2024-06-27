package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BasePanelResult.class */
public final class BasePanelResult {
    public ArrayList<SysEmojiGroup> SysEmojiGroupList = new ArrayList<>();
    public DownloadBaseEmojiInfo downloadInfo = new DownloadBaseEmojiInfo();

    public DownloadBaseEmojiInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public ArrayList<SysEmojiGroup> getSysEmojiGroupList() {
        return this.SysEmojiGroupList;
    }

    public String toString() {
        return "BasePanelResult{SysEmojiGroupList=" + this.SysEmojiGroupList + ",downloadInfo=" + this.downloadInfo + ",}";
    }
}
