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

/* compiled from: P */
/* loaded from: classes2.dex */
public final class InlineKeyboardButton {
    boolean atBotShowChannelList;
    int clickLimit;
    String data;
    String id;
    String label;
    int permissionType;
    ArrayList<String> specifyRoleIds;
    ArrayList<String> specifyTinyids;
    int style;
    int type;
    String unsupportTips;
    String visitedLabel;

    public InlineKeyboardButton() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.id = "";
        this.label = "";
        this.visitedLabel = "";
        this.unsupportTips = "";
        this.data = "";
        this.specifyRoleIds = new ArrayList<>();
        this.specifyTinyids = new ArrayList<>();
    }

    public boolean getAtBotShowChannelList() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 11);
        return redirector != null ? ((Boolean) redirector.redirect((short) 11, (Object) this)).booleanValue() : this.atBotShowChannelList;
    }

    public int getClickLimit() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 8);
        return redirector != null ? ((Integer) redirector.redirect((short) 8, (Object) this)).intValue() : this.clickLimit;
    }

    public String getData() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 10);
        return redirector != null ? (String) redirector.redirect((short) 10, (Object) this) : this.data;
    }

    public String getId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, (Object) this) : this.id;
    }

    public String getLabel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.label;
    }

    public int getPermissionType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 12);
        return redirector != null ? ((Integer) redirector.redirect((short) 12, (Object) this)).intValue() : this.permissionType;
    }

    public ArrayList<String> getSpecifyRoleIds() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 13);
        return redirector != null ? (ArrayList) redirector.redirect((short) 13, (Object) this) : this.specifyRoleIds;
    }

    public ArrayList<String> getSpecifyTinyids() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 14);
        return redirector != null ? (ArrayList) redirector.redirect((short) 14, (Object) this) : this.specifyTinyids;
    }

    public int getStyle() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, (Object) this)).intValue() : this.style;
    }

    public int getType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 7);
        return redirector != null ? ((Integer) redirector.redirect((short) 7, (Object) this)).intValue() : this.type;
    }

    public String getUnsupportTips() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, (Object) this) : this.unsupportTips;
    }

    public String getVisitedLabel() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, (Object) this) : this.visitedLabel;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 15);
        if (redirector != null) {
            return (String) redirector.redirect((short) 15, (Object) this);
        }
        return "InlineKeyboardButton{id=" + this.id + ",label=" + this.label + ",visitedLabel=" + this.visitedLabel + ",style=" + this.style + ",type=" + this.type + ",clickLimit=" + this.clickLimit + ",unsupportTips=" + this.unsupportTips + ",data=" + this.data + ",atBotShowChannelList=" + this.atBotShowChannelList + ",permissionType=" + this.permissionType + ",specifyRoleIds=" + this.specifyRoleIds + ",specifyTinyids=" + this.specifyTinyids + ",}";
    }

    public InlineKeyboardButton(String str, String str2, String str3, int i2, int i3, int i4, String str4, String str5, boolean z, int i5, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93158, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, str2, str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str4, str5, Boolean.valueOf(z), Integer.valueOf(i5), arrayList, arrayList2);
            return;
        }
        this.id = "";
        this.label = "";
        this.visitedLabel = "";
        this.unsupportTips = "";
        this.data = "";
        this.specifyRoleIds = new ArrayList<>();
        this.specifyTinyids = new ArrayList<>();
        this.id = str;
        this.label = str2;
        this.visitedLabel = str3;
        this.style = i2;
        this.type = i3;
        this.clickLimit = i4;
        this.unsupportTips = str4;
        this.data = str5;
        this.atBotShowChannelList = z;
        this.permissionType = i5;
        this.specifyRoleIds = arrayList;
        this.specifyTinyids = arrayList2;
    }
}
