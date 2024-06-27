package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchTopicHeader.class */
public final class SearchTopicHeader {
    public SearchIcon background = new SearchIcon();
    public SearchIcon icon = new SearchIcon();

    public SearchIcon getBackground() {
        return this.background;
    }

    public SearchIcon getIcon() {
        return this.icon;
    }

    public String toString() {
        return "SearchTopicHeader{background=" + this.background + ",icon=" + this.icon + ",}";
    }
}
