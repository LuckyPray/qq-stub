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
public final class MemberRole {
    private static final /* synthetic */ MemberRole[] $VALUES;
    public static final MemberRole ADMIN;
    public static final MemberRole MEMBER;
    public static final MemberRole OWNER;
    public static final MemberRole STRANGER;
    public static final MemberRole UNSPECIFIED;

    static {
        MemberRole memberRole = new MemberRole("UNSPECIFIED", 0);
        UNSPECIFIED = memberRole;
        MemberRole memberRole2 = new MemberRole("STRANGER", 1);
        STRANGER = memberRole2;
        MemberRole memberRole3 = new MemberRole("MEMBER", 2);
        MEMBER = memberRole3;
        MemberRole memberRole4 = new MemberRole("ADMIN", 3);
        ADMIN = memberRole4;
        MemberRole memberRole5 = new MemberRole("OWNER", 4);
        OWNER = memberRole5;
        $VALUES = new MemberRole[]{memberRole, memberRole2, memberRole3, memberRole4, memberRole5};
    }

    MemberRole(String str, int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93460, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this, (Object) str, i2);
        }
    }

    public static MemberRole valueOf(String str) {
        return null;
    }

    public static MemberRole[] values() {
        return (MemberRole[]) $VALUES.clone();
    }
}
