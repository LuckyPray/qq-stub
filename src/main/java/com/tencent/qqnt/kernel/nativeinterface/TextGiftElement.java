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
/* loaded from: classes.dex */
public final class TextGiftElement implements Serializable {
    String bgImageUrl;
    int charmValue;
    long giftId;
    String giftName;
    int level;
    boolean needPlayAnimation;
    String orderId;
    String paddingTop;
    long price;
    String receiverNick;
    long receiverUin;
    int sendType;
    String senderNick;
    long senderUin;
    long serialVersionUID;
    ArrayList<VASGiftSpendCoinItem> spendCoins;
    long tianquanId;

    public TextGiftElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.giftName = "";
        this.receiverNick = "";
        this.senderNick = "";
        this.orderId = "";
        this.bgImageUrl = "";
        this.paddingTop = "";
        this.spendCoins = new ArrayList<>();
    }

    public String getBgImageUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 11);
        return redirector != null ? (String) redirector.redirect((short) 11, this) : this.bgImageUrl;
    }

    public int getCharmValue() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 18);
        return redirector != null ? ((Integer) redirector.redirect((short) 18, this)).intValue() : this.charmValue;
    }

    public long getGiftId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 3);
        return redirector != null ? ((Long) redirector.redirect((short) 3, this)).longValue() : this.giftId;
    }

    public String getGiftName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, this) : this.giftName;
    }

    public int getLevel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 13);
        return redirector != null ? ((Integer) redirector.redirect((short) 13, this)).intValue() : this.level;
    }

    public boolean getNeedPlayAnimation() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 16);
        return redirector != null ? ((Boolean) redirector.redirect((short) 16, this)).booleanValue() : this.needPlayAnimation;
    }

    public String getOrderId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 10);
        return redirector != null ? (String) redirector.redirect((short) 10, this) : this.orderId;
    }

    public String getPaddingTop() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 14);
        return redirector != null ? (String) redirector.redirect((short) 14, this) : this.paddingTop;
    }

    public long getPrice() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 9);
        return redirector != null ? ((Long) redirector.redirect((short) 9, this)).longValue() : this.price;
    }

    public String getReceiverNick() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, this) : this.receiverNick;
    }

    public long getReceiverUin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, this)).longValue() : this.receiverUin;
    }

    public int getSendType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 17);
        return redirector != null ? ((Integer) redirector.redirect((short) 17, this)).intValue() : this.sendType;
    }

    public String getSenderNick() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 8);
        return redirector != null ? (String) redirector.redirect((short) 8, this) : this.senderNick;
    }

    public long getSenderUin() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 6);
        return redirector != null ? ((Long) redirector.redirect((short) 6, this)).longValue() : this.senderUin;
    }

    public ArrayList<VASGiftSpendCoinItem> getSpendCoins() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 15);
        return redirector != null ? (ArrayList) redirector.redirect((short) 15, this) : this.spendCoins;
    }

    public long getTianquanId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 12);
        return redirector != null ? ((Long) redirector.redirect((short) 12, this)).longValue() : this.tianquanId;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 19);
        if (redirector != null) {
            return (String) redirector.redirect((short) 19, this);
        }
        return "TextGiftElement{giftId=" + this.giftId + ",giftName=" + this.giftName + ",receiverUin=" + this.receiverUin + ",senderUin=" + this.senderUin + ",receiverNick=" + this.receiverNick + ",senderNick=" + this.senderNick + ",price=" + this.price + ",orderId=" + this.orderId + ",bgImageUrl=" + this.bgImageUrl + ",tianquanId=" + this.tianquanId + ",level=" + this.level + ",paddingTop=" + this.paddingTop + ",spendCoins=" + this.spendCoins + ",needPlayAnimation=" + this.needPlayAnimation + ",sendType=" + this.sendType + ",charmValue=" + this.charmValue + ",}";
    }

    public TextGiftElement(long j2, String str, long j3, long j4, String str2, String str3, long j5, String str4, String str5, long j6, int i2, String str6, ArrayList<VASGiftSpendCoinItem> arrayList, boolean z, int i3, int i4) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(94775, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Long.valueOf(j2), str, Long.valueOf(j3), Long.valueOf(j4), str2, str3, Long.valueOf(j5), str4, str5, Long.valueOf(j6), Integer.valueOf(i2), str6, arrayList, Boolean.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i4));
            return;
        }
        this.serialVersionUID = 1L;
        this.giftName = "";
        this.receiverNick = "";
        this.senderNick = "";
        this.orderId = "";
        this.bgImageUrl = "";
        this.paddingTop = "";
        this.spendCoins = new ArrayList<>();
        this.giftId = j2;
        this.giftName = str;
        this.receiverUin = j3;
        this.senderUin = j4;
        this.receiverNick = str2;
        this.senderNick = str3;
        this.price = j5;
        this.orderId = str4;
        this.bgImageUrl = str5;
        this.tianquanId = j6;
        this.level = i2;
        this.paddingTop = str6;
        this.spendCoins = arrayList;
        this.needPlayAnimation = z;
        this.sendType = i3;
        this.charmValue = i4;
    }
}
