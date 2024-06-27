package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ShareAlbumMeta.class */
public final class ShareAlbumMeta {
    public String owner = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<ClientAttr> shareattrs = new ArrayList<>();

    public String getOwner() {
        return this.owner;
    }

    public ArrayList<ClientAttr> getShareattrs() {
        return this.shareattrs;
    }
}
