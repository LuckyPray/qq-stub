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
/* loaded from: classes.dex */
public final class VASGiftSpendCoinItem implements Serializable {
    int amt;
    int coinType;
    long serialVersionUID;

    public VASGiftSpendCoinItem() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94987, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
        }
    }

    public int getAmt() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94987, (short) 4);
        return redirector != null ? ((Integer) redirector.redirect((short) 4, this)).intValue() : this.amt;
    }

    public int getCoinType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94987, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.coinType;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94987, (short) 5);
        if (redirector != null) {
            return (String) redirector.redirect((short) 5, this);
        }
        return "VASGiftSpendCoinItem{coinType=" + this.coinType + ",amt=" + this.amt + ",}";
    }

    public VASGiftSpendCoinItem(int i2, int i3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94987, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), Integer.valueOf(i3));
            return;
        }
        this.serialVersionUID = 1L;
        this.coinType = i2;
        this.amt = i3;
    }
}
