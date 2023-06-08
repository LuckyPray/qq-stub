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
public final class FoldingInfo {
    BeatTypeEnum beatType;
    String greyPrompt;
    String toast;

    public FoldingInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83653, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.beatType = BeatTypeEnum.values()[0];
        this.greyPrompt = "";
        this.toast = "";
    }

    public BeatTypeEnum getBeatType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83653, (short) 3);
        return redirector != null ? (BeatTypeEnum) redirector.redirect((short) 3, (Object) this) : this.beatType;
    }

    public String getGreyPrompt() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83653, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.greyPrompt;
    }

    public String getToast() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83653, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, (Object) this) : this.toast;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83653, (short) 6);
        if (redirector != null) {
            return (String) redirector.redirect((short) 6, (Object) this);
        }
        return "FoldingInfo{beatType=" + this.beatType + ",greyPrompt=" + this.greyPrompt + ",toast=" + this.toast + ",}";
    }

    public FoldingInfo(BeatTypeEnum beatTypeEnum, String str, String str2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83653, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, beatTypeEnum, str, str2);
            return;
        }
        this.beatType = BeatTypeEnum.values()[0];
        this.greyPrompt = "";
        this.toast = "";
        this.beatType = beatTypeEnum;
        this.greyPrompt = str;
        this.toast = str2;
    }
}
