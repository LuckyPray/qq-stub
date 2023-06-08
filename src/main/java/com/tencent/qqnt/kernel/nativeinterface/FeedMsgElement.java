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
public final class FeedMsgElement implements Serializable {
    String content;
    long serialVersionUID;
    long tinyId;

    public FeedMsgElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83356, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.serialVersionUID = 1L;
        this.content = "";
    }

    public String getContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83356, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.content;
    }

    public long getTinyId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83356, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, (Object) this)).longValue() : this.tinyId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83356, (short) 5);
        if (redirector != null) {
            return (String) redirector.redirect((short) 5, (Object) this);
        }
        return "FeedMsgElement{tinyId=" + this.tinyId + ",content=" + this.content + ",}";
    }

    public FeedMsgElement(long j2, String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83356, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), str);
            return;
        }
        this.serialVersionUID = 1L;
        this.content = "";
        this.tinyId = j2;
        this.content = str;
    }
}
