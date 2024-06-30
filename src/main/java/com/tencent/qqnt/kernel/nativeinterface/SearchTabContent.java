package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchTabContent.class */
public final class SearchTabContent {
    public int bizId;
    public SearchRecommendGuide emptyCard;
    public int layoutId;
    public SearchRecommendGuide recommendGuide;
    public long tabContentMask;
    public SearchTemplate templateItem;

    /* renamed from: id */
    public String f39id = "";
    public String name = "";
    public String layoutContent = "";
    public byte[] bytesExtension = new byte[0];
    public byte[] pbLayoutContent = new byte[0];

    public int getBizId() {
        return this.bizId;
    }

    public byte[] getBytesExtension() {
        return this.bytesExtension;
    }

    public SearchRecommendGuide getEmptyCard() {
        return this.emptyCard;
    }

    public String getId() {
        return this.f39id;
    }

    public String getLayoutContent() {
        return this.layoutContent;
    }

    public int getLayoutId() {
        return this.layoutId;
    }

    public String getName() {
        return this.name;
    }

    public byte[] getPbLayoutContent() {
        return this.pbLayoutContent;
    }

    public SearchRecommendGuide getRecommendGuide() {
        return this.recommendGuide;
    }

    public long getTabContentMask() {
        return this.tabContentMask;
    }

    public SearchTemplate getTemplateItem() {
        return this.templateItem;
    }

    public String toString() {
        return "SearchTabContent{id=" + this.f39id + ",name=" + this.name + ",tabContentMask=" + this.tabContentMask + ",layoutId=" + this.layoutId + ",layoutContent=" + this.layoutContent + ",bytesExtension=" + this.bytesExtension + ",bizId=" + this.bizId + ",pbLayoutContent=" + this.pbLayoutContent + ",emptyCard=" + this.emptyCard + ",recommendGuide=" + this.recommendGuide + ",templateItem=" + this.templateItem + ",}";
    }
}
