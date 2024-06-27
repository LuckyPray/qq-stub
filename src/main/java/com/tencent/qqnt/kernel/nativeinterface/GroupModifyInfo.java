package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupModifyInfo.class */
public final class GroupModifyInfo {
    public int classExt;
    public String groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String classText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String fingerMemo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String richFingerMemo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<String> tagRecord = new ArrayList<>();
    public GroupGeoInfo groupGeoInfo = new GroupGeoInfo();

    public int getClassExt() {
        return this.classExt;
    }

    public String getClassText() {
        return this.classText;
    }

    public String getFingerMemo() {
        return this.fingerMemo;
    }

    public GroupGeoInfo getGroupGeoInfo() {
        return this.groupGeoInfo;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getRichFingerMemo() {
        return this.richFingerMemo;
    }

    public ArrayList<String> getTagRecord() {
        return this.tagRecord;
    }

    public String toString() {
        return "GroupModifyInfo{groupName=" + this.groupName + ",classExt=" + this.classExt + ",classText=" + this.classText + ",fingerMemo=" + this.fingerMemo + ",richFingerMemo=" + this.richFingerMemo + ",tagRecord=" + this.tagRecord + ",groupGeoInfo=" + this.groupGeoInfo + ",}";
    }
}
