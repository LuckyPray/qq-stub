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
public final class RevokeElement implements Serializable {
    boolean isSelfOperate;
    String operatorMemRemark;
    String operatorNick;
    String operatorRemark;
    long operatorRole;
    long operatorTinyId;
    String operatorUid;
    String origMsgSenderUid;
    long serialVersionUID;
    String wording;

    public RevokeElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.serialVersionUID = 1L;
        this.operatorUid = "";
        this.origMsgSenderUid = "";
        this.wording = "";
    }

    public boolean getIsSelfOperate() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 10);
        return redirector != null ? ((Boolean) redirector.redirect((short) 10, (Object) this)).booleanValue() : this.isSelfOperate;
    }

    public String getOperatorMemRemark() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 8);
        return redirector != null ? (String) redirector.redirect((short) 8, (Object) this) : this.operatorMemRemark;
    }

    public String getOperatorNick() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, (Object) this) : this.operatorNick;
    }

    public String getOperatorRemark() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, (Object) this) : this.operatorRemark;
    }

    public long getOperatorRole() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, (Object) this)).longValue() : this.operatorRole;
    }

    public long getOperatorTinyId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, (Object) this)).longValue() : this.operatorTinyId;
    }

    public String getOperatorUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, (Object) this) : this.operatorUid;
    }

    public String getOrigMsgSenderUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, (Object) this) : this.origMsgSenderUid;
    }

    public String getWording() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 11);
        return redirector != null ? (String) redirector.redirect((short) 11, (Object) this) : this.wording;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 12);
        if (redirector != null) {
            return (String) redirector.redirect((short) 12, (Object) this);
        }
        return "RevokeElement{operatorTinyId=" + this.operatorTinyId + ",operatorRole=" + this.operatorRole + ",operatorUid=" + this.operatorUid + ",operatorNick=" + this.operatorNick + ",operatorRemark=" + this.operatorRemark + ",operatorMemRemark=" + this.operatorMemRemark + ",origMsgSenderUid=" + this.origMsgSenderUid + ",isSelfOperate=" + this.isSelfOperate + ",wording=" + this.wording + ",}";
    }

    public RevokeElement(long j2, long j3, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94329, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), Long.valueOf(j3), str, str2, str3, str4, str5, Boolean.valueOf(z), str6);
            return;
        }
        this.serialVersionUID = 1L;
        this.operatorUid = "";
        this.origMsgSenderUid = "";
        this.wording = "";
        this.operatorTinyId = j2;
        this.operatorRole = j3;
        this.operatorUid = str;
        this.operatorNick = str2;
        this.operatorRemark = str3;
        this.operatorMemRemark = str4;
        this.origMsgSenderUid = str5;
        this.isSelfOperate = z;
        this.wording = str6;
    }
}
