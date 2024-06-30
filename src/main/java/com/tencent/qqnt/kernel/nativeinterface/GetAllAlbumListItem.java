package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetAllAlbumListItem.class */
public final class GetAllAlbumListItem {
    public int albumNum;
    public boolean isTopped;
    public int mediaNum;
    public int unreadNum;
    public String qunId = "";
    public String qunName = "";
    public String qunIconUrl = "";
    public String lastestPromptText = "";
    public String lastestPromptUin = "";
    public ArrayList<StMedia> mediaList = new ArrayList<>();

    public int getAlbumNum() {
        return this.albumNum;
    }

    public boolean getIsTopped() {
        return this.isTopped;
    }

    public String getLastestPromptText() {
        return this.lastestPromptText;
    }

    public String getLastestPromptUin() {
        return this.lastestPromptUin;
    }

    public ArrayList<StMedia> getMediaList() {
        return this.mediaList;
    }

    public int getMediaNum() {
        return this.mediaNum;
    }

    public String getQunIconUrl() {
        return this.qunIconUrl;
    }

    public String getQunId() {
        return this.qunId;
    }

    public String getQunName() {
        return this.qunName;
    }

    public int getUnreadNum() {
        return this.unreadNum;
    }
}
