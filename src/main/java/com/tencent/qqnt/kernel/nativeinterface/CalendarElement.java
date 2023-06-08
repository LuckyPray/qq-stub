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

/* compiled from: P */
/* loaded from: classes2.dex */
public final class CalendarElement implements Serializable {
    long expireTimeMs;

    /* renamed from: msg */
    String msg;
    String schema;
    int schemaType;
    long serialVersionUID;
    String summary;

    public CalendarElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(80311, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.serialVersionUID = 1L;
        this.summary = "";
        this.msg = "";
        this.schema = "";
    }

    public long getExpireTimeMs() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(80311, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, (Object) this)).longValue() : this.expireTimeMs;
    }

    public String getMsg() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(80311, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.msg;
    }

    public String getSchema() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(80311, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, (Object) this) : this.schema;
    }

    public int getSchemaType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(80311, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, (Object) this)).intValue() : this.schemaType;
    }

    public String getSummary() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(80311, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, (Object) this) : this.summary;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(80311, (short) 8);
        if (redirector != null) {
            return (String) redirector.redirect((short) 8, (Object) this);
        }
        return "CalendarElement{summary=" + this.summary + ",msg=" + this.msg + ",expireTimeMs=" + this.expireTimeMs + ",schemaType=" + this.schemaType + ",schema=" + this.schema + ",}";
    }

    public CalendarElement(String str, String str2, long j2, int i2, String str3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(80311, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, str2, Long.valueOf(j2), Integer.valueOf(i2), str3);
            return;
        }
        this.serialVersionUID = 1L;
        this.summary = "";
        this.msg = "";
        this.schema = "";
        this.summary = str;
        this.msg = str2;
        this.expireTimeMs = j2;
        this.schemaType = i2;
        this.schema = str3;
    }
}
