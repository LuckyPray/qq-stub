package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BatchInfo.class */
public final class BatchInfo {
    public long batchId;
    public long uploadNumber;
    public String desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String showTime = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public StUser user = new StUser();
    public StLBS lbs = new StLBS();
    public ArrayList<StMedia> medias = new ArrayList<>();

    public long getBatchId() {
        return this.batchId;
    }

    public String getDesc() {
        return this.desc;
    }

    public StLBS getLbs() {
        return this.lbs;
    }

    public ArrayList<StMedia> getMedias() {
        return this.medias;
    }

    public String getShowTime() {
        return this.showTime;
    }

    public long getUploadNumber() {
        return this.uploadNumber;
    }

    public StUser getUser() {
        return this.user;
    }
}
