package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchVerticalDetail.class */
public final class SearchVerticalDetail {
    public SearchIcon icon = new SearchIcon();
    public SearchIcon littleIcon = new SearchIcon();
    public SearchText title = new SearchText();
    public ArrayList<SearchIcon> tags = new ArrayList<>();
    public SearchText subTitle = new SearchText();
    public ArrayList<SearchLabel> topLabelList = new ArrayList<>();
    public ArrayList<SearchLabel> bottomLabelList = new ArrayList<>();
    public ArrayList<SearchLabel> labelBarList = new ArrayList<>();
    public SearchButton button = new SearchButton();
    public String stringExtension = "";

    public ArrayList<SearchLabel> getBottomLabelList() {
        return this.bottomLabelList;
    }

    public SearchButton getButton() {
        return this.button;
    }

    public SearchIcon getIcon() {
        return this.icon;
    }

    public ArrayList<SearchLabel> getLabelBarList() {
        return this.labelBarList;
    }

    public SearchIcon getLittleIcon() {
        return this.littleIcon;
    }

    public String getStringExtension() {
        return this.stringExtension;
    }

    public SearchText getSubTitle() {
        return this.subTitle;
    }

    public ArrayList<SearchIcon> getTags() {
        return this.tags;
    }

    public SearchText getTitle() {
        return this.title;
    }

    public ArrayList<SearchLabel> getTopLabelList() {
        return this.topLabelList;
    }

    public String toString() {
        return "SearchVerticalDetail{icon=" + this.icon + ",littleIcon=" + this.littleIcon + ",title=" + this.title + ",tags=" + this.tags + ",subTitle=" + this.subTitle + ",topLabelList=" + this.topLabelList + ",bottomLabelList=" + this.bottomLabelList + ",labelBarList=" + this.labelBarList + ",button=" + this.button + ",stringExtension=" + this.stringExtension + ",}";
    }
}
