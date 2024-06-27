package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FileAssistantSearchParams.class */
public final class FileAssistantSearchParams {
    public int pageLimit;
    public Order resultSortType;

    public FileAssistantSearchParams() {
        this.resultSortType = Order.values()[0];
    }

    public int getPageLimit() {
        return this.pageLimit;
    }

    public Order getResultSortType() {
        return this.resultSortType;
    }

    public String toString() {
        return "FileAssistantSearchParams{resultSortType=" + this.resultSortType + ",pageLimit=" + this.pageLimit + ",}";
    }

    public FileAssistantSearchParams(Order order, int i) {
        this.resultSortType = Order.values()[0];
        this.resultSortType = order;
        this.pageLimit = i;
    }
}
