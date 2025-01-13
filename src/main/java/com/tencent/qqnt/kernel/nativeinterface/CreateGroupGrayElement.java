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
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes2.dex */
public final class CreateGroupGrayElement implements Serializable {
    ArrayList<GrayTipMember> memberInfo;
    long serialVersionUID;

    public CreateGroupGrayElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(81968, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.memberInfo = new ArrayList<>();
    }

    public ArrayList<GrayTipMember> getMemberInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(81968, (short) 3);
        return redirector != null ? (ArrayList) redirector.redirect((short) 3, this) : this.memberInfo;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(81968, (short) 4);
        if (redirector != null) {
            return (String) redirector.redirect((short) 4, this);
        }
        return "CreateGroupGrayElement{memberInfo=" + this.memberInfo + ",}";
    }

    public CreateGroupGrayElement(ArrayList<GrayTipMember> arrayList) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(81968, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.memberInfo = new ArrayList<>();
        this.memberInfo = arrayList;
    }
}
