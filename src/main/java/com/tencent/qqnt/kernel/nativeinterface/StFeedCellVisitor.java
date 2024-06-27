package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StFeedCellVisitor.class */
public final class StFeedCellVisitor {
    public int viewNum;
    public int visitorNum;
    public ArrayList<StUser> visitors = new ArrayList<>();

    public int getViewNum() {
        return this.viewNum;
    }

    public int getVisitorNum() {
        return this.visitorNum;
    }

    public ArrayList<StUser> getVisitors() {
        return this.visitors;
    }
}
