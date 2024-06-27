package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchLocalInfoResult.class */
public final class SearchLocalInfoResult {

    /* renamed from: id */
    public int f38id;
    public SearchLocalInfoType type = SearchLocalInfoType.values()[0];
    public ArrayList<SearchBuddyItem> buddyList = new ArrayList<>();
    public ArrayList<SearchContactItem> contactList = new ArrayList<>();
    public ArrayList<SearchGroupItem> groupInfos = new ArrayList<>();
    public ArrayList<SearchChatSummaryItem> chatsSummary = new ArrayList<>();
    public ArrayList<SearchFileItem> fileInfos = new ArrayList<>();
    public ArrayList<SearchGameItem> gameInfos = new ArrayList<>();

    public ArrayList<SearchBuddyItem> getBuddyList() {
        return this.buddyList;
    }

    public ArrayList<SearchChatSummaryItem> getChatsSummary() {
        return this.chatsSummary;
    }

    public ArrayList<SearchContactItem> getContactList() {
        return this.contactList;
    }

    public ArrayList<SearchFileItem> getFileInfos() {
        return this.fileInfos;
    }

    public ArrayList<SearchGameItem> getGameInfos() {
        return this.gameInfos;
    }

    public ArrayList<SearchGroupItem> getGroupInfos() {
        return this.groupInfos;
    }

    public int getId() {
        return this.f38id;
    }

    public SearchLocalInfoType getType() {
        return this.type;
    }

    public String toString() {
        return "SearchLocalInfoResult{id=" + this.f38id + ",type=" + this.type + ",buddyList=" + this.buddyList + ",contactList=" + this.contactList + ",groupInfos=" + this.groupInfos + ",chatsSummary=" + this.chatsSummary + ",fileInfos=" + this.fileInfos + ",gameInfos=" + this.gameInfos + ",}";
    }
}
