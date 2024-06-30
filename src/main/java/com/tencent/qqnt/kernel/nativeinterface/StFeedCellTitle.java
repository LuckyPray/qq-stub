package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StFeedCellTitle.class */
public final class StFeedCellTitle {
    public ArrayList<StRichMsg> title = new ArrayList<>();
    public String titleUrl = "";

    public ArrayList<StRichMsg> getTitle() {
        return this.title;
    }

    public String getTitleUrl() {
        return this.titleUrl;
    }
}
