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
import java.util.HashMap;

/* loaded from: classes.dex */
public final class XmlToJsonParam {
    long busiId;
    long busiType;
    int c2cType;
    String content;
    int ctrlFlag;
    HashMap<String, String> members;
    byte[] pbReserv;
    Long seqId;
    int serviceType;
    Long templId;
    HashMap<String, String> templParam;

    public XmlToJsonParam() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        } else {
            this.content = "";
        }
    }

    public long getBusiId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, (Object) this)).longValue() : this.busiId;
    }

    public long getBusiType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, (Object) this)).longValue() : this.busiType;
    }

    public int getC2cType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 5);
        return redirector != null ? ((Integer) redirector.redirect((short) 5, (Object) this)).intValue() : this.c2cType;
    }

    public String getContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 8);
        return redirector != null ? (String) redirector.redirect((short) 8, (Object) this) : this.content;
    }

    public int getCtrlFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 7);
        return redirector != null ? ((Integer) redirector.redirect((short) 7, (Object) this)).intValue() : this.ctrlFlag;
    }

    public HashMap<String, String> getMembers() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 13);
        return redirector != null ? (HashMap) redirector.redirect((short) 13, (Object) this) : this.members;
    }

    public byte[] getPbReserv() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 12);
        return redirector != null ? (byte[]) redirector.redirect((short) 12, (Object) this) : this.pbReserv;
    }

    public Long getSeqId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 10);
        return redirector != null ? (Long) redirector.redirect((short) 10, (Object) this) : this.seqId;
    }

    public int getServiceType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, (Object) this)).intValue() : this.serviceType;
    }

    public Long getTemplId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 9);
        return redirector != null ? (Long) redirector.redirect((short) 9, (Object) this) : this.templId;
    }

    public HashMap<String, String> getTemplParam() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 11);
        return redirector != null ? (HashMap) redirector.redirect((short) 11, (Object) this) : this.templParam;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 14);
        if (redirector != null) {
            return (String) redirector.redirect((short) 14, (Object) this);
        }
        return "XmlToJsonParam{busiType=" + this.busiType + ",busiId=" + this.busiId + ",c2cType=" + this.c2cType + ",serviceType=" + this.serviceType + ",ctrlFlag=" + this.ctrlFlag + ",content=" + this.content + ",templId=" + this.templId + ",seqId=" + this.seqId + ",templParam=" + this.templParam + ",pbReserv=" + this.pbReserv + ",members=" + this.members + ",}";
    }

    public XmlToJsonParam(long j2, long j3, int i2, int i3, int i4, String str, Long l2, Long l3, HashMap<String, String> hashMap, byte[] bArr, HashMap<String, String> hashMap2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95178, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, l2, l3, hashMap, bArr, hashMap2);
            return;
        }
        this.content = "";
        this.busiType = j2;
        this.busiId = j3;
        this.c2cType = i2;
        this.serviceType = i3;
        this.ctrlFlag = i4;
        this.content = str;
        this.templId = l2;
        this.seqId = l3;
        this.templParam = hashMap;
        this.pbReserv = bArr;
        this.members = hashMap2;
    }
}
