package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FileAssistantSession.class */
public final class FileAssistantSession {
    public String context;
    public int count;
    public long groupCode;
    public String groupName;
    public String groupRemark;
    public String memberCard;
    public String nick;
    public String remark;
    public String uid;

    public FileAssistantSession() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.remark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberCard = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupRemark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getContext() {
        return this.context;
    }

    public int getCount() {
        return this.count;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getGroupRemark() {
        return this.groupRemark;
    }

    public String getMemberCard() {
        return this.memberCard;
    }

    public String getNick() {
        return this.nick;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "FileAssistantSession{context=" + this.context + ",uid=" + this.uid + ",nick=" + this.nick + ",remark=" + this.remark + ",memberCard=" + this.memberCard + ",groupCode=" + this.groupCode + ",groupName=" + this.groupName + ",groupRemark=" + this.groupRemark + ",count=" + this.count + ",}";
    }

    public FileAssistantSession(String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, int i) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.remark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.memberCard = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupRemark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.context = str;
        this.uid = str2;
        this.nick = str3;
        this.remark = str4;
        this.memberCard = str5;
        this.groupCode = j;
        this.groupName = str6;
        this.groupRemark = str7;
        this.count = i;
    }
}
