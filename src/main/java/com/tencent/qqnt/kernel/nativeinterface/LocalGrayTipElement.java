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
public final class LocalGrayTipElement implements Serializable {
    LocalGrayTipDirect direct;
    String extraJson;
    LocalGrayTipRobot robot;
    long serialVersionUID;
    int type;

    public LocalGrayTipElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93303, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.serialVersionUID = 1L;
        this.extraJson = "";
    }

    public LocalGrayTipDirect getDirect() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93303, (short) 5);
        return redirector != null ? (LocalGrayTipDirect) redirector.redirect((short) 5, (Object) this) : this.direct;
    }

    public String getExtraJson() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93303, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, (Object) this) : this.extraJson;
    }

    public LocalGrayTipRobot getRobot() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93303, (short) 4);
        return redirector != null ? (LocalGrayTipRobot) redirector.redirect((short) 4, (Object) this) : this.robot;
    }

    public int getType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93303, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, (Object) this)).intValue() : this.type;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93303, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, (Object) this);
        }
        return "LocalGrayTipElement{type=" + this.type + ",robot=" + this.robot + ",direct=" + this.direct + ",extraJson=" + this.extraJson + ",}";
    }

    public LocalGrayTipElement(int i2, LocalGrayTipRobot localGrayTipRobot, LocalGrayTipDirect localGrayTipDirect, String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93303, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), localGrayTipRobot, localGrayTipDirect, str);
            return;
        }
        this.serialVersionUID = 1L;
        this.extraJson = "";
        this.type = i2;
        this.robot = localGrayTipRobot;
        this.direct = localGrayTipDirect;
        this.extraJson = str;
    }
}
