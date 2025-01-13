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
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class VASAIOPersonalElement {
    Long troopNameColorId;
    Integer vaDataChangeRand;
    VASPersonalNamePlate vasPersonalNamePlate;
    ArrayList<VASPersonalVipNumberInfo> vipNumbers;

    public VASAIOPersonalElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94971, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.vipNumbers = new ArrayList<>();
        }
    }

    public Long getTroopNameColorId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94971, (short) 3);
        return redirector != null ? (Long) redirector.redirect((short) 3, this) : this.troopNameColorId;
    }

    public Integer getVaDataChangeRand() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94971, (short) 5);
        return redirector != null ? (Integer) redirector.redirect((short) 5, this) : this.vaDataChangeRand;
    }

    public VASPersonalNamePlate getVasPersonalNamePlate() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94971, (short) 6);
        return redirector != null ? (VASPersonalNamePlate) redirector.redirect((short) 6, this) : this.vasPersonalNamePlate;
    }

    public ArrayList<VASPersonalVipNumberInfo> getVipNumbers() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94971, (short) 4);
        return redirector != null ? (ArrayList) redirector.redirect((short) 4, this) : this.vipNumbers;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94971, (short) 7);
        if (redirector != null) {
            return (String) redirector.redirect((short) 7, this);
        }
        return "VASAIOPersonalElement{troopNameColorId=" + this.troopNameColorId + ",vipNumbers=" + this.vipNumbers + ",vaDataChangeRand=" + this.vaDataChangeRand + ",vasPersonalNamePlate=" + this.vasPersonalNamePlate + ",}";
    }

    public VASAIOPersonalElement(Long l2, ArrayList<VASPersonalVipNumberInfo> arrayList, Integer num, VASPersonalNamePlate vASPersonalNamePlate) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94971, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, l2, arrayList, num, vASPersonalNamePlate);
            return;
        }
        this.vipNumbers = new ArrayList<>();
        this.troopNameColorId = l2;
        this.vipNumbers = arrayList;
        this.vaDataChangeRand = num;
        this.vasPersonalNamePlate = vASPersonalNamePlate;
    }
}
