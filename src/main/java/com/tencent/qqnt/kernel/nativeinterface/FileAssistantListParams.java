package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FileAssistantListParams.class */
public final class FileAssistantListParams {
    public int count;
    public FileAssistantType fileType;
    public Long groupCode;
    public Order order;
    public FileAssistantRequestType reqType;
    public String uid;

    public FileAssistantListParams() {
        this.reqType = FileAssistantRequestType.values()[0];
        this.order = Order.values()[0];
    }

    public int getCount() {
        return this.count;
    }

    public FileAssistantType getFileType() {
        return this.fileType;
    }

    public Long getGroupCode() {
        return this.groupCode;
    }

    public Order getOrder() {
        return this.order;
    }

    public FileAssistantRequestType getReqType() {
        return this.reqType;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "FileAssistantListParams{reqType=" + this.reqType + ",order=" + this.order + ",count=" + this.count + ",uid=" + this.uid + ",groupCode=" + this.groupCode + ",fileType=" + this.fileType + ",}";
    }

    public FileAssistantListParams(FileAssistantRequestType fileAssistantRequestType, Order order, int i, String str, Long l, FileAssistantType fileAssistantType) {
        this.reqType = FileAssistantRequestType.values()[0];
        this.order = Order.values()[0];
        this.reqType = fileAssistantRequestType;
        this.order = order;
        this.count = i;
        this.uid = str;
        this.groupCode = l;
        this.fileType = fileAssistantType;
    }
}
