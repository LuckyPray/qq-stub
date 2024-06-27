package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/Birthday.class */
public final class Birthday {
    public int birthdayDay;
    public int birthdayMonth;
    public int birthdayYear;

    public Birthday() {
    }

    public int getBirthdayDay() {
        return this.birthdayDay;
    }

    public int getBirthdayMonth() {
        return this.birthdayMonth;
    }

    public int getBirthdayYear() {
        return this.birthdayYear;
    }

    public String toString() {
        return "Birthday{birthdayYear=" + this.birthdayYear + ",birthdayMonth=" + this.birthdayMonth + ",birthdayDay=" + this.birthdayDay + ",}";
    }

    public Birthday(int i, int i2, int i3) {
        this.birthdayYear = i;
        this.birthdayMonth = i2;
        this.birthdayDay = i3;
    }
}
