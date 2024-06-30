package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BuddySetting.class */
public final class BuddySetting {
    public int addFriendSetting;
    public String buddyUid;
    public long buddyUin;
    public boolean isContactFriend;
    public String phoneNumber;
    public ArrayList<String> question;

    public BuddySetting() {
        this.buddyUid = "";
        this.phoneNumber = "";
        this.question = new ArrayList<>();
    }

    public int getAddFriendSetting() {
        return this.addFriendSetting;
    }

    public String getBuddyUid() {
        return this.buddyUid;
    }

    public long getBuddyUin() {
        return this.buddyUin;
    }

    public boolean getIsContactFriend() {
        return this.isContactFriend;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ArrayList<String> getQuestion() {
        return this.question;
    }

    public String toString() {
        return "BuddySetting{buddyUid=" + this.buddyUid + ",buddyUin=" + this.buddyUin + ",phoneNumber=" + this.phoneNumber + ",addFriendSetting=" + this.addFriendSetting + ",question=" + this.question + ",isContactFriend=" + this.isContactFriend + ",}";
    }

    public BuddySetting(String str, long j, String str2, int i, ArrayList<String> arrayList, boolean z) {
        this.buddyUid = "";
        this.phoneNumber = "";
        this.question = new ArrayList<>();
        this.buddyUid = str;
        this.buddyUin = j;
        this.phoneNumber = str2;
        this.addFriendSetting = i;
        this.question = arrayList;
        this.isContactFriend = z;
    }
}
