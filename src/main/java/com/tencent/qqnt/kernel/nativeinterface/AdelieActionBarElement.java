package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AdelieActionBarElement.class */
public final class AdelieActionBarElement {
    public long botAppid;
    public ArrayList<InlineKeyboardRow> rows;

    public AdelieActionBarElement() {
        this.rows = new ArrayList<>();
    }

    public long getBotAppid() {
        return this.botAppid;
    }

    public ArrayList<InlineKeyboardRow> getRows() {
        return this.rows;
    }

    public String toString() {
        return "AdelieActionBarElement{rows=" + this.rows + ",botAppid=" + this.botAppid + ",}";
    }

    public AdelieActionBarElement(ArrayList<InlineKeyboardRow> arrayList, long j) {
        this.rows = new ArrayList<>();
        this.rows = arrayList;
        this.botAppid = j;
    }
}
