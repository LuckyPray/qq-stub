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
public final class MarketFaceElement {
    ArrayList<MarketFaceSupportSize> apngSupportSize;
    String backColor;
    String dynamicFacePath;
    public String emojiId;
    int emojiPackageId;
    Integer emojiType;
    Integer endTime;
    int faceInfo;
    String faceName;
    Integer hasIpProduct;
    int imageHeight;
    int imageWidth;
    int itemType;
    public String key;
    int mediaType;
    byte[] mobileParam;
    byte[] param;
    String sourceJumpUrl;
    String sourceName;
    Integer sourceType;
    String sourceTypeName;
    Integer startTime;
    String staticFacePath;
    int subType;
    ArrayList<MarketFaceSupportSize> supportSize;
    ArrayList<Integer> voiceItemHeightArr;
    String volumeColor;

    public MarketFaceElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        }
    }

    public ArrayList<MarketFaceSupportSize> getApngSupportSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 29);
        return redirector != null ? (ArrayList) redirector.redirect((short) 29, (Object) this) : this.apngSupportSize;
    }

    public String getBackColor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 24);
        return redirector != null ? (String) redirector.redirect((short) 24, (Object) this) : this.backColor;
    }

    public String getDynamicFacePath() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 27);
        return redirector != null ? (String) redirector.redirect((short) 27, (Object) this) : this.dynamicFacePath;
    }

    public String getEmojiId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 11);
        return redirector != null ? (String) redirector.redirect((short) 11, (Object) this) : this.emojiId;
    }

    public int getEmojiPackageId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 5);
        return redirector != null ? ((Integer) redirector.redirect((short) 5, (Object) this)).intValue() : this.emojiPackageId;
    }

    public Integer getEmojiType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 18);
        return redirector != null ? (Integer) redirector.redirect((short) 18, (Object) this) : this.emojiType;
    }

    public Integer getEndTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 17);
        return redirector != null ? (Integer) redirector.redirect((short) 17, (Object) this) : this.endTime;
    }

    public int getFaceInfo() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 4);
        return redirector != null ? ((Integer) redirector.redirect((short) 4, (Object) this)).intValue() : this.faceInfo;
    }

    public String getFaceName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 10);
        return redirector != null ? (String) redirector.redirect((short) 10, (Object) this) : this.faceName;
    }

    public Integer getHasIpProduct() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 19);
        return redirector != null ? (Integer) redirector.redirect((short) 19, (Object) this) : this.hasIpProduct;
    }

    public int getImageHeight() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 9);
        return redirector != null ? ((Integer) redirector.redirect((short) 9, (Object) this)).intValue() : this.imageHeight;
    }

    public int getImageWidth() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 8);
        return redirector != null ? ((Integer) redirector.redirect((short) 8, (Object) this)).intValue() : this.imageWidth;
    }

    public int getItemType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, (Object) this)).intValue() : this.itemType;
    }

    public String getKey() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 12);
        return redirector != null ? (String) redirector.redirect((short) 12, (Object) this) : this.key;
    }

    public int getMediaType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 7);
        return redirector != null ? ((Integer) redirector.redirect((short) 7, (Object) this)).intValue() : this.mediaType;
    }

    public byte[] getMobileParam() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 14);
        return redirector != null ? (byte[]) redirector.redirect((short) 14, (Object) this) : this.mobileParam;
    }

    public byte[] getParam() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 13);
        return redirector != null ? (byte[]) redirector.redirect((short) 13, (Object) this) : this.param;
    }

    public String getSourceJumpUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 22);
        return redirector != null ? (String) redirector.redirect((short) 22, (Object) this) : this.sourceJumpUrl;
    }

    public String getSourceName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 21);
        return redirector != null ? (String) redirector.redirect((short) 21, (Object) this) : this.sourceName;
    }

    public Integer getSourceType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 15);
        return redirector != null ? (Integer) redirector.redirect((short) 15, (Object) this) : this.sourceType;
    }

    public String getSourceTypeName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 23);
        return redirector != null ? (String) redirector.redirect((short) 23, (Object) this) : this.sourceTypeName;
    }

    public Integer getStartTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 16);
        return redirector != null ? (Integer) redirector.redirect((short) 16, (Object) this) : this.startTime;
    }

    public String getStaticFacePath() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 26);
        return redirector != null ? (String) redirector.redirect((short) 26, (Object) this) : this.staticFacePath;
    }

    public int getSubType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, (Object) this)).intValue() : this.subType;
    }

    public ArrayList<MarketFaceSupportSize> getSupportSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 28);
        return redirector != null ? (ArrayList) redirector.redirect((short) 28, (Object) this) : this.supportSize;
    }

    public ArrayList<Integer> getVoiceItemHeightArr() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 20);
        return redirector != null ? (ArrayList) redirector.redirect((short) 20, (Object) this) : this.voiceItemHeightArr;
    }

    public String getVolumeColor() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 25);
        return redirector != null ? (String) redirector.redirect((short) 25, (Object) this) : this.volumeColor;
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 30);
        if (redirector != null) {
            return (String) redirector.redirect((short) 30, (Object) this);
        }
        return "MarketFaceElement{itemType=" + this.itemType + ",faceInfo=" + this.faceInfo + ",emojiPackageId=" + this.emojiPackageId + ",subType=" + this.subType + ",mediaType=" + this.mediaType + ",imageWidth=" + this.imageWidth + ",imageHeight=" + this.imageHeight + ",faceName=" + this.faceName + ",emojiId=" + this.emojiId + ",key=" + this.key + ",param=" + this.param + ",mobileParam=" + this.mobileParam + ",sourceType=" + this.sourceType + ",startTime=" + this.startTime + ",endTime=" + this.endTime + ",emojiType=" + this.emojiType + ",hasIpProduct=" + this.hasIpProduct + ",voiceItemHeightArr=" + this.voiceItemHeightArr + ",sourceName=" + this.sourceName + ",sourceJumpUrl=" + this.sourceJumpUrl + ",sourceTypeName=" + this.sourceTypeName + ",backColor=" + this.backColor + ",volumeColor=" + this.volumeColor + ",staticFacePath=" + this.staticFacePath + ",dynamicFacePath=" + this.dynamicFacePath + ",supportSize=" + this.supportSize + ",apngSupportSize=" + this.apngSupportSize + ",}";
    }

    public MarketFaceElement(int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, byte[] bArr, byte[] bArr2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, ArrayList<Integer> arrayList, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList<MarketFaceSupportSize> arrayList2, ArrayList<MarketFaceSupportSize> arrayList3) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93414, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), str, str2, str3, bArr, bArr2, num, num2, num3, num4, num5, arrayList, str4, str5, str6, str7, str8, str9, str10, arrayList2, arrayList3);
            return;
        }
        this.itemType = i2;
        this.faceInfo = i3;
        this.emojiPackageId = i4;
        this.subType = i5;
        this.mediaType = i6;
        this.imageWidth = i7;
        this.imageHeight = i8;
        this.faceName = str;
        this.emojiId = str2;
        this.key = str3;
        this.param = bArr;
        this.mobileParam = bArr2;
        this.sourceType = num;
        this.startTime = num2;
        this.endTime = num3;
        this.emojiType = num4;
        this.hasIpProduct = num5;
        this.voiceItemHeightArr = arrayList;
        this.sourceName = str4;
        this.sourceJumpUrl = str5;
        this.sourceTypeName = str6;
        this.backColor = str7;
        this.volumeColor = str8;
        this.staticFacePath = str9;
        this.dynamicFacePath = str10;
        this.supportSize = arrayList2;
        this.apngSupportSize = arrayList3;
    }
}
