package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchPlayletDetail.class */
public final class SearchPlayletDetail {
    public SearchPicture mainPic = new SearchPicture();
    public SearchText title = new SearchText();
    public SearchText subTitle = new SearchText();
    public SearchText describe = new SearchText();
    public SearchButton playButton = new SearchButton();
    public ArrayList<SearchButton> playletButtonList = new ArrayList<>();
    public SearchButton moreButton = new SearchButton();

    public SearchText getDescribe() {
        return this.describe;
    }

    public SearchPicture getMainPic() {
        return this.mainPic;
    }

    public SearchButton getMoreButton() {
        return this.moreButton;
    }

    public SearchButton getPlayButton() {
        return this.playButton;
    }

    public ArrayList<SearchButton> getPlayletButtonList() {
        return this.playletButtonList;
    }

    public SearchText getSubTitle() {
        return this.subTitle;
    }

    public SearchText getTitle() {
        return this.title;
    }

    public String toString() {
        return "SearchPlayletDetail{mainPic=" + this.mainPic + ",title=" + this.title + ",subTitle=" + this.subTitle + ",describe=" + this.describe + ",playButton=" + this.playButton + ",playletButtonList=" + this.playletButtonList + ",moreButton=" + this.moreButton + ",}";
    }
}
