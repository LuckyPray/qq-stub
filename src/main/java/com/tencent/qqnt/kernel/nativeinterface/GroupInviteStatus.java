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
public final class GroupInviteStatus {
    private static final /* synthetic */ GroupInviteStatus[] $VALUES;
    public static final GroupInviteStatus INIT;
    public static final GroupInviteStatus JOINED;
    public static final GroupInviteStatus REFUSEDBYADMINISTRATOR;
    public static final GroupInviteStatus WAITTOAPPROVE;

    static {
        GroupInviteStatus groupInviteStatus = new GroupInviteStatus("", 0);
        INIT = groupInviteStatus;
        GroupInviteStatus groupInviteStatus2 = new GroupInviteStatus("WAITTOAPPROVE", 1);
        WAITTOAPPROVE = groupInviteStatus2;
        GroupInviteStatus groupInviteStatus3 = new GroupInviteStatus("JOINED", 2);
        JOINED = groupInviteStatus3;
        GroupInviteStatus groupInviteStatus4 = new GroupInviteStatus("REFUSEDBYADMINISTRATOR", 3);
        REFUSEDBYADMINISTRATOR = groupInviteStatus4;
        $VALUES = new GroupInviteStatus[]{groupInviteStatus, groupInviteStatus2, groupInviteStatus3, groupInviteStatus4};
    }

    GroupInviteStatus(String str, int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88391, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this, (Object) str, i2);
        }
    }

    public static GroupInviteStatus valueOf(String str) {
        return null;
    }

    public static GroupInviteStatus[] values() {
        return (GroupInviteStatus[]) $VALUES.clone();
    }
}
