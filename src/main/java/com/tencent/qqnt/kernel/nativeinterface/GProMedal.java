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
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class GProMedal implements Serializable {
    String desc;
    long endTime;
    long serialVersionUID;
    long startTime;
    String url;

    public GProMedal() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(86707, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.serialVersionUID = 1L;
        this.url = "";
        this.desc = "";
    }

    public String getDesc() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(86707, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, (Object) this) : this.desc;
    }

    public long getEndTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(86707, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, (Object) this)).longValue() : this.endTime;
    }

    public long getStartTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(86707, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, (Object) this)).longValue() : this.startTime;
    }

    public String getUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(86707, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, (Object) this) : this.url;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(86707, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, (Object) this);
        }
        return "GProMedal{startTime=" + this.startTime + ",endTime=" + this.endTime + ",url=" + this.url + ",desc=" + this.desc + ",}";
    }

    public GProMedal(long j2, long j3, String str, String str2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(86707, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), Long.valueOf(j3), str, str2);
            return;
        }
        this.serialVersionUID = 1L;
        this.url = "";
        this.desc = "";
        this.startTime = j2;
        this.endTime = j3;
        this.url = str;
        this.desc = str2;
    }
}
