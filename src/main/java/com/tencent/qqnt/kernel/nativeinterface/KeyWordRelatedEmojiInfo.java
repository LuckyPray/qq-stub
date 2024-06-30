package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/KeyWordRelatedEmojiInfo.class */
public final class KeyWordRelatedEmojiInfo {
    public ArrayList<String> keyWords;
    public String word;

    public KeyWordRelatedEmojiInfo() {
        this.word = "";
        this.keyWords = new ArrayList<>();
    }

    public ArrayList<String> getKeyWords() {
        return this.keyWords;
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {
        return "KeyWordRelatedEmojiInfo{word=" + this.word + ",keyWords=" + this.keyWords + ",}";
    }

    public KeyWordRelatedEmojiInfo(String str, ArrayList<String> arrayList) {
        this.word = "";
        this.keyWords = new ArrayList<>();
        this.word = str;
        this.keyWords = arrayList;
    }
}
