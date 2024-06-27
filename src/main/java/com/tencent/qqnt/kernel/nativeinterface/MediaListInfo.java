package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MediaListInfo.class */
public final class MediaListInfo {
    public int mediasIndex;
    public String nextAttachInfo;
    public boolean nextHasMore;
    public String prevAttachInfo;
    public boolean prevHasMore;

    public MediaListInfo() {
        this.prevAttachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nextAttachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getMediasIndex() {
        return this.mediasIndex;
    }

    public String getNextAttachInfo() {
        return this.nextAttachInfo;
    }

    public boolean getNextHasMore() {
        return this.nextHasMore;
    }

    public String getPrevAttachInfo() {
        return this.prevAttachInfo;
    }

    public boolean getPrevHasMore() {
        return this.prevHasMore;
    }

    public MediaListInfo(String str, String str2, boolean z, boolean z2, int i) {
        this.prevAttachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nextAttachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.prevAttachInfo = str;
        this.nextAttachInfo = str2;
        this.prevHasMore = z;
        this.nextHasMore = z2;
        this.mediasIndex = i;
    }
}
