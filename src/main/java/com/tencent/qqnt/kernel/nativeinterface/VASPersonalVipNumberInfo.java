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

/* loaded from: classes.dex */
public final class VASPersonalVipNumberInfo {
    Integer appId;
    Integer itemId;
    Integer numberIdx;
    Integer numberItemId;

    public VASPersonalVipNumberInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95039, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        }
    }

    public Integer getAppId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95039, (short) 3);
        return redirector != null ? (Integer) redirector.redirect((short) 3, this) : this.appId;
    }

    public Integer getItemId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95039, (short) 4);
        return redirector != null ? (Integer) redirector.redirect((short) 4, this) : this.itemId;
    }

    public Integer getNumberIdx() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95039, (short) 6);
        return redirector != null ? (Integer) redirector.redirect((short) 6, this) : this.numberIdx;
    }

    public Integer getNumberItemId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95039, (short) 5);
        return redirector != null ? (Integer) redirector.redirect((short) 5, this) : this.numberItemId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95039, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, this);
        }
        return "VASPersonalVipNumberInfo{appId=" + this.appId + ",itemId=" + this.itemId + ",numberItemId=" + this.numberItemId + ",numberIdx=" + this.numberIdx + ",}";
    }

    public VASPersonalVipNumberInfo(Integer num, Integer num2, Integer num3, Integer num4) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95039, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, num, num2, num3, num4);
            return;
        }
        this.appId = num;
        this.itemId = num2;
        this.numberItemId = num3;
        this.numberIdx = num4;
    }
}
