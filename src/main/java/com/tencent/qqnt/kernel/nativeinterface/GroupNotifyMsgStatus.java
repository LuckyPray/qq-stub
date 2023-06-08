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
public final class GroupNotifyMsgStatus {
    private static final /* synthetic */ GroupNotifyMsgStatus[] $VALUES;
    public static final GroupNotifyMsgStatus KAGREED;
    public static final GroupNotifyMsgStatus KIGNORED;
    public static final GroupNotifyMsgStatus KINIT;
    public static final GroupNotifyMsgStatus KREFUSED;
    public static final GroupNotifyMsgStatus KUNHANDLE;

    static {
        GroupNotifyMsgStatus groupNotifyMsgStatus = new GroupNotifyMsgStatus("KINIT", 0);
        KINIT = groupNotifyMsgStatus;
        GroupNotifyMsgStatus groupNotifyMsgStatus2 = new GroupNotifyMsgStatus("KUNHANDLE", 1);
        KUNHANDLE = groupNotifyMsgStatus2;
        GroupNotifyMsgStatus groupNotifyMsgStatus3 = new GroupNotifyMsgStatus("KAGREED", 2);
        KAGREED = groupNotifyMsgStatus3;
        GroupNotifyMsgStatus groupNotifyMsgStatus4 = new GroupNotifyMsgStatus("KREFUSED", 3);
        KREFUSED = groupNotifyMsgStatus4;
        GroupNotifyMsgStatus groupNotifyMsgStatus5 = new GroupNotifyMsgStatus("KIGNORED", 4);
        KIGNORED = groupNotifyMsgStatus5;
        $VALUES = new GroupNotifyMsgStatus[]{groupNotifyMsgStatus, groupNotifyMsgStatus2, groupNotifyMsgStatus3, groupNotifyMsgStatus4, groupNotifyMsgStatus5};
    }

    GroupNotifyMsgStatus(String str, int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88478, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this, (Object) str, i2);
        }
    }

    public static GroupNotifyMsgStatus valueOf(String str) {
        return null;
    }

    public static GroupNotifyMsgStatus[] values() {
        return (GroupNotifyMsgStatus[]) $VALUES.clone();
    }
}
