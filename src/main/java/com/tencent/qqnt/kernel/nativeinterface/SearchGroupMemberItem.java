package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupMemberItem.class */
public final class SearchGroupMemberItem {
    public long groupCode;
    public long uin;
    public String groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String groupRemarkName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<SearchHitInfo> uinHits = new ArrayList<>();
    public String nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<SearchHitInfo> nickHits = new ArrayList<>();
    public String remark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<SearchHitInfo> remarkHits = new ArrayList<>();
    public String cardName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<SearchHitInfo> cardNameHits = new ArrayList<>();

    public String getCardName() {
        return this.cardName;
    }

    public ArrayList<SearchHitInfo> getCardNameHits() {
        return this.cardNameHits;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getGroupRemarkName() {
        return this.groupRemarkName;
    }

    public String getNick() {
        return this.nick;
    }

    public ArrayList<SearchHitInfo> getNickHits() {
        return this.nickHits;
    }

    public String getRemark() {
        return this.remark;
    }

    public ArrayList<SearchHitInfo> getRemarkHits() {
        return this.remarkHits;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public ArrayList<SearchHitInfo> getUinHits() {
        return this.uinHits;
    }

    public String toString() {
        return "SearchGroupMemberItem{groupCode=" + this.groupCode + ",groupName=" + this.groupName + ",groupRemarkName=" + this.groupRemarkName + ",uid=" + this.uid + ",uin=" + this.uin + ",uinHits=" + this.uinHits + ",nick=" + this.nick + ",nickHits=" + this.nickHits + ",remark=" + this.remark + ",remarkHits=" + this.remarkHits + ",cardName=" + this.cardName + ",cardNameHits=" + this.cardNameHits + ",}";
    }
}
