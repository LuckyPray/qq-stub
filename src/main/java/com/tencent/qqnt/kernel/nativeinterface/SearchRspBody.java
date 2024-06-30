package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchRspBody.class */
public final class SearchRspBody {
    public int isEnd;
    public boolean isExactSearch;
    public int resultCode;
    public String errorMsg = "";
    public SearchTabContentResult tabContentResult = new SearchTabContentResult();
    public byte[] sessionInfo = new byte[0];
    public byte[] busiSessionInfo = new byte[0];
    public String clientTraceId = "";
    public String correctionQuery = "";
    public byte[] bytesExtension = new byte[0];

    public byte[] getBusiSessionInfo() {
        return this.busiSessionInfo;
    }

    public byte[] getBytesExtension() {
        return this.bytesExtension;
    }

    public String getClientTraceId() {
        return this.clientTraceId;
    }

    public String getCorrectionQuery() {
        return this.correctionQuery;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public int getIsEnd() {
        return this.isEnd;
    }

    public boolean getIsExactSearch() {
        return this.isExactSearch;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public byte[] getSessionInfo() {
        return this.sessionInfo;
    }

    public SearchTabContentResult getTabContentResult() {
        return this.tabContentResult;
    }

    public String toString() {
        return "SearchRspBody{resultCode=" + this.resultCode + ",errorMsg=" + this.errorMsg + ",tabContentResult=" + this.tabContentResult + ",isEnd=" + this.isEnd + ",sessionInfo=" + this.sessionInfo + ",busiSessionInfo=" + this.busiSessionInfo + ",clientTraceId=" + this.clientTraceId + ",correctionQuery=" + this.correctionQuery + ",isExactSearch=" + this.isExactSearch + ",bytesExtension=" + this.bytesExtension + ",}";
    }
}
