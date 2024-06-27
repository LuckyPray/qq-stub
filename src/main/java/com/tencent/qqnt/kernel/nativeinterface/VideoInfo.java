package com.tencent.qqnt.kernel.nativeinterface;

import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/VideoInfo.class */
public final class VideoInfo implements Serializable {
    long serialVersionUID = 1;
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "VideoInfo{name=" + this.name + ",}";
    }
}
