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
public final class MultiForwardMsgElement {
    String fileName;
    String resId;
    String xmlContent;

    public MultiForwardMsgElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93654, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        }
    }

    public String getFileName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93654, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, (Object) this) : this.fileName;
    }

    public String getResId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93654, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.resId;
    }

    public String getXmlContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93654, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, (Object) this) : this.xmlContent;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93654, (short) 6);
        if (redirector != null) {
            return (String) redirector.redirect((short) 6, (Object) this);
        }
        return "MultiForwardMsgElement{xmlContent=" + this.xmlContent + ",resId=" + this.resId + ",fileName=" + this.fileName + ",}";
    }

    public MultiForwardMsgElement(String str, String str2, String str3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93654, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, str2, str3);
            return;
        }
        this.xmlContent = str;
        this.resId = str2;
        this.fileName = str3;
    }
}
