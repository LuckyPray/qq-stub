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
public final class JsonGrayElement {
    long busiId;
    boolean isServer;
    String jsonStr;
    String recentAbstract;
    XmlToJsonParam xmlToJsonParam;

    public JsonGrayElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93212, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.jsonStr = "";
        this.recentAbstract = "";
    }

    public long getBusiId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93212, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, this)).longValue() : this.busiId;
    }

    public boolean getIsServer() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93212, (short) 6);
        return redirector != null ? ((Boolean) redirector.redirect((short) 6, this)).booleanValue() : this.isServer;
    }

    public String getJsonStr() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93212, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, this) : this.jsonStr;
    }

    public String getRecentAbstract() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93212, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.recentAbstract;
    }

    public XmlToJsonParam getXmlToJsonParam() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93212, (short) 7);
        return redirector != null ? (XmlToJsonParam) redirector.redirect((short) 7, this) : this.xmlToJsonParam;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93212, (short) 8);
        if (redirector != null) {
            return (String) redirector.redirect((short) 8, this);
        }
        return "JsonGrayElement{busiId=" + this.busiId + ",jsonStr=" + this.jsonStr + ",recentAbstract=" + this.recentAbstract + ",isServer=" + this.isServer + ",xmlToJsonParam=" + this.xmlToJsonParam + ",}";
    }

    public JsonGrayElement(long j2, String str, String str2, boolean z, XmlToJsonParam xmlToJsonParam) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93212, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), str, str2, Boolean.valueOf(z), xmlToJsonParam);
            return;
        }
        this.jsonStr = "";
        this.recentAbstract = "";
        this.busiId = j2;
        this.jsonStr = str;
        this.recentAbstract = str2;
        this.isServer = z;
        this.xmlToJsonParam = xmlToJsonParam;
    }
}
