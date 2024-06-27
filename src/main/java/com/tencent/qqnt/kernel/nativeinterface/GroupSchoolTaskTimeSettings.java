package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolTaskTimeSettings.class */
public final class GroupSchoolTaskTimeSettings {
    public int checkinWeekdays;
    public int cycle;

    public GroupSchoolTaskTimeSettings() {
    }

    public int getCheckinWeekdays() {
        return this.checkinWeekdays;
    }

    public int getCycle() {
        return this.cycle;
    }

    public String toString() {
        return "GroupSchoolTaskTimeSettings{cycle=" + this.cycle + ",checkinWeekdays=" + this.checkinWeekdays + ",}";
    }

    public GroupSchoolTaskTimeSettings(int i, int i2) {
        this.cycle = i;
        this.checkinWeekdays = i2;
    }
}
