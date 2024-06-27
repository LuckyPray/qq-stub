package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/DesktopQQMiniProfile.class */
public final class DesktopQQMiniProfile {
    public Birthday birthday;
    public Location location;
    public String longNick;
    public String nick;
    public Integer sex;

    public DesktopQQMiniProfile() {
    }

    public Birthday getBirthday() {
        return this.birthday;
    }

    public Location getLocation() {
        return this.location;
    }

    public String getLongNick() {
        return this.longNick;
    }

    public String getNick() {
        return this.nick;
    }

    public Integer getSex() {
        return this.sex;
    }

    public String toString() {
        return "DesktopQQMiniProfile{nick=" + this.nick + ",longNick=" + this.longNick + ",sex=" + this.sex + ",birthday=" + this.birthday + ",location=" + this.location + ",}";
    }

    public DesktopQQMiniProfile(String str, String str2, Integer num, Birthday birthday, Location location) {
        this.nick = str;
        this.longNick = str2;
        this.sex = num;
        this.birthday = birthday;
        this.location = location;
    }
}
