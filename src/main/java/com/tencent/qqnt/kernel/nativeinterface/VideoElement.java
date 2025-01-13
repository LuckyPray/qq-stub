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

/* compiled from: P */
/* loaded from: classes.dex */
public final class VideoElement implements IKernelModel {
    int busiType;
    Integer fileBizId;
    int fileFormat;
    String fileName;
    String filePath;
    long fileSize;
    String fileSubId;
    int fileTime;
    String fileUuid;
    byte[] importRichMediaContext;
    Integer invalidState;
    String originVideoMd5;
    Integer progress;
    int subBusiType;
    int thumbHeight;
    String thumbMd5;
    HashMap<Integer, String> thumbPath;
    int thumbSize;
    int thumbWidth;
    Integer transferStatus;
    String videoMd5;

    public VideoElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.filePath = "";
        this.fileName = "";
        this.videoMd5 = "";
        this.thumbMd5 = "";
        this.fileUuid = "";
        this.fileSubId = "";
        this.originVideoMd5 = "";
    }

    public int getBusiType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 13);
        return redirector != null ? ((Integer) redirector.redirect((short) 13, this)).intValue() : this.busiType;
    }

    public Integer getFileBizId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 21);
        return redirector != null ? (Integer) redirector.redirect((short) 21, this) : this.fileBizId;
    }

    public int getFileFormat() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 9);
        return redirector != null ? ((Integer) redirector.redirect((short) 9, this)).intValue() : this.fileFormat;
    }

    public String getFileName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, this) : this.fileName;
    }

    public String getFilePath() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, this) : this.filePath;
    }

    public long getFileSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 10);
        return redirector != null ? ((Long) redirector.redirect((short) 10, this)).longValue() : this.fileSize;
    }

    public String getFileSubId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 20);
        return redirector != null ? (String) redirector.redirect((short) 20, this) : this.fileSubId;
    }

    public int getFileTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 7);
        return redirector != null ? ((Integer) redirector.redirect((short) 7, this)).intValue() : this.fileTime;
    }

    public String getFileUuid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 19);
        return redirector != null ? (String) redirector.redirect((short) 19, this) : this.fileUuid;
    }

    public byte[] getImportRichMediaContext() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 23);
        return redirector != null ? (byte[]) redirector.redirect((short) 23, this) : this.importRichMediaContext;
    }

    public Integer getInvalidState() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 18);
        return redirector != null ? (Integer) redirector.redirect((short) 18, this) : this.invalidState;
    }

    public String getOriginVideoMd5() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 22);
        return redirector != null ? (String) redirector.redirect((short) 22, this) : this.originVideoMd5;
    }

    public Integer getProgress() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 17);
        return redirector != null ? (Integer) redirector.redirect((short) 17, this) : this.progress;
    }

    public int getSubBusiType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 14);
        return redirector != null ? ((Integer) redirector.redirect((short) 14, this)).intValue() : this.subBusiType;
    }

    public int getThumbHeight() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 12);
        return redirector != null ? ((Integer) redirector.redirect((short) 12, this)).intValue() : this.thumbHeight;
    }

    public String getThumbMd5() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 6);
        return redirector != null ? (String) redirector.redirect((short) 6, this) : this.thumbMd5;
    }

    public HashMap<Integer, String> getThumbPath() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 15);
        return redirector != null ? (HashMap) redirector.redirect((short) 15, this) : this.thumbPath;
    }

    public int getThumbSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 8);
        return redirector != null ? ((Integer) redirector.redirect((short) 8, this)).intValue() : this.thumbSize;
    }

    public int getThumbWidth() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 11);
        return redirector != null ? ((Integer) redirector.redirect((short) 11, this)).intValue() : this.thumbWidth;
    }

    public Integer getTransferStatus() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 16);
        return redirector != null ? (Integer) redirector.redirect((short) 16, this) : this.transferStatus;
    }

    public String getVideoMd5() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.videoMd5;
    }

    public void setBusiType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 34);
        if (redirector != null) {
            redirector.redirect((short) 34, this, i2);
        } else {
            this.busiType = i2;
        }
    }

    public void setFileBizId(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 42);
        if (redirector != null) {
            redirector.redirect((short) 42, this, num);
        } else {
            this.fileBizId = num;
        }
    }

    public void setFileFormat(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 30);
        if (redirector != null) {
            redirector.redirect((short) 30, this, i2);
        } else {
            this.fileFormat = i2;
        }
    }

    public void setFileName(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 25);
        if (redirector != null) {
            redirector.redirect((short) 25, this, str);
        } else {
            this.fileName = str;
        }
    }

    public void setFilePath(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 24);
        if (redirector != null) {
            redirector.redirect((short) 24, this, str);
        } else {
            this.filePath = str;
        }
    }

    public void setFileSize(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 31);
        if (redirector != null) {
            redirector.redirect((short) 31, this, j2);
        } else {
            this.fileSize = j2;
        }
    }

    public void setFileSubId(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 41);
        if (redirector != null) {
            redirector.redirect((short) 41, this, str);
        } else {
            this.fileSubId = str;
        }
    }

    public void setFileTime(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 28);
        if (redirector != null) {
            redirector.redirect((short) 28, this, i2);
        } else {
            this.fileTime = i2;
        }
    }

    public void setFileUuid(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 40);
        if (redirector != null) {
            redirector.redirect((short) 40, this, str);
        } else {
            this.fileUuid = str;
        }
    }

    public void setImportRichMediaContext(byte[] bArr) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 44);
        if (redirector != null) {
            redirector.redirect((short) 44, this, bArr);
        } else {
            this.importRichMediaContext = bArr;
        }
    }

    public void setInvalidState(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 39);
        if (redirector != null) {
            redirector.redirect((short) 39, this, num);
        } else {
            this.invalidState = num;
        }
    }

    public void setOriginVideoMd5(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 43);
        if (redirector != null) {
            redirector.redirect((short) 43, this, str);
        } else {
            this.originVideoMd5 = str;
        }
    }

    public void setProgress(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 38);
        if (redirector != null) {
            redirector.redirect((short) 38, this, num);
        } else {
            this.progress = num;
        }
    }

    public void setSubBusiType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 35);
        if (redirector != null) {
            redirector.redirect((short) 35, this, i2);
        } else {
            this.subBusiType = i2;
        }
    }

    public void setThumbHeight(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 33);
        if (redirector != null) {
            redirector.redirect((short) 33, this, i2);
        } else {
            this.thumbHeight = i2;
        }
    }

    public void setThumbMd5(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 27);
        if (redirector != null) {
            redirector.redirect((short) 27, this, str);
        } else {
            this.thumbMd5 = str;
        }
    }

    public void setThumbPath(HashMap<Integer, String> hashMap) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 36);
        if (redirector != null) {
            redirector.redirect((short) 36, this, hashMap);
        } else {
            this.thumbPath = hashMap;
        }
    }

    public void setThumbSize(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 29);
        if (redirector != null) {
            redirector.redirect((short) 29, this, i2);
        } else {
            this.thumbSize = i2;
        }
    }

    public void setThumbWidth(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 32);
        if (redirector != null) {
            redirector.redirect((short) 32, this, i2);
        } else {
            this.thumbWidth = i2;
        }
    }

    public void setTransferStatus(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 37);
        if (redirector != null) {
            redirector.redirect((short) 37, this, num);
        } else {
            this.transferStatus = num;
        }
    }

    public void setVideoMd5(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 26);
        if (redirector != null) {
            redirector.redirect((short) 26, this, str);
        } else {
            this.videoMd5 = str;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 45);
        if (redirector != null) {
            return (String) redirector.redirect((short) 45, this);
        }
        return "VideoElement{filePath=" + this.filePath + ",fileName=" + this.fileName + ",videoMd5=" + this.videoMd5 + ",thumbMd5=" + this.thumbMd5 + ",fileTime=" + this.fileTime + ",thumbSize=" + this.thumbSize + ",fileFormat=" + this.fileFormat + ",fileSize=" + this.fileSize + ",thumbWidth=" + this.thumbWidth + ",thumbHeight=" + this.thumbHeight + ",busiType=" + this.busiType + ",subBusiType=" + this.subBusiType + ",thumbPath=" + this.thumbPath + ",transferStatus=" + this.transferStatus + ",progress=" + this.progress + ",invalidState=" + this.invalidState + ",fileUuid=" + this.fileUuid + ",fileSubId=" + this.fileSubId + ",fileBizId=" + this.fileBizId + ",originVideoMd5=" + this.originVideoMd5 + ",importRichMediaContext=" + this.importRichMediaContext + ",}";
    }

    public VideoElement(String str, String str2, String str3, String str4, int i2, int i3, int i4, long j2, int i5, int i6, int i7, int i8, HashMap<Integer, String> hashMap, Integer num, Integer num2, Integer num3, String str5, String str6, Integer num4, String str7, byte[] bArr) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(95099, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, str2, str3, str4, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(j2), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), hashMap, num, num2, num3, str5, str6, num4, str7, bArr);
            return;
        }
        this.filePath = "";
        this.fileName = "";
        this.videoMd5 = "";
        this.thumbMd5 = "";
        this.fileUuid = "";
        this.fileSubId = "";
        this.originVideoMd5 = "";
        this.filePath = str;
        this.fileName = str2;
        this.videoMd5 = str3;
        this.thumbMd5 = str4;
        this.fileTime = i2;
        this.thumbSize = i3;
        this.fileFormat = i4;
        this.fileSize = j2;
        this.thumbWidth = i5;
        this.thumbHeight = i6;
        this.busiType = i7;
        this.subBusiType = i8;
        this.thumbPath = hashMap;
        this.transferStatus = num;
        this.progress = num2;
        this.invalidState = num3;
        this.fileUuid = str5;
        this.fileSubId = str6;
        this.fileBizId = num4;
        this.originVideoMd5 = str7;
        this.importRichMediaContext = bArr;
    }
}
