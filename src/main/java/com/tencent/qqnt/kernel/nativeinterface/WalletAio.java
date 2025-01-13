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
/* loaded from: classes.dex */
public final class WalletAio {
    String actionsPriority;
    String aioImageLeft;
    String aioImageRight;
    int background;
    String blackStripe;
    String cftImage;
    String content;
    int contentBgcolor;
    int contentColor;
    int icon;
    String iconUrl;
    String jumpUrl;
    String linkUrl;
    String nativeAndroid;
    String nativeIOS;
    String notice;
    byte[] pbReserve;
    String subTitle;
    int subtitleColor;
    String title;
    int titleColor;

    public WalletAio() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.title = "";
        this.subTitle = "";
        this.content = "";
        this.linkUrl = "";
        this.blackStripe = "";
        this.notice = "";
        this.actionsPriority = "";
        this.jumpUrl = "";
        this.nativeIOS = "";
        this.nativeAndroid = "";
        this.iconUrl = "";
        this.aioImageLeft = "";
        this.aioImageRight = "";
        this.cftImage = "";
        this.pbReserve = new byte[0];
    }

    public String getActionsPriority() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 13);
        return redirector != null ? (String) redirector.redirect((short) 13, this) : this.actionsPriority;
    }

    public String getAioImageLeft() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 20);
        return redirector != null ? (String) redirector.redirect((short) 20, this) : this.aioImageLeft;
    }

    public String getAioImageRight() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 21);
        return redirector != null ? (String) redirector.redirect((short) 21, this) : this.aioImageRight;
    }

    public int getBackground() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.background;
    }

    public String getBlackStripe() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, this) : this.blackStripe;
    }

    public String getCftImage() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 22);
        return redirector != null ? (String) redirector.redirect((short) 22, this) : this.cftImage;
    }

    public String getContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, this) : this.content;
    }

    public int getContentBgcolor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 19);
        return redirector != null ? ((Integer) redirector.redirect((short) 19, this)).intValue() : this.contentBgcolor;
    }

    public int getContentColor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 18);
        return redirector != null ? ((Integer) redirector.redirect((short) 18, this)).intValue() : this.contentColor;
    }

    public int getIcon() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 4);
        return redirector != null ? ((Integer) redirector.redirect((short) 4, this)).intValue() : this.icon;
    }

    public String getIconUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 17);
        return redirector != null ? (String) redirector.redirect((short) 17, this) : this.iconUrl;
    }

    public String getJumpUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 14);
        return redirector != null ? (String) redirector.redirect((short) 14, this) : this.jumpUrl;
    }

    public String getLinkUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 8);
        return redirector != null ? (String) redirector.redirect((short) 8, this) : this.linkUrl;
    }

    public String getNativeAndroid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 16);
        return redirector != null ? (String) redirector.redirect((short) 16, this) : this.nativeAndroid;
    }

    public String getNativeIOS() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 15);
        return redirector != null ? (String) redirector.redirect((short) 15, this) : this.nativeIOS;
    }

    public String getNotice() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 10);
        return redirector != null ? (String) redirector.redirect((short) 10, this) : this.notice;
    }

    public byte[] getPbReserve() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 23);
        return redirector != null ? (byte[]) redirector.redirect((short) 23, this) : this.pbReserve;
    }

    public String getSubTitle() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, this) : this.subTitle;
    }

    public int getSubtitleColor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 12);
        return redirector != null ? ((Integer) redirector.redirect((short) 12, this)).intValue() : this.subtitleColor;
    }

    public String getTitle() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.title;
    }

    public int getTitleColor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 11);
        return redirector != null ? ((Integer) redirector.redirect((short) 11, this)).intValue() : this.titleColor;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 24);
        if (redirector != null) {
            return (String) redirector.redirect((short) 24, this);
        }
        return "WalletAio{background=" + this.background + ",icon=" + this.icon + ",title=" + this.title + ",subTitle=" + this.subTitle + ",content=" + this.content + ",linkUrl=" + this.linkUrl + ",blackStripe=" + this.blackStripe + ",notice=" + this.notice + ",titleColor=" + this.titleColor + ",subtitleColor=" + this.subtitleColor + ",actionsPriority=" + this.actionsPriority + ",jumpUrl=" + this.jumpUrl + ",nativeIOS=" + this.nativeIOS + ",nativeAndroid=" + this.nativeAndroid + ",iconUrl=" + this.iconUrl + ",contentColor=" + this.contentColor + ",contentBgcolor=" + this.contentBgcolor + ",aioImageLeft=" + this.aioImageLeft + ",aioImageRight=" + this.aioImageRight + ",cftImage=" + this.cftImage + ",pbReserve=" + this.pbReserve + ",}";
    }

    public WalletAio(int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, int i4, int i5, String str7, String str8, String str9, String str10, String str11, int i6, int i7, String str12, String str13, String str14, byte[] bArr) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95123, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), Integer.valueOf(i3), str, str2, str3, str4, str5, str6, Integer.valueOf(i4), Integer.valueOf(i5), str7, str8, str9, str10, str11, Integer.valueOf(i6), Integer.valueOf(i7), str12, str13, str14, bArr);
            return;
        }
        this.title = "";
        this.subTitle = "";
        this.content = "";
        this.linkUrl = "";
        this.blackStripe = "";
        this.notice = "";
        this.actionsPriority = "";
        this.jumpUrl = "";
        this.nativeIOS = "";
        this.nativeAndroid = "";
        this.iconUrl = "";
        this.aioImageLeft = "";
        this.aioImageRight = "";
        this.cftImage = "";
        this.pbReserve = new byte[0];
        this.background = i2;
        this.icon = i3;
        this.title = str;
        this.subTitle = str2;
        this.content = str3;
        this.linkUrl = str4;
        this.blackStripe = str5;
        this.notice = str6;
        this.titleColor = i4;
        this.subtitleColor = i5;
        this.actionsPriority = str7;
        this.jumpUrl = str8;
        this.nativeIOS = str9;
        this.nativeAndroid = str10;
        this.iconUrl = str11;
        this.contentColor = i6;
        this.contentBgcolor = i7;
        this.aioImageLeft = str12;
        this.aioImageRight = str13;
        this.cftImage = str14;
        this.pbReserve = bArr;
    }
}
