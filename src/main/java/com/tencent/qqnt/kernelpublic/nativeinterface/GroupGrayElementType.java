package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/GroupGrayElementType.class */
public final class GroupGrayElementType {
    private static final GroupGrayElementType[] $VALUES;
    static IPatchRedirector $redirector_;
    public static final GroupGrayElementType KBERECYCLED;
    public static final GroupGrayElementType KBLOCK;
    public static final GroupGrayElementType KCREATED;
    public static final GroupGrayElementType KDISBANDED;
    public static final GroupGrayElementType KDISBANDORBERECYCLED;
    public static final GroupGrayElementType KGROUPNAMEMODIFIED;
    public static final GroupGrayElementType KMEMBERADD;
    public static final GroupGrayElementType KQUITTED;
    public static final GroupGrayElementType KSHUTUP;
    public static final GroupGrayElementType KUNBLOCK;
    public static final GroupGrayElementType KUNKNOWN;

    static {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(46489);
        $redirector_ = redirector;
        if (redirector != null && redirector.hasPatch((short) 2)) {
            redirector.redirect((short) 2);
            return;
        }
        GroupGrayElementType groupGrayElementType = new GroupGrayElementType("KUNKNOWN", 0);
        KUNKNOWN = groupGrayElementType;
        GroupGrayElementType groupGrayElementType2 = new GroupGrayElementType("KMEMBERADD", 1);
        KMEMBERADD = groupGrayElementType2;
        GroupGrayElementType groupGrayElementType3 = new GroupGrayElementType("KDISBANDED", 2);
        KDISBANDED = groupGrayElementType3;
        GroupGrayElementType groupGrayElementType4 = new GroupGrayElementType("KQUITTED", 3);
        KQUITTED = groupGrayElementType4;
        GroupGrayElementType groupGrayElementType5 = new GroupGrayElementType("KCREATED", 4);
        KCREATED = groupGrayElementType5;
        GroupGrayElementType groupGrayElementType6 = new GroupGrayElementType("KGROUPNAMEMODIFIED", 5);
        KGROUPNAMEMODIFIED = groupGrayElementType6;
        GroupGrayElementType groupGrayElementType7 = new GroupGrayElementType("KBLOCK", 6);
        KBLOCK = groupGrayElementType7;
        GroupGrayElementType groupGrayElementType8 = new GroupGrayElementType("KUNBLOCK", 7);
        KUNBLOCK = groupGrayElementType8;
        GroupGrayElementType groupGrayElementType9 = new GroupGrayElementType("KSHUTUP", 8);
        KSHUTUP = groupGrayElementType9;
        GroupGrayElementType groupGrayElementType10 = new GroupGrayElementType("KBERECYCLED", 9);
        KBERECYCLED = groupGrayElementType10;
        GroupGrayElementType groupGrayElementType11 = new GroupGrayElementType("KDISBANDORBERECYCLED", 10);
        KDISBANDORBERECYCLED = groupGrayElementType11;
        $VALUES = new GroupGrayElementType[]{groupGrayElementType, groupGrayElementType2, groupGrayElementType3, groupGrayElementType4, groupGrayElementType5, groupGrayElementType6, groupGrayElementType7, groupGrayElementType8, groupGrayElementType9, groupGrayElementType10, groupGrayElementType11};
    }

    GroupGrayElementType(String str, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this, str, i);
    }

    public static GroupGrayElementType valueOf(String str) {
        return (GroupGrayElementType) Enum.valueOf(GroupGrayElementType.class, str);
    }

    public static GroupGrayElementType[] values() {
        return (GroupGrayElementType[]) $VALUES.clone();
    }
}
