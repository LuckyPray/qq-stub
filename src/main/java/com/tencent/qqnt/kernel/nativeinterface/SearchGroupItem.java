package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupItem.class */
public final class SearchGroupItem {
    public long groupCode;
    public ArrayList<SearchDiscussInfoItem> discussInfo = new ArrayList<>();
    public SearchGroupInfoItem groupInfo = new SearchGroupInfoItem();
    public ArrayList<SearchGroupMemberProfileItem> memberProfile = new ArrayList<>();
    public ArrayList<SearchGroupMemberCardItem> memberCard = new ArrayList<>();

    public ArrayList<SearchDiscussInfoItem> getDiscussInfo() {
        return this.discussInfo;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public SearchGroupInfoItem getGroupInfo() {
        return this.groupInfo;
    }

    public ArrayList<SearchGroupMemberCardItem> getMemberCard() {
        return this.memberCard;
    }

    public ArrayList<SearchGroupMemberProfileItem> getMemberProfile() {
        return this.memberProfile;
    }

    public String toString() {
        return "SearchGroupItem{groupCode=" + this.groupCode + ",discussInfo=" + this.discussInfo + ",groupInfo=" + this.groupInfo + ",memberProfile=" + this.memberProfile + ",memberCard=" + this.memberCard + ",}";
    }
}
