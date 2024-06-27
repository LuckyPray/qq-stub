package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MemberLevelName.class */
public final class MemberLevelName {
    public int level;
    public String strName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getLevel() {
        return this.level;
    }

    public String getStrName() {
        return this.strName;
    }

    public String toString() {
        return "MemberLevelName{level=" + this.level + ",strName=" + this.strName + ",}";
    }
}
