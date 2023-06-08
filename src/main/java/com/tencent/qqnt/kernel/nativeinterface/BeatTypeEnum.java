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
public final class BeatTypeEnum {
    private static final /* synthetic */ BeatTypeEnum[] $VALUES;
    public static final BeatTypeEnum KFOLDCANSPREAD;
    public static final BeatTypeEnum KFOLDNOTSPREAD;
    public static final BeatTypeEnum KRECOVERY;

    static {
        BeatTypeEnum beatTypeEnum = new BeatTypeEnum("KRECOVERY", 0);
        KRECOVERY = beatTypeEnum;
        BeatTypeEnum beatTypeEnum2 = new BeatTypeEnum("KFOLDNOTSPREAD", 1);
        KFOLDNOTSPREAD = beatTypeEnum2;
        BeatTypeEnum beatTypeEnum3 = new BeatTypeEnum("KFOLDCANSPREAD", 2);
        KFOLDCANSPREAD = beatTypeEnum3;
        $VALUES = new BeatTypeEnum[]{beatTypeEnum, beatTypeEnum2, beatTypeEnum3};

    }

    BeatTypeEnum(String str, int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(79700, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this, (Object) str, i2);
        }
    }

    public static BeatTypeEnum valueOf(String str) {
        return null;
    }

    public static BeatTypeEnum[] values() {
        return (BeatTypeEnum[]) $VALUES.clone();
    }
}
