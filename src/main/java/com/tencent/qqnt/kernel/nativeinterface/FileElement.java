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
/* loaded from: classes2.dex */
public final class FileElement implements IKernelModel {
    Long expireTime;
    String file10MMd5;
    Integer fileBizId;
    Integer fileGroupIndex;
    String fileMd5;
    String fileName;
    String filePath;
    String fileSha;
    String fileSha3;
    long fileSize;
    String fileSubId;
    Integer fileTransType;
    String fileUuid;
    String folderId;
    Integer invalidState;
    Integer picHeight;
    HashMap<Integer, String> picThumbPath;
    Integer picWidth;
    Integer progress;
    Integer subElementType;
    int thumbFileSize;
    String thumbMd5;
    Integer transferStatus;
    Integer videoDuration;

    public FileElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.fileMd5 = "";
        this.fileName = "";
        this.filePath = "";
        this.file10MMd5 = "";
        this.fileSha = "";
        this.fileSha3 = "";
        this.fileUuid = "";
        this.fileSubId = "";
    }

    public Long getExpireTime() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 10);
        return redirector != null ? (Long) redirector.redirect((short) 10, this) : this.expireTime;
    }

    public String getFile10MMd5() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 11);
        return redirector != null ? (String) redirector.redirect((short) 11, this) : this.file10MMd5;
    }

    public Integer getFileBizId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 21);
        return redirector != null ? (Integer) redirector.redirect((short) 21, this) : this.fileBizId;
    }

    public Integer getFileGroupIndex() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 24);
        return redirector != null ? (Integer) redirector.redirect((short) 24, this) : this.fileGroupIndex;
    }

    public String getFileMd5() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, this) : this.fileMd5;
    }

    public String getFileName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, this) : this.fileName;
    }

    public String getFilePath() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.filePath;
    }

    public String getFileSha() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 12);
        return redirector != null ? (String) redirector.redirect((short) 12, this) : this.fileSha;
    }

    public String getFileSha3() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 13);
        return redirector != null ? (String) redirector.redirect((short) 13, this) : this.fileSha3;
    }

    public long getFileSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 6);
        return redirector != null ? ((Long) redirector.redirect((short) 6, this)).longValue() : this.fileSize;
    }

    public String getFileSubId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 19);
        return redirector != null ? (String) redirector.redirect((short) 19, this) : this.fileSubId;
    }

    public Integer getFileTransType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 25);
        return redirector != null ? (Integer) redirector.redirect((short) 25, this) : this.fileTransType;
    }

    public String getFileUuid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 18);
        return redirector != null ? (String) redirector.redirect((short) 18, this) : this.fileUuid;
    }

    public String getFolderId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 23);
        return redirector != null ? (String) redirector.redirect((short) 23, this) : this.folderId;
    }

    public Integer getInvalidState() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 17);
        return redirector != null ? (Integer) redirector.redirect((short) 17, this) : this.invalidState;
    }

    public Integer getPicHeight() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 7);
        return redirector != null ? (Integer) redirector.redirect((short) 7, this) : this.picHeight;
    }

    public HashMap<Integer, String> getPicThumbPath() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 9);
        return redirector != null ? (HashMap) redirector.redirect((short) 9, this) : this.picThumbPath;
    }

    public Integer getPicWidth() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 8);
        return redirector != null ? (Integer) redirector.redirect((short) 8, this) : this.picWidth;
    }

    public Integer getProgress() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 16);
        return redirector != null ? (Integer) redirector.redirect((short) 16, this) : this.progress;
    }

    public Integer getSubElementType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 26);
        return redirector != null ? (Integer) redirector.redirect((short) 26, this) : this.subElementType;
    }

    public int getThumbFileSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 20);
        return redirector != null ? ((Integer) redirector.redirect((short) 20, this)).intValue() : this.thumbFileSize;
    }

    public String getThumbMd5() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 22);
        return redirector != null ? (String) redirector.redirect((short) 22, this) : this.thumbMd5;
    }

    public Integer getTransferStatus() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 15);
        return redirector != null ? (Integer) redirector.redirect((short) 15, this) : this.transferStatus;
    }

    public Integer getVideoDuration() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 14);
        return redirector != null ? (Integer) redirector.redirect((short) 14, this) : this.videoDuration;
    }

    public void setExpireTime(Long l2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 34);
        if (redirector != null) {
            redirector.redirect((short) 34, this, l2);
        } else {
            this.expireTime = l2;
        }
    }

    public void setFile10MMd5(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 35);
        if (redirector != null) {
            redirector.redirect((short) 35, this, str);
        } else {
            this.file10MMd5 = str;
        }
    }

    public void setFileBizId(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 45);
        if (redirector != null) {
            redirector.redirect((short) 45, this, num);
        } else {
            this.fileBizId = num;
        }
    }

    public void setFileGroupIndex(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 48);
        if (redirector != null) {
            redirector.redirect((short) 48, this, num);
        } else {
            this.fileGroupIndex = num;
        }
    }

    public void setFileMd5(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 27);
        if (redirector != null) {
            redirector.redirect((short) 27, this, str);
        } else {
            this.fileMd5 = str;
        }
    }

    public void setFileName(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 28);
        if (redirector != null) {
            redirector.redirect((short) 28, this, str);
        } else {
            this.fileName = str;
        }
    }

    public void setFilePath(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 29);
        if (redirector != null) {
            redirector.redirect((short) 29, this, str);
        } else {
            this.filePath = str;
        }
    }

    public void setFileSha(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 36);
        if (redirector != null) {
            redirector.redirect((short) 36, this, str);
        } else {
            this.fileSha = str;
        }
    }

    public void setFileSha3(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 37);
        if (redirector != null) {
            redirector.redirect((short) 37, this, str);
        } else {
            this.fileSha3 = str;
        }
    }

    public void setFileSize(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 30);
        if (redirector != null) {
            redirector.redirect((short) 30, this, j2);
        } else {
            this.fileSize = j2;
        }
    }

    public void setFileSubId(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 43);
        if (redirector != null) {
            redirector.redirect((short) 43, this, str);
        } else {
            this.fileSubId = str;
        }
    }

    public void setFileTransType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 49);
        if (redirector != null) {
            redirector.redirect((short) 49, this, num);
        } else {
            this.fileTransType = num;
        }
    }

    public void setFileUuid(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 42);
        if (redirector != null) {
            redirector.redirect((short) 42, this, str);
        } else {
            this.fileUuid = str;
        }
    }

    public void setFolderId(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 47);
        if (redirector != null) {
            redirector.redirect((short) 47, this, str);
        } else {
            this.folderId = str;
        }
    }

    public void setInvalidState(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 41);
        if (redirector != null) {
            redirector.redirect((short) 41, this, num);
        } else {
            this.invalidState = num;
        }
    }

    public void setPicHeight(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 31);
        if (redirector != null) {
            redirector.redirect((short) 31, this, num);
        } else {
            this.picHeight = num;
        }
    }

    public void setPicThumbPath(HashMap<Integer, String> hashMap) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 33);
        if (redirector != null) {
            redirector.redirect((short) 33, this, hashMap);
        } else {
            this.picThumbPath = hashMap;
        }
    }

    public void setPicWidth(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 32);
        if (redirector != null) {
            redirector.redirect((short) 32, this, num);
        } else {
            this.picWidth = num;
        }
    }

    public void setProgress(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 40);
        if (redirector != null) {
            redirector.redirect((short) 40, this, num);
        } else {
            this.progress = num;
        }
    }

    public void setSubElementType(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 50);
        if (redirector != null) {
            redirector.redirect((short) 50, this, num);
        } else {
            this.subElementType = num;
        }
    }

    public void setThumbFileSize(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 44);
        if (redirector != null) {
            redirector.redirect((short) 44, this, i2);
        } else {
            this.thumbFileSize = i2;
        }
    }

    public void setThumbMd5(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 46);
        if (redirector != null) {
            redirector.redirect((short) 46, this, str);
        } else {
            this.thumbMd5 = str;
        }
    }

    public void setTransferStatus(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 39);
        if (redirector != null) {
            redirector.redirect((short) 39, this, num);
        } else {
            this.transferStatus = num;
        }
    }

    public void setVideoDuration(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 38);
        if (redirector != null) {
            redirector.redirect((short) 38, this, num);
        } else {
            this.videoDuration = num;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 51);
        if (redirector != null) {
            return (String) redirector.redirect((short) 51, this);
        }
        return "FileElement{fileMd5=" + this.fileMd5 + ",fileName=" + this.fileName + ",filePath=" + this.filePath + ",fileSize=" + this.fileSize + ",picHeight=" + this.picHeight + ",picWidth=" + this.picWidth + ",picThumbPath=" + this.picThumbPath + ",expireTime=" + this.expireTime + ",file10MMd5=" + this.file10MMd5 + ",fileSha=" + this.fileSha + ",fileSha3=" + this.fileSha3 + ",videoDuration=" + this.videoDuration + ",transferStatus=" + this.transferStatus + ",progress=" + this.progress + ",invalidState=" + this.invalidState + ",fileUuid=" + this.fileUuid + ",fileSubId=" + this.fileSubId + ",thumbFileSize=" + this.thumbFileSize + ",fileBizId=" + this.fileBizId + ",thumbMd5=" + this.thumbMd5 + ",folderId=" + this.folderId + ",fileGroupIndex=" + this.fileGroupIndex + ",fileTransType=" + this.fileTransType + ",subElementType=" + this.subElementType + ",}";
    }

    public FileElement(String str, String str2, String str3, long j2, Integer num, Integer num2, HashMap<Integer, String> hashMap, Long l2, String str4, String str5, String str6, Integer num3, Integer num4, Integer num5, Integer num6, String str7, String str8, int i2, Integer num7, String str9, String str10, Integer num8, Integer num9, Integer num10) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(83552, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, str2, str3, Long.valueOf(j2), num, num2, hashMap, l2, str4, str5, str6, num3, num4, num5, num6, str7, str8, Integer.valueOf(i2), num7, str9, str10, num8, num9, num10);
            return;
        }
        this.fileMd5 = "";
        this.fileName = "";
        this.filePath = "";
        this.file10MMd5 = "";
        this.fileSha = "";
        this.fileSha3 = "";
        this.fileUuid = "";
        this.fileSubId = "";
        this.fileMd5 = str;
        this.fileName = str2;
        this.filePath = str3;
        this.fileSize = j2;
        this.picHeight = num;
        this.picWidth = num2;
        this.picThumbPath = hashMap;
        this.expireTime = l2;
        this.file10MMd5 = str4;
        this.fileSha = str5;
        this.fileSha3 = str6;
        this.videoDuration = num3;
        this.transferStatus = num4;
        this.progress = num5;
        this.invalidState = num6;
        this.fileUuid = str7;
        this.fileSubId = str8;
        this.thumbFileSize = i2;
        this.fileBizId = num7;
        this.thumbMd5 = str9;
        this.folderId = str10;
        this.fileGroupIndex = num8;
        this.fileTransType = num9;
        this.subElementType = num10;
    }
}
