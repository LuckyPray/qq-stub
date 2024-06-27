package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicHotWordsItem.class */
public final class EmojiHotPicHotWordsItem {
    public int itemType;
    public Integer searchNum;
    public String word;

    public EmojiHotPicHotWordsItem() {
    }

    public int getItemType() {
        return this.itemType;
    }

    public Integer getSearchNum() {
        return this.searchNum;
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {
        return "EmojiHotPicHotWordsItem{word=" + this.word + ",searchNum=" + this.searchNum + ",itemType=" + this.itemType + ",}";
    }

    public EmojiHotPicHotWordsItem(String str, Integer num, int i) {
        this.word = str;
        this.searchNum = num;
        this.itemType = i;
    }
}
