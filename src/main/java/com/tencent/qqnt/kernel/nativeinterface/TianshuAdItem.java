package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TianshuAdItem.class */
public final class TianshuAdItem {
    public HashMap<String, String> argList;
    public String desc;
    public String extInfo;
    public int iAdId;
    public int iAdType;
    public String iconUrl;
    public String jumpUrl;
    public ArrayList<String> lstPic;
    public int taskId;
    public int taskType;
    public String title;
    public String traceInfo;

    public TianshuAdItem() {
        this.traceInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.lstPic = new ArrayList<>();
        this.argList = new HashMap<>();
        this.extInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public HashMap<String, String> getArgList() {
        return this.argList;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getExtInfo() {
        return this.extInfo;
    }

    public int getIAdId() {
        return this.iAdId;
    }

    public int getIAdType() {
        return this.iAdType;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public ArrayList<String> getLstPic() {
        return this.lstPic;
    }

    public int getTaskId() {
        return this.taskId;
    }

    public int getTaskType() {
        return this.taskType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTraceInfo() {
        return this.traceInfo;
    }

    public String toString() {
        return "TianshuAdItem{iAdId=" + this.iAdId + ",iAdType=" + this.iAdType + ",taskId=" + this.taskId + ",taskType=" + this.taskType + ",traceInfo=" + this.traceInfo + ",title=" + this.title + ",desc=" + this.desc + ",jumpUrl=" + this.jumpUrl + ",iconUrl=" + this.iconUrl + ",lstPic=" + this.lstPic + ",argList=" + this.argList + ",extInfo=" + this.extInfo + ",}";
    }

    public TianshuAdItem(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, ArrayList<String> arrayList, HashMap<String, String> hashMap, String str6) {
        this.traceInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.lstPic = new ArrayList<>();
        this.argList = new HashMap<>();
        this.extInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iAdId = i;
        this.iAdType = i2;
        this.taskId = i3;
        this.taskType = i4;
        this.traceInfo = str;
        this.title = str2;
        this.desc = str3;
        this.jumpUrl = str4;
        this.iconUrl = str5;
        this.lstPic = arrayList;
        this.argList = hashMap;
        this.extInfo = str6;
    }
}
