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
public final class FaceElement implements IKernelModel {
    Integer doubleHit;
    Integer faceBubbleCount;
    int faceIndex;
    String faceText;
    int faceType;
    Integer imageType;
    Integer msgType;
    String oldVersionStr;
    String packId;
    Integer pokeFlag;
    Integer pokeStrength;
    Integer pokeType;
    Integer randomType;
    String resultId;
    Integer sourceType;
    String spokeSummary;
    String stickerId;
    Integer stickerType;
    String surpriseId;
    Integer vaspokeId;
    String vaspokeMinver;
    String vaspokeName;

    public FaceElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
        }
    }

    public Integer getDoubleHit() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 16);
        return redirector != null ? (Integer) redirector.redirect((short) 16, this) : this.doubleHit;
    }

    public Integer getFaceBubbleCount() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 22);
        return redirector != null ? (Integer) redirector.redirect((short) 22, this) : this.faceBubbleCount;
    }

    public int getFaceIndex() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, this)).intValue() : this.faceIndex;
    }

    public String getFaceText() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, this) : this.faceText;
    }

    public int getFaceType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 5);
        return redirector != null ? ((Integer) redirector.redirect((short) 5, this)).intValue() : this.faceType;
    }

    public Integer getImageType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 13);
        return redirector != null ? (Integer) redirector.redirect((short) 13, this) : this.imageType;
    }

    public Integer getMsgType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 21);
        return redirector != null ? (Integer) redirector.redirect((short) 21, this) : this.msgType;
    }

    public String getOldVersionStr() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 23);
        return redirector != null ? (String) redirector.redirect((short) 23, this) : this.oldVersionStr;
    }

    public String getPackId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, this) : this.packId;
    }

    public Integer getPokeFlag() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 24);
        return redirector != null ? (Integer) redirector.redirect((short) 24, this) : this.pokeFlag;
    }

    public Integer getPokeStrength() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 20);
        return redirector != null ? (Integer) redirector.redirect((short) 20, this) : this.pokeStrength;
    }

    public Integer getPokeType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 14);
        return redirector != null ? (Integer) redirector.redirect((short) 14, this) : this.pokeType;
    }

    public Integer getRandomType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 12);
        return redirector != null ? (Integer) redirector.redirect((short) 12, this) : this.randomType;
    }

    public String getResultId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 10);
        return redirector != null ? (String) redirector.redirect((short) 10, this) : this.resultId;
    }

    public Integer getSourceType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 8);
        return redirector != null ? (Integer) redirector.redirect((short) 8, this) : this.sourceType;
    }

    public String getSpokeSummary() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 15);
        return redirector != null ? (String) redirector.redirect((short) 15, this) : this.spokeSummary;
    }

    public String getStickerId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 7);
        return redirector != null ? (String) redirector.redirect((short) 7, this) : this.stickerId;
    }

    public Integer getStickerType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 9);
        return redirector != null ? (Integer) redirector.redirect((short) 9, this) : this.stickerType;
    }

    public String getSurpriseId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 11);
        return redirector != null ? (String) redirector.redirect((short) 11, this) : this.surpriseId;
    }

    public Integer getVaspokeId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 17);
        return redirector != null ? (Integer) redirector.redirect((short) 17, this) : this.vaspokeId;
    }

    public String getVaspokeMinver() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 19);
        return redirector != null ? (String) redirector.redirect((short) 19, this) : this.vaspokeMinver;
    }

    public String getVaspokeName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 18);
        return redirector != null ? (String) redirector.redirect((short) 18, this) : this.vaspokeName;
    }

    public void setDoubleHit(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 38);
        if (redirector != null) {
            redirector.redirect((short) 38, this, num);
        } else {
            this.doubleHit = num;
        }
    }

    public void setFaceBubbleCount(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 44);
        if (redirector != null) {
            redirector.redirect((short) 44, this, num);
        } else {
            this.faceBubbleCount = num;
        }
    }

    public void setFaceIndex(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 25);
        if (redirector != null) {
            redirector.redirect((short) 25, this, i2);
        } else {
            this.faceIndex = i2;
        }
    }

    public void setFaceText(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 26);
        if (redirector != null) {
            redirector.redirect((short) 26, this, str);
        } else {
            this.faceText = str;
        }
    }

    public void setFaceType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 27);
        if (redirector != null) {
            redirector.redirect((short) 27, this, i2);
        } else {
            this.faceType = i2;
        }
    }

    public void setImageType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 35);
        if (redirector != null) {
            redirector.redirect((short) 35, this, num);
        } else {
            this.imageType = num;
        }
    }

    public void setMsgType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 43);
        if (redirector != null) {
            redirector.redirect((short) 43, this, num);
        } else {
            this.msgType = num;
        }
    }

    public void setOldVersionStr(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 45);
        if (redirector != null) {
            redirector.redirect((short) 45, this, str);
        } else {
            this.oldVersionStr = str;
        }
    }

    public void setPackId(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 28);
        if (redirector != null) {
            redirector.redirect((short) 28, this, str);
        } else {
            this.packId = str;
        }
    }

    public void setPokeFlag(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 46);
        if (redirector != null) {
            redirector.redirect((short) 46, this, num);
        } else {
            this.pokeFlag = num;
        }
    }

    public void setPokeStrength(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 42);
        if (redirector != null) {
            redirector.redirect((short) 42, this, num);
        } else {
            this.pokeStrength = num;
        }
    }

    public void setPokeType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 36);
        if (redirector != null) {
            redirector.redirect((short) 36, this, num);
        } else {
            this.pokeType = num;
        }
    }

    public void setRandomType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 34);
        if (redirector != null) {
            redirector.redirect((short) 34, this, num);
        } else {
            this.randomType = num;
        }
    }

    public void setResultId(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 32);
        if (redirector != null) {
            redirector.redirect((short) 32, this, str);
        } else {
            this.resultId = str;
        }
    }

    public void setSourceType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 30);
        if (redirector != null) {
            redirector.redirect((short) 30, this, num);
        } else {
            this.sourceType = num;
        }
    }

    public void setSpokeSummary(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 37);
        if (redirector != null) {
            redirector.redirect((short) 37, this, str);
        } else {
            this.spokeSummary = str;
        }
    }

    public void setStickerId(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 29);
        if (redirector != null) {
            redirector.redirect((short) 29, this, str);
        } else {
            this.stickerId = str;
        }
    }

    public void setStickerType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 31);
        if (redirector != null) {
            redirector.redirect((short) 31, this, num);
        } else {
            this.stickerType = num;
        }
    }

    public void setSurpriseId(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 33);
        if (redirector != null) {
            redirector.redirect((short) 33, this, str);
        } else {
            this.surpriseId = str;
        }
    }

    public void setVaspokeId(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 39);
        if (redirector != null) {
            redirector.redirect((short) 39, this, num);
        } else {
            this.vaspokeId = num;
        }
    }

    public void setVaspokeMinver(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 41);
        if (redirector != null) {
            redirector.redirect((short) 41, this, str);
        } else {
            this.vaspokeMinver = str;
        }
    }

    public void setVaspokeName(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 40);
        if (redirector != null) {
            redirector.redirect((short) 40, this, str);
        } else {
            this.vaspokeName = str;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 47);
        if (redirector != null) {
            return (String) redirector.redirect((short) 47, this);
        }
        return "FaceElement{faceIndex=" + this.faceIndex + ",faceText=" + this.faceText + ",faceType=" + this.faceType + ",packId=" + this.packId + ",stickerId=" + this.stickerId + ",sourceType=" + this.sourceType + ",stickerType=" + this.stickerType + ",resultId=" + this.resultId + ",surpriseId=" + this.surpriseId + ",randomType=" + this.randomType + ",imageType=" + this.imageType + ",pokeType=" + this.pokeType + ",spokeSummary=" + this.spokeSummary + ",doubleHit=" + this.doubleHit + ",vaspokeId=" + this.vaspokeId + ",vaspokeName=" + this.vaspokeName + ",vaspokeMinver=" + this.vaspokeMinver + ",pokeStrength=" + this.pokeStrength + ",msgType=" + this.msgType + ",faceBubbleCount=" + this.faceBubbleCount + ",oldVersionStr=" + this.oldVersionStr + ",pokeFlag=" + this.pokeFlag + ",}";
    }

    public FaceElement(int i2, String str, int i3, String str2, String str3, Integer num, Integer num2, String str4, String str5, Integer num3, Integer num4, Integer num5, String str6, Integer num6, Integer num7, String str7, String str8, Integer num8, Integer num9, Integer num10, String str9, Integer num11) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83187, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), str, Integer.valueOf(i3), str2, str3, num, num2, str4, str5, num3, num4, num5, str6, num6, num7, str7, str8, num8, num9, num10, str9, num11);
            return;
        }
        this.faceIndex = i2;
        this.faceText = str;
        this.faceType = i3;
        this.packId = str2;
        this.stickerId = str3;
        this.sourceType = num;
        this.stickerType = num2;
        this.resultId = str4;
        this.surpriseId = str5;
        this.randomType = num3;
        this.imageType = num4;
        this.pokeType = num5;
        this.spokeSummary = str6;
        this.doubleHit = num6;
        this.vaspokeId = num7;
        this.vaspokeName = str7;
        this.vaspokeMinver = str8;
        this.pokeStrength = num8;
        this.msgType = num9;
        this.faceBubbleCount = num10;
        this.oldVersionStr = str9;
        this.pokeFlag = num11;
    }
}
