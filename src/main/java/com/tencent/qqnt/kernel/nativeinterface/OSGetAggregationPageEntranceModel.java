package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSGetAggregationPageEntranceModel.class */
public final class OSGetAggregationPageEntranceModel {
    public ArrayList<OSAggregationCellModel> listCells;
    public String text;

    public OSGetAggregationPageEntranceModel() {
        this.text = "";
        this.listCells = new ArrayList<>();
    }

    public ArrayList<OSAggregationCellModel> getListCells() {
        return this.listCells;
    }

    public String getText() {
        return this.text;
    }

    public String toString() {
        return "OSGetAggregationPageEntranceModel{text=" + this.text + ",listCells=" + this.listCells + ",}";
    }

    public OSGetAggregationPageEntranceModel(String str, ArrayList<OSAggregationCellModel> arrayList) {
        this.text = "";
        this.listCells = new ArrayList<>();
        this.text = str;
        this.listCells = arrayList;
    }
}
