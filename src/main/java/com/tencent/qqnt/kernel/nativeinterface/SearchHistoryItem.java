package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchHistoryItem.class */
public final class SearchHistoryItem {

    /* renamed from: id */
    public int f37id;
    public SearchHistoryType type = SearchHistoryType.values()[0];
    public ArrayList<SearchBuddyItem> buddyList = new ArrayList<>();
    public ArrayList<SearchGroupItem> groupInfos = new ArrayList<>();
    public ArrayList<SearchMsgItem> msgs = new ArrayList<>();
    public ArrayList<SearchFileItem> fileInfos = new ArrayList<>();

    public ArrayList<SearchBuddyItem> getBuddyList() {
        return this.buddyList;
    }

    public ArrayList<SearchFileItem> getFileInfos() {
        return this.fileInfos;
    }

    public ArrayList<SearchGroupItem> getGroupInfos() {
        return this.groupInfos;
    }

    public int getId() {
        return this.f37id;
    }

    public ArrayList<SearchMsgItem> getMsgs() {
        return this.msgs;
    }

    public SearchHistoryType getType() {
        return this.type;
    }

    public String toString() {
        return "SearchHistoryItem{id=" + this.f37id + ",type=" + this.type + ",buddyList=" + this.buddyList + ",groupInfos=" + this.groupInfos + ",msgs=" + this.msgs + ",fileInfos=" + this.fileInfos + ",}";
    }
}
