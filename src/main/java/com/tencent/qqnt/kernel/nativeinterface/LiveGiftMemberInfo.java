package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/LiveGiftMemberInfo.class */
public final class LiveGiftMemberInfo {
    public String nickName;
    public int roleColor;
    public long roleId;
    public String roleName;
    public String tinyId;

    public LiveGiftMemberInfo() {
        this.tinyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.roleName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getNickName() {
        return this.nickName;
    }

    public int getRoleColor() {
        return this.roleColor;
    }

    public long getRoleId() {
        return this.roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public String getTinyId() {
        return this.tinyId;
    }

    public String toString() {
        return "LiveGiftMemberInfo{tinyId=" + this.tinyId + ",nickName=" + this.nickName + ",roleId=" + this.roleId + ",roleName=" + this.roleName + ",roleColor=" + this.roleColor + ",}";
    }

    public LiveGiftMemberInfo(String str, String str2, long j, String str3, int i) {
        this.tinyId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.roleName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tinyId = str;
        this.nickName = str2;
        this.roleId = j;
        this.roleName = str3;
        this.roleColor = i;
    }
}
