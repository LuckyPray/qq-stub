package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchHeadTopic.class */
public final class SearchHeadTopic {
    public String background = "";
    public SearchText title = new SearchText();
    public SearchText subTitle = new SearchText();
    public SearchButton button = new SearchButton();
    public SearchGameButton appInfo = new SearchGameButton();
    public ArrayList<String> avatarGroupList = new ArrayList<>();
    public String avatarText = "";
    public ArrayList<SearchIcon> iconList = new ArrayList<>();
    public SearchText text = new SearchText();
    public String stringExtension = "";
    public SearchReportInfo reportInfo = new SearchReportInfo();
    public SearchIcon topIcon = new SearchIcon();

    public SearchGameButton getAppInfo() {
        return this.appInfo;
    }

    public ArrayList<String> getAvatarGroupList() {
        return this.avatarGroupList;
    }

    public String getAvatarText() {
        return this.avatarText;
    }

    public String getBackground() {
        return this.background;
    }

    public SearchButton getButton() {
        return this.button;
    }

    public ArrayList<SearchIcon> getIconList() {
        return this.iconList;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public String getStringExtension() {
        return this.stringExtension;
    }

    public SearchText getSubTitle() {
        return this.subTitle;
    }

    public SearchText getText() {
        return this.text;
    }

    public SearchText getTitle() {
        return this.title;
    }

    public SearchIcon getTopIcon() {
        return this.topIcon;
    }

    public String toString() {
        return "SearchHeadTopic{background=" + this.background + ",title=" + this.title + ",subTitle=" + this.subTitle + ",button=" + this.button + ",appInfo=" + this.appInfo + ",avatarGroupList=" + this.avatarGroupList + ",avatarText=" + this.avatarText + ",iconList=" + this.iconList + ",text=" + this.text + ",stringExtension=" + this.stringExtension + ",reportInfo=" + this.reportInfo + ",topIcon=" + this.topIcon + ",}";
    }
}
