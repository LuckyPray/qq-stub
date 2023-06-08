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
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class PicElement implements IKernelModel {
    String downloadIndex;
    EmojiAD emojiAd;
    Integer emojiFrom;
    EmojiMall emojiMall;
    String emojiWebUrl;
    EmojiZPlan emojiZplan;
    Integer fileBizId;
    String fileName;
    long fileSize;
    String fileSubId;
    String fileUuid;
    byte[] importRichMediaContext;
    Integer invalidState;
    Boolean isFlashPic;
    String md5HexStr;
    String originImageMd5;
    String originImageUrl;
    boolean original;
    int picHeight;
    int picSubType;
    Integer picType;
    int picWidth;
    Integer progress;
    String sourcePath;
    String summary;
    int thumbFileSize;
    HashMap<Integer, String> thumbPath;
    Integer transferStatus;

    public PicElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
            return;
        }
        this.fileName = "";
        this.md5HexStr = "";
        this.fileUuid = "";
        this.fileSubId = "";
        this.originImageMd5 = "";
    }

    public String getDownloadIndex() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 20);
        return redirector != null ? (String) redirector.redirect((short) 20, (Object) this) : this.downloadIndex;
    }

    public EmojiAD getEmojiAd() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 24);
        return redirector != null ? (EmojiAD) redirector.redirect((short) 24, (Object) this) : this.emojiAd;
    }

    public Integer getEmojiFrom() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 22);
        return redirector != null ? (Integer) redirector.redirect((short) 22, (Object) this) : this.emojiFrom;
    }

    public EmojiMall getEmojiMall() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 25);
        return redirector != null ? (EmojiMall) redirector.redirect((short) 25, (Object) this) : this.emojiMall;
    }

    public String getEmojiWebUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 23);
        return redirector != null ? (String) redirector.redirect((short) 23, (Object) this) : this.emojiWebUrl;
    }

    public EmojiZPlan getEmojiZplan() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 26);
        return redirector != null ? (EmojiZPlan) redirector.redirect((short) 26, (Object) this) : this.emojiZplan;
    }

    public Integer getFileBizId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 19);
        return redirector != null ? (Integer) redirector.redirect((short) 19, (Object) this) : this.fileBizId;
    }

    public String getFileName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, (Object) this) : this.fileName;
    }

    public long getFileSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 5);
        return redirector != null ? ((Long) redirector.redirect((short) 5, (Object) this)).longValue() : this.fileSize;
    }

    public String getFileSubId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 17);
        return redirector != null ? (String) redirector.redirect((short) 17, (Object) this) : this.fileSubId;
    }

    public String getFileUuid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 16);
        return redirector != null ? (String) redirector.redirect((short) 16, (Object) this) : this.fileUuid;
    }

    public byte[] getImportRichMediaContext() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 29);
        return redirector != null ? (byte[]) redirector.redirect((short) 29, (Object) this) : this.importRichMediaContext;
    }

    public Integer getInvalidState() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 15);
        return redirector != null ? (Integer) redirector.redirect((short) 15, (Object) this) : this.invalidState;
    }

    public Boolean getIsFlashPic() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 30);
        return redirector != null ? (Boolean) redirector.redirect((short) 30, (Object) this) : this.isFlashPic;
    }

    public String getMd5HexStr() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 9);
        return redirector != null ? (String) redirector.redirect((short) 9, (Object) this) : this.md5HexStr;
    }

    public String getOriginImageMd5() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 27);
        return redirector != null ? (String) redirector.redirect((short) 27, (Object) this) : this.originImageMd5;
    }

    public String getOriginImageUrl() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 28);
        return redirector != null ? (String) redirector.redirect((short) 28, (Object) this) : this.originImageUrl;
    }

    public boolean getOriginal() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 8);
        return redirector != null ? ((Boolean) redirector.redirect((short) 8, (Object) this)).booleanValue() : this.original;
    }

    public int getPicHeight() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 7);
        return redirector != null ? ((Integer) redirector.redirect((short) 7, (Object) this)).intValue() : this.picHeight;
    }

    public int getPicSubType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 3);
        return redirector != null ? ((Integer) redirector.redirect((short) 3, (Object) this)).intValue() : this.picSubType;
    }

    public Integer getPicType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 14);
        return redirector != null ? (Integer) redirector.redirect((short) 14, (Object) this) : this.picType;
    }

    public int getPicWidth() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 6);
        return redirector != null ? ((Integer) redirector.redirect((short) 6, (Object) this)).intValue() : this.picWidth;
    }

    public Integer getProgress() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 13);
        return redirector != null ? (Integer) redirector.redirect((short) 13, (Object) this) : this.progress;
    }

    public String getSourcePath() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 10);
        return redirector != null ? (String) redirector.redirect((short) 10, (Object) this) : this.sourcePath;
    }

    public String getSummary() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 21);
        return redirector != null ? (String) redirector.redirect((short) 21, (Object) this) : this.summary;
    }

    public int getThumbFileSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 18);
        return redirector != null ? ((Integer) redirector.redirect((short) 18, (Object) this)).intValue() : this.thumbFileSize;
    }

    public HashMap<Integer, String> getThumbPath() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 11);
        return redirector != null ? (HashMap) redirector.redirect((short) 11, (Object) this) : this.thumbPath;
    }

    public Integer getTransferStatus() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 12);
        return redirector != null ? (Integer) redirector.redirect((short) 12, (Object) this) : this.transferStatus;
    }

    public void setDownloadIndex(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 48);
        if (redirector != null) {
            redirector.redirect((short) 48, (Object) this, (Object) str);
        } else {
            this.downloadIndex = str;
        }
    }

    public void setEmojiAd(EmojiAD emojiAD) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 52);
        if (redirector != null) {
            redirector.redirect((short) 52, (Object) this, (Object) emojiAD);
        } else {
            this.emojiAd = emojiAD;
        }
    }

    public void setEmojiFrom(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 50);
        if (redirector != null) {
            redirector.redirect((short) 50, (Object) this, (Object) num);
        } else {
            this.emojiFrom = num;
        }
    }

    public void setEmojiMall(EmojiMall emojiMall) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 53);
        if (redirector != null) {
            redirector.redirect((short) 53, (Object) this, (Object) emojiMall);
        } else {
            this.emojiMall = emojiMall;
        }
    }

    public void setEmojiWebUrl(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 51);
        if (redirector != null) {
            redirector.redirect((short) 51, (Object) this, (Object) str);
        } else {
            this.emojiWebUrl = str;
        }
    }

    public void setEmojiZplan(EmojiZPlan emojiZPlan) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 54);
        if (redirector != null) {
            redirector.redirect((short) 54, (Object) this, (Object) emojiZPlan);
        } else {
            this.emojiZplan = emojiZPlan;
        }
    }

    public void setFileBizId(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 47);
        if (redirector != null) {
            redirector.redirect((short) 47, (Object) this, (Object) num);
        } else {
            this.fileBizId = num;
        }
    }

    public void setFileName(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 32);
        if (redirector != null) {
            redirector.redirect((short) 32, (Object) this, (Object) str);
        } else {
            this.fileName = str;
        }
    }

    public void setFileSize(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 33);
        if (redirector != null) {
            redirector.redirect((short) 33, (Object) this, j2);
        } else {
            this.fileSize = j2;
        }
    }

    public void setFileSubId(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 45);
        if (redirector != null) {
            redirector.redirect((short) 45, (Object) this, (Object) str);
        } else {
            this.fileSubId = str;
        }
    }

    public void setFileUuid(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 44);
        if (redirector != null) {
            redirector.redirect((short) 44, (Object) this, (Object) str);
        } else {
            this.fileUuid = str;
        }
    }

    public void setImportRichMediaContext(byte[] bArr) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 57);
        if (redirector != null) {
            redirector.redirect((short) 57, (Object) this, (Object) bArr);
        } else {
            this.importRichMediaContext = bArr;
        }
    }

    public void setInvalidState(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 43);
        if (redirector != null) {
            redirector.redirect((short) 43, (Object) this, (Object) num);
        } else {
            this.invalidState = num;
        }
    }

    public void setIsFlashPic(Boolean bool) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 58);
        if (redirector != null) {
            redirector.redirect((short) 58, (Object) this, (Object) bool);
        } else {
            this.isFlashPic = bool;
        }
    }

    public void setMd5HexStr(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 37);
        if (redirector != null) {
            redirector.redirect((short) 37, (Object) this, (Object) str);
        } else {
            this.md5HexStr = str;
        }
    }

    public void setOriginImageMd5(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 55);
        if (redirector != null) {
            redirector.redirect((short) 55, (Object) this, (Object) str);
        } else {
            this.originImageMd5 = str;
        }
    }

    public void setOriginImageUrl(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 56);
        if (redirector != null) {
            redirector.redirect((short) 56, (Object) this, (Object) str);
        } else {
            this.originImageUrl = str;
        }
    }

    public void setOriginal(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 36);
        if (redirector != null) {
            redirector.redirect((short) 36, (Object) this, z);
        } else {
            this.original = z;
        }
    }

    public void setPicHeight(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 35);
        if (redirector != null) {
            redirector.redirect((short) 35, (Object) this, i2);
        } else {
            this.picHeight = i2;
        }
    }

    public void setPicSubType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 31);
        if (redirector != null) {
            redirector.redirect((short) 31, (Object) this, i2);
        } else {
            this.picSubType = i2;
        }
    }

    public void setPicType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 42);
        if (redirector != null) {
            redirector.redirect((short) 42, (Object) this, (Object) num);
        } else {
            this.picType = num;
        }
    }

    public void setPicWidth(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 34);
        if (redirector != null) {
            redirector.redirect((short) 34, (Object) this, i2);
        } else {
            this.picWidth = i2;
        }
    }

    public void setProgress(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 41);
        if (redirector != null) {
            redirector.redirect((short) 41, (Object) this, (Object) num);
        } else {
            this.progress = num;
        }
    }

    public void setSourcePath(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 38);
        if (redirector != null) {
            redirector.redirect((short) 38, (Object) this, (Object) str);
        } else {
            this.sourcePath = str;
        }
    }

    public void setSummary(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 49);
        if (redirector != null) {
            redirector.redirect((short) 49, (Object) this, (Object) str);
        } else {
            this.summary = str;
        }
    }

    public void setThumbFileSize(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 46);
        if (redirector != null) {
            redirector.redirect((short) 46, (Object) this, i2);
        } else {
            this.thumbFileSize = i2;
        }
    }

    public void setThumbPath(HashMap<Integer, String> hashMap) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 39);
        if (redirector != null) {
            redirector.redirect((short) 39, (Object) this, (Object) hashMap);
        } else {
            this.thumbPath = hashMap;
        }
    }

    public void setTransferStatus(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 40);
        if (redirector != null) {
            redirector.redirect((short) 40, (Object) this, (Object) num);
        } else {
            this.transferStatus = num;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 59);
        if (redirector != null) {
            return (String) redirector.redirect((short) 59, (Object) this);
        }
        return "PicElement{picSubType=" + this.picSubType + ",fileName=" + this.fileName + ",fileSize=" + this.fileSize + ",picWidth=" + this.picWidth + ",picHeight=" + this.picHeight + ",original=" + this.original + ",md5HexStr=" + this.md5HexStr + ",sourcePath=" + this.sourcePath + ",thumbPath=" + this.thumbPath + ",transferStatus=" + this.transferStatus + ",progress=" + this.progress + ",picType=" + this.picType + ",invalidState=" + this.invalidState + ",fileUuid=" + this.fileUuid + ",fileSubId=" + this.fileSubId + ",thumbFileSize=" + this.thumbFileSize + ",fileBizId=" + this.fileBizId + ",downloadIndex=" + this.downloadIndex + ",summary=" + this.summary + ",emojiFrom=" + this.emojiFrom + ",emojiWebUrl=" + this.emojiWebUrl + ",emojiAd=" + this.emojiAd + ",emojiMall=" + this.emojiMall + ",emojiZplan=" + this.emojiZplan + ",originImageMd5=" + this.originImageMd5 + ",originImageUrl=" + this.originImageUrl + ",importRichMediaContext=" + this.importRichMediaContext + ",isFlashPic=" + this.isFlashPic + ",}";
    }

    public PicElement(int i2, String str, long j2, int i3, int i4, boolean z, String str2, String str3, HashMap<Integer, String> hashMap, Integer num, Integer num2, Integer num3, Integer num4, String str4, String str5, int i5, Integer num5, String str6, String str7, Integer num6, String str8, EmojiAD emojiAD, EmojiMall emojiMall, EmojiZPlan emojiZPlan, String str9, String str10, byte[] bArr, Boolean bool) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93818, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, Integer.valueOf(i2), str, Long.valueOf(j2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z), str2, str3, hashMap, num, num2, num3, num4, str4, str5, Integer.valueOf(i5), num5, str6, str7, num6, str8, emojiAD, emojiMall, emojiZPlan, str9, str10, bArr, bool);
            return;
        }
        this.fileName = "";
        this.md5HexStr = "";
        this.fileUuid = "";
        this.fileSubId = "";
        this.originImageMd5 = "";
        this.picSubType = i2;
        this.fileName = str;
        this.fileSize = j2;
        this.picWidth = i3;
        this.picHeight = i4;
        this.original = z;
        this.md5HexStr = str2;
        this.sourcePath = str3;
        this.thumbPath = hashMap;
        this.transferStatus = num;
        this.progress = num2;
        this.picType = num3;
        this.invalidState = num4;
        this.fileUuid = str4;
        this.fileSubId = str5;
        this.thumbFileSize = i5;
        this.fileBizId = num5;
        this.downloadIndex = str6;
        this.summary = str7;
        this.emojiFrom = num6;
        this.emojiWebUrl = str8;
        this.emojiAd = emojiAD;
        this.emojiMall = emojiMall;
        this.emojiZplan = emojiZPlan;
        this.originImageMd5 = str9;
        this.originImageUrl = str10;
        this.importRichMediaContext = bArr;
        this.isFlashPic = bool;
    }
}
