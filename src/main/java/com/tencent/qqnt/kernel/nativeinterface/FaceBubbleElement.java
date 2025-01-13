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
public final class FaceBubbleElement {
    String content;
    Integer faceCount;
    Integer faceFlag;
    String faceSummary;
    int faceType;
    String oldVersionStr;
    String others;
    SmallYellowFaceInfo yellowFaceInfo;

    public FaceBubbleElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        }
    }

    public String getContent() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, this) : this.content;
    }

    public Integer getFaceCount() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 4);
        return redirector != null ? (Integer) redirector.redirect((short) 4, this) : this.faceCount;
    }

    public Integer getFaceFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 6);
        return redirector != null ? (Integer) redirector.redirect((short) 6, this) : this.faceFlag;
    }

    public String getFaceSummary() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.faceSummary;
    }

    public int getFaceType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.faceType;
    }

    public String getOldVersionStr() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 8);
        return redirector != null ? (String) redirector.redirect((short) 8, this) : this.oldVersionStr;
    }

    public String getOthers() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, this) : this.others;
    }

    public SmallYellowFaceInfo getYellowFaceInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 10);
        return redirector != null ? (SmallYellowFaceInfo) redirector.redirect((short) 10, this) : this.yellowFaceInfo;
    }

    public void setContent(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 15);
        if (redirector != null) {
            redirector.redirect((short) 15, this, str);
        } else {
            this.content = str;
        }
    }

    public void setFaceCount(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 12);
        if (redirector != null) {
            redirector.redirect((short) 12, this, num);
        } else {
            this.faceCount = num;
        }
    }

    public void setFaceFlag(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 14);
        if (redirector != null) {
            redirector.redirect((short) 14, this, num);
        } else {
            this.faceFlag = num;
        }
    }

    public void setFaceSummary(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 13);
        if (redirector != null) {
            redirector.redirect((short) 13, this, str);
        } else {
            this.faceSummary = str;
        }
    }

    public void setFaceType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 11);
        if (redirector != null) {
            redirector.redirect((short) 11, this, i2);
        } else {
            this.faceType = i2;
        }
    }

    public void setOldVersionStr(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 16);
        if (redirector != null) {
            redirector.redirect((short) 16, this, str);
        } else {
            this.oldVersionStr = str;
        }
    }

    public void setOthers(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 17);
        if (redirector != null) {
            redirector.redirect((short) 17, this, str);
        } else {
            this.others = str;
        }
    }

    public void setYellowFaceInfo(SmallYellowFaceInfo smallYellowFaceInfo) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 18);
        if (redirector != null) {
            redirector.redirect((short) 18, this, smallYellowFaceInfo);
        } else {
            this.yellowFaceInfo = smallYellowFaceInfo;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 19);
        if (redirector != null) {
            return (String) redirector.redirect((short) 19, this);
        }
        return "FaceBubbleElement{faceType=" + this.faceType + ",faceCount=" + this.faceCount + ",faceSummary=" + this.faceSummary + ",faceFlag=" + this.faceFlag + ",content=" + this.content + ",oldVersionStr=" + this.oldVersionStr + ",others=" + this.others + ",yellowFaceInfo=" + this.yellowFaceInfo + ",}";
    }

    public FaceBubbleElement(int i2, Integer num, String str, Integer num2, String str2, String str3, String str4, SmallYellowFaceInfo smallYellowFaceInfo) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83136, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), num, str, num2, str2, str3, str4, smallYellowFaceInfo);
            return;
        }
        this.faceType = i2;
        this.faceCount = num;
        this.faceSummary = str;
        this.faceFlag = num2;
        this.content = str2;
        this.oldVersionStr = str3;
        this.others = str4;
        this.yellowFaceInfo = smallYellowFaceInfo;
    }
}
