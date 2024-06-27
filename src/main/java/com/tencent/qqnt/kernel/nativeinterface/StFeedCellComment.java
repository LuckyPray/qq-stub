package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StFeedCellComment.class */
public final class StFeedCellComment {
    public ArrayList<StComment> comments = new ArrayList<>();
    public int num;

    public ArrayList<StComment> getComments() {
        return this.comments;
    }

    public int getNum() {
        return this.num;
    }
}
