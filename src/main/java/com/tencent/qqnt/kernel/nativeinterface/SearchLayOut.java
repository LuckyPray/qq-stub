package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchLayOut.class */
public final class SearchLayOut {
    public float bottomCorner;
    public String highlight = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public float marginTop;
    public boolean showDivider;
    public float topCorner;
    public boolean useOneCard;

    public float getBottomCorner() {
        return this.bottomCorner;
    }

    public String getHighlight() {
        return this.highlight;
    }

    public float getMarginTop() {
        return this.marginTop;
    }

    public boolean getShowDivider() {
        return this.showDivider;
    }

    public float getTopCorner() {
        return this.topCorner;
    }

    public boolean getUseOneCard() {
        return this.useOneCard;
    }

    public String toString() {
        return "SearchLayOut{highlight=" + this.highlight + ",marginTop=" + this.marginTop + ",topCorner=" + this.topCorner + ",bottomCorner=" + this.bottomCorner + ",showDivider=" + this.showDivider + ",useOneCard=" + this.useOneCard + ",}";
    }
}
