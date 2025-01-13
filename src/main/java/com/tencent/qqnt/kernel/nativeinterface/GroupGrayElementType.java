/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2023 QAuxiliary developers
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */

package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: P */
/* loaded from: classes2.dex */
public final class GroupGrayElementType {
    private static final /* synthetic */ GroupGrayElementType[] $VALUES;
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

    GroupGrayElementType(String str, int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88353, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this, str, i2);
        }
    }

    public static GroupGrayElementType valueOf(String str) {
        return null;
    }

    public static GroupGrayElementType[] values() {
        return $VALUES.clone();
    }
}
