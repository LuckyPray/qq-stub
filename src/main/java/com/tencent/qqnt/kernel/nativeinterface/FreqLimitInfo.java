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

/* compiled from: P */
/* loaded from: classes2.dex */
public final class FreqLimitInfo {
    int isLimited;
    int leftCount;
    long limitTimestamp;

    public FreqLimitInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83822, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        }
    }

    public int getIsLimited() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83822, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, (Object) this)).intValue() : this.isLimited;
    }

    public int getLeftCount() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83822, (short) 4);
        return redirector != null ? ((Integer) redirector.redirect((short) 4, (Object) this)).intValue() : this.leftCount;
    }

    public long getLimitTimestamp() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83822, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, (Object) this)).longValue() : this.limitTimestamp;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83822, (short) 6);
        if (redirector != null) {
            return (String) redirector.redirect((short) 6, (Object) this);
        }
        return "FreqLimitInfo{isLimited=" + this.isLimited + ",leftCount=" + this.leftCount + ",limitTimestamp=" + this.limitTimestamp + ",}";
    }

    public FreqLimitInfo(int i2, int i3, long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83822, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j2));
            return;
        }
        this.isLimited = i2;
        this.leftCount = i3;
        this.limitTimestamp = j2;
    }
}
