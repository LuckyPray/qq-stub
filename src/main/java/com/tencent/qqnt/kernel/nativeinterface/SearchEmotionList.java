package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchEmotionList.class */
public final class SearchEmotionList {
    public ArrayList<SearchPicture> pics = new ArrayList<>();
    public String stringExtension = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public ArrayList<SearchPicture> getPics() {
        return this.pics;
    }

    public String getStringExtension() {
        return this.stringExtension;
    }

    public String toString() {
        return "SearchEmotionList{pics=" + this.pics + ",stringExtension=" + this.stringExtension + ",}";
    }
}
