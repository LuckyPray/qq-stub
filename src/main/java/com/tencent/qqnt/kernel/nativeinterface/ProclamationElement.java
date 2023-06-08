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
public final class ProclamationElement implements Serializable {
    int isSetProclamation;
    long serialVersionUID;

    public ProclamationElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93903, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        } else {
            this.serialVersionUID = 1L;
        }
    }

    public int getIsSetProclamation() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93903, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, (Object) this)).intValue() : this.isSetProclamation;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93903, (short) 4);
        if (redirector != null) {
            return (String) redirector.redirect((short) 4, (Object) this);
        }
        return "ProclamationElement{isSetProclamation=" + this.isSetProclamation + ",}";
    }

    public ProclamationElement(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93903, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, (Object) this, i2);
            return;
        }
        this.serialVersionUID = 1L;
        this.isSetProclamation = i2;
    }
}
