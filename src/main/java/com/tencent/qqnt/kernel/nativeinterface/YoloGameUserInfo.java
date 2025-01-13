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
/* loaded from: classes.dex */
public final class YoloGameUserInfo {
    String bizId;
    int rank;
    int result;
    String uid;

    public YoloGameUserInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95203, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.uid = "";
        this.bizId = "";
    }

    public String getBizId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95203, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, this) : this.bizId;
    }

    public int getRank() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95203, (short) 5);
        return redirector != null ? ((Integer) redirector.redirect((short) 5, this)).intValue() : this.rank;
    }

    public int getResult() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95203, (short) 4);
        return redirector != null ? ((Integer) redirector.redirect((short) 4, this)).intValue() : this.result;
    }

    public String getUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95203, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, this) : this.uid;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95203, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, this);
        }
        return "YoloGameUserInfo{uid=" + this.uid + ",result=" + this.result + ",rank=" + this.rank + ",bizId=" + this.bizId + ",}";
    }

    public YoloGameUserInfo(String str, int i2, int i3, String str2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95203, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, Integer.valueOf(i2), Integer.valueOf(i3), str2);
            return;
        }
        this.uid = "";
        this.bizId = "";
        this.uid = str;
        this.result = i2;
        this.rank = i3;
        this.bizId = str2;
    }
}
