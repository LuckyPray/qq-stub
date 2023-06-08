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
public final class LiveGiftElement {
    String kStrGiftName;
    String kStrReceiverTinyId;
    long kUInt64GiftId;
    long kUInt64GiftNum;

    public LiveGiftElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93273, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.kStrReceiverTinyId = "";
        this.kStrGiftName = "";
    }

    public String getKStrGiftName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93273, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, (Object) this) : this.kStrGiftName;
    }

    public String getKStrReceiverTinyId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93273, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, (Object) this) : this.kStrReceiverTinyId;
    }

    public long getKUInt64GiftId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93273, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, (Object) this)).longValue() : this.kUInt64GiftId;
    }

    public long getKUInt64GiftNum() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93273, (short) 4);
        return redirector != null ? ((Long) redirector.redirect((short) 4, (Object) this)).longValue() : this.kUInt64GiftNum;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93273, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, (Object) this);
        }
        return "LiveGiftElement{kStrReceiverTinyId=" + this.kStrReceiverTinyId + ",kUInt64GiftNum=" + this.kUInt64GiftNum + ",kUInt64GiftId=" + this.kUInt64GiftId + ",kStrGiftName=" + this.kStrGiftName + ",}";
    }

    public LiveGiftElement(String str, long j2, long j3, String str2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93273, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, Long.valueOf(j2), Long.valueOf(j3), str2);
            return;
        }
        this.kStrReceiverTinyId = "";
        this.kStrGiftName = "";
        this.kStrReceiverTinyId = str;
        this.kUInt64GiftNum = j2;
        this.kUInt64GiftId = j3;
        this.kStrGiftName = str2;
    }
}
