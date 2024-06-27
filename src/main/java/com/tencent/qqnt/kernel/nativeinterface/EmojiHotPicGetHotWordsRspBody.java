package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicGetHotWordsRspBody.class */
public final class EmojiHotPicGetHotWordsRspBody {
    public String errorMsg;
    public ArrayList<EmojiHotPicHotWordsItem> items;
    public int resultCode;
    public int size;
    public String traceId;

    public EmojiHotPicGetHotWordsRspBody() {
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ArrayList<EmojiHotPicHotWordsItem> getItems() {
        return this.items;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public int getSize() {
        return this.size;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String toString() {
        return "EmojiHotPicGetHotWordsRspBody{resultCode=" + this.resultCode + ",errorMsg=" + this.errorMsg + ",traceId=" + this.traceId + ",size=" + this.size + ",items=" + this.items + ",}";
    }

    public EmojiHotPicGetHotWordsRspBody(int i, String str, String str2, int i2, ArrayList<EmojiHotPicHotWordsItem> arrayList) {
        this.resultCode = i;
        this.errorMsg = str;
        this.traceId = str2;
        this.size = i2;
        this.items = arrayList;
    }
}
