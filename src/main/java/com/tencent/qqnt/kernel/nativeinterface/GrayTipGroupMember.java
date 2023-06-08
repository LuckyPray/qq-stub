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
public final class GrayTipGroupMember implements Serializable {
    String card;
    String name;
    MemberRole role;
    long serialVersionUID;
    String uid;

    public GrayTipGroupMember() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88097, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.serialVersionUID = 1L;
        this.uid = "";
        this.card = "";
        this.name = "";
        this.role = MemberRole.values()[0];
    }

    public String getCard() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88097, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.card;
    }

    public String getName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88097, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, (Object) this) : this.name;
    }

    public MemberRole getRole() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88097, (short) 6);
        return redirector != null ? (MemberRole) redirector.redirect((short) 6, (Object) this) : this.role;
    }

    public String getUid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88097, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, (Object) this) : this.uid;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88097, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, (Object) this);
        }
        return "GrayTipGroupMember{uid=" + this.uid + ",card=" + this.card + ",name=" + this.name + ",role=" + this.role + ",}";
    }

    public GrayTipGroupMember(String str, String str2, String str3, MemberRole memberRole) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(88097, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, str2, str3, memberRole);
            return;
        }
        this.serialVersionUID = 1L;
        this.uid = "";
        this.card = "";
        this.name = "";
        this.role = MemberRole.values()[0];
        this.uid = str;
        this.card = str2;
        this.name = str3;
        this.role = memberRole;
    }
}
