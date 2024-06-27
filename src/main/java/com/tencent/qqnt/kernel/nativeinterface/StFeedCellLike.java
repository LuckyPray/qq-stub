package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StFeedCellLike.class */
public final class StFeedCellLike {
    public boolean liked;
    public int num;
    public ArrayList<StLikeMan> likeMans = new ArrayList<>();
    public String text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public ArrayList<StLikeMan> getLikeMans() {
        return this.likeMans;
    }

    public boolean getLiked() {
        return this.liked;
    }

    public int getNum() {
        return this.num;
    }

    public String getText() {
        return this.text;
    }
}
