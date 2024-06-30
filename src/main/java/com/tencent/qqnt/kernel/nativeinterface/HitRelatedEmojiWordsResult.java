package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/HitRelatedEmojiWordsResult.class */
public final class HitRelatedEmojiWordsResult {
    public boolean isHit;
    public String msg;
    public int result;
    public String word;

    public HitRelatedEmojiWordsResult() {
        this.msg = "";
        this.word = "";
    }

    public boolean getIsHit() {
        return this.isHit;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResult() {
        return this.result;
    }

    public String getWord() {
        return this.word;
    }

    public String toString() {
        return "HitRelatedEmojiWordsResult{result=" + this.result + ",msg=" + this.msg + ",isHit=" + this.isHit + ",word=" + this.word + ",}";
    }

    public HitRelatedEmojiWordsResult(int i, String str, boolean z, String str2) {
        this.msg = "";
        this.word = "";
        this.result = i;
        this.msg = str;
        this.isHit = z;
        this.word = str2;
    }
}
