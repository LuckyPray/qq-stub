package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/LoverAlbumMeta.class */
public final class LoverAlbumMeta {
    public int day;
    public int loveValue;
    public int month;
    public int year;
    public String fallInLoveTime = "";
    public ArrayList<TimeEventOp> loverEvents = new ArrayList<>();

    public int getDay() {
        return this.day;
    }

    public String getFallInLoveTime() {
        return this.fallInLoveTime;
    }

    public int getLoveValue() {
        return this.loveValue;
    }

    public ArrayList<TimeEventOp> getLoverEvents() {
        return this.loverEvents;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
}
