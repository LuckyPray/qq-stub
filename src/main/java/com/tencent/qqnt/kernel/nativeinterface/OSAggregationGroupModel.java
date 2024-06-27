package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSAggregationGroupModel.class */
public final class OSAggregationGroupModel {
    public int extStatus;
    public ArrayList<OSAggregationCellModel> listCells;
    public int status;

    public OSAggregationGroupModel() {
        this.listCells = new ArrayList<>();
    }

    public int getExtStatus() {
        return this.extStatus;
    }

    public ArrayList<OSAggregationCellModel> getListCells() {
        return this.listCells;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        return "OSAggregationGroupModel{status=" + this.status + ",extStatus=" + this.extStatus + ",listCells=" + this.listCells + ",}";
    }

    public OSAggregationGroupModel(int i, int i2, ArrayList<OSAggregationCellModel> arrayList) {
        this.listCells = new ArrayList<>();
        this.status = i;
        this.extStatus = i2;
        this.listCells = arrayList;
    }
}
