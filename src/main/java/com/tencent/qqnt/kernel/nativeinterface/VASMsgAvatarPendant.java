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

/* loaded from: classes.dex */
public final class VASMsgAvatarPendant {
    public Integer avatarId;
    public Integer pendantDiyInfoId;
    public Long pendantId;

    public VASMsgAvatarPendant() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94989, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        }
    }

    public Integer getAvatarId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94989, (short) 3);
        return redirector != null ? (Integer) redirector.redirect((short) 3, this) : this.avatarId;
    }

    public Integer getPendantDiyInfoId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94989, (short) 5);
        return redirector != null ? (Integer) redirector.redirect((short) 5, this) : this.pendantDiyInfoId;
    }

    public Long getPendantId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94989, (short) 4);
        return redirector != null ? (Long) redirector.redirect((short) 4, this) : this.pendantId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94989, (short) 6);
        if (redirector != null) {
            return (String) redirector.redirect((short) 6, this);
        }
        return "VASMsgAvatarPendant{avatarId=" + this.avatarId + ",pendantId=" + this.pendantId + ",pendantDiyInfoId=" + this.pendantDiyInfoId + ",}";
    }

    public VASMsgAvatarPendant(Integer num, Long l2, Integer num2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94989, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, num, l2, num2);
            return;
        }
        this.avatarId = num;
        this.pendantId = l2;
        this.pendantDiyInfoId = num2;
    }
}
