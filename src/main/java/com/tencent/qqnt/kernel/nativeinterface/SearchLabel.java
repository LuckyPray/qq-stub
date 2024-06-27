package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchLabel.class */
public final class SearchLabel {
    public int layout;
    public SearchText text = new SearchText();
    public SearchIcon icon = new SearchIcon();

    public SearchIcon getIcon() {
        return this.icon;
    }

    public int getLayout() {
        return this.layout;
    }

    public SearchText getText() {
        return this.text;
    }

    public String toString() {
        return "SearchLabel{text=" + this.text + ",icon=" + this.icon + ",layout=" + this.layout + ",}";
    }
}
