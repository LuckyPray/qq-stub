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
public final class EssenceElement implements Serializable {
    int isSetEssence;
    long msgSeq;
    long serialVersionUID;
    long tinyId;

    public EssenceElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83101, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
        }
    }

    public int getIsSetEssence() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83101, (short) 5);
        return redirector != null ? ((Integer) redirector.redirect((short) 5, this)).intValue() : this.isSetEssence;
    }

    public long getMsgSeq() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83101, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, this)).longValue() : this.msgSeq;
    }

    public long getTinyId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83101, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, this)).longValue() : this.tinyId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83101, (short) 6);
        if (redirector != null) {
            return (String) redirector.redirect((short) 6, this);
        }
        return "EssenceElement{tinyId=" + this.tinyId + ",msgSeq=" + this.msgSeq + ",isSetEssence=" + this.isSetEssence + ",}";
    }

    public EssenceElement(long j2, long j3, int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83101, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2));
            return;
        }
        this.serialVersionUID = 1L;
        this.tinyId = j2;
        this.msgSeq = j3;
        this.isSetEssence = i2;
    }
}
