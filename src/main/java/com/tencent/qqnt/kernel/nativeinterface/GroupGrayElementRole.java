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
public final class GroupGrayElementRole {
    private static final /* synthetic */ GroupGrayElementRole[] $VALUES;
    public static final GroupGrayElementRole KADMIN;
    public static final GroupGrayElementRole KMEMBER;
    public static final GroupGrayElementRole KOTHER;

    static {
        GroupGrayElementRole groupGrayElementRole = new GroupGrayElementRole("KOTHER", 0);
        KOTHER = groupGrayElementRole;
        GroupGrayElementRole groupGrayElementRole2 = new GroupGrayElementRole("KMEMBER", 1);
        KMEMBER = groupGrayElementRole2;
        GroupGrayElementRole groupGrayElementRole3 = new GroupGrayElementRole("KADMIN", 2);
        KADMIN = groupGrayElementRole3;
        $VALUES = new GroupGrayElementRole[]{groupGrayElementRole, groupGrayElementRole2, groupGrayElementRole3};
    }

    GroupGrayElementRole(String str, int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88342, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this, (Object) str, i2);
        }
    }

    public static GroupGrayElementRole valueOf(String str) {
        return null;
    }

    public static GroupGrayElementRole[] values() {
        return (GroupGrayElementRole[]) $VALUES.clone();
    }
}
