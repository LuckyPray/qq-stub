package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchReqBody.class */
public final class SearchReqBody {
    public boolean disableCorrectionQuery;
    public boolean firstPage;
    public boolean usePbSerialization;
    public String keyWord = "";
    public String version = "";
    public SearchTabInfo tabs = new SearchTabInfo();
    public byte[] sessionInfo = new byte[0];
    public SearchDeviceInfo deviceInfo = new SearchDeviceInfo();
    public SearchGroupConditonFilter groupConditionFilter = new SearchGroupConditonFilter();
    public String lbs = "";
    public SearchChannelConditonFilter channelConditionFilter = new SearchChannelConditonFilter();
    public byte[] busiSessionInfo = new byte[0];
    public byte[] bytesExtension = new byte[0];

    public byte[] getBusiSessionInfo() {
        return this.busiSessionInfo;
    }

    public byte[] getBytesExtension() {
        return this.bytesExtension;
    }

    public SearchChannelConditonFilter getChannelConditionFilter() {
        return this.channelConditionFilter;
    }

    public SearchDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public boolean getDisableCorrectionQuery() {
        return this.disableCorrectionQuery;
    }

    public boolean getFirstPage() {
        return this.firstPage;
    }

    public SearchGroupConditonFilter getGroupConditionFilter() {
        return this.groupConditionFilter;
    }

    public String getKeyWord() {
        return this.keyWord;
    }

    public String getLbs() {
        return this.lbs;
    }

    public byte[] getSessionInfo() {
        return this.sessionInfo;
    }

    public SearchTabInfo getTabs() {
        return this.tabs;
    }

    public boolean getUsePbSerialization() {
        return this.usePbSerialization;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "SearchReqBody{keyWord=" + this.keyWord + ",version=" + this.version + ",tabs=" + this.tabs + ",sessionInfo=" + this.sessionInfo + ",firstPage=" + this.firstPage + ",deviceInfo=" + this.deviceInfo + ",groupConditionFilter=" + this.groupConditionFilter + ",lbs=" + this.lbs + ",channelConditionFilter=" + this.channelConditionFilter + ",busiSessionInfo=" + this.busiSessionInfo + ",disableCorrectionQuery=" + this.disableCorrectionQuery + ",usePbSerialization=" + this.usePbSerialization + ",bytesExtension=" + this.bytesExtension + ",}";
    }
}
