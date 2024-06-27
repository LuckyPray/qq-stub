package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UserPermission.class */
public final class UserPermission {
    public String friendUid;
    public long friendUin;
    public Boolean onlyChat;
    public Boolean qzoneNotWatch;
    public Boolean qzoneNotWatched;

    public UserPermission() {
        this.friendUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFriendUid() {
        return this.friendUid;
    }

    public long getFriendUin() {
        return this.friendUin;
    }

    public Boolean getOnlyChat() {
        return this.onlyChat;
    }

    public Boolean getQzoneNotWatch() {
        return this.qzoneNotWatch;
    }

    public Boolean getQzoneNotWatched() {
        return this.qzoneNotWatched;
    }

    public String toString() {
        return "UserPermission{friendUin=" + this.friendUin + ",friendUid=" + this.friendUid + ",onlyChat=" + this.onlyChat + ",qzoneNotWatch=" + this.qzoneNotWatch + ",qzoneNotWatched=" + this.qzoneNotWatched + ",}";
    }

    public UserPermission(long j, String str, Boolean bool, Boolean bool2, Boolean bool3) {
        this.friendUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.friendUin = j;
        this.friendUid = str;
        this.onlyChat = bool;
        this.qzoneNotWatch = bool2;
        this.qzoneNotWatched = bool3;
    }
}
