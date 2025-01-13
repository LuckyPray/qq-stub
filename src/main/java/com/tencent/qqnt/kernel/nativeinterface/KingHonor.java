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
public final class KingHonor {
    Integer groupInfoFlagEx4;
    byte[] groupMsgBusiBuf;
    Integer kingHonorLevel;

    public KingHonor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93263, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        }
    }

    public Integer getGroupInfoFlagEx4() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93263, (short) 4);
        return redirector != null ? (Integer) redirector.redirect((short) 4, this) : this.groupInfoFlagEx4;
    }

    public byte[] getGroupMsgBusiBuf() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93263, (short) 5);
        return redirector != null ? (byte[]) redirector.redirect((short) 5, this) : this.groupMsgBusiBuf;
    }

    public Integer getKingHonorLevel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93263, (short) 3);
        return redirector != null ? (Integer) redirector.redirect((short) 3, this) : this.kingHonorLevel;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93263, (short) 6);
        if (redirector != null) {
            return (String) redirector.redirect((short) 6, this);
        }
        return "KingHonor{kingHonorLevel=" + this.kingHonorLevel + ",groupInfoFlagEx4=" + this.groupInfoFlagEx4 + ",groupMsgBusiBuf=" + this.groupMsgBusiBuf + ",}";
    }

    public KingHonor(Integer num, Integer num2, byte[] bArr) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93263, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, num, num2, bArr);
            return;
        }
        this.kingHonorLevel = num;
        this.groupInfoFlagEx4 = num2;
        this.groupMsgBusiBuf = bArr;
    }
}
