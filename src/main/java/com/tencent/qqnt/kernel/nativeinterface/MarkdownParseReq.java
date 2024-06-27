package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MarkdownParseReq.class */
public final class MarkdownParseReq {
    public int markdownReqType;
    public String markdownText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getMarkdownReqType() {
        return this.markdownReqType;
    }

    public String getMarkdownText() {
        return this.markdownText;
    }

    public String toString() {
        return "MarkdownParseReq{markdownReqType=" + this.markdownReqType + ",markdownText=" + this.markdownText + ",}";
    }
}
