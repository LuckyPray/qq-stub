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

/* loaded from: classes2.dex */
public final class PttElement implements IKernelModel {
    int autoConvertText;
    boolean canConvert2Text;
    int duration;
    Integer fileBizId;
    Integer fileId;
    String fileName;
    String filePath;
    long fileSize;
    String fileSubId;
    String fileUuid;
    int formatType;
    byte[] importRichMediaContext;
    Integer invalidState;
    String md5HexStr;
    Integer playState;
    Integer progress;
    String text;
    Integer transferStatus;
    Integer translateStatus;
    int voiceChangeType;
    int voiceType;
    ArrayList<Byte> waveAmplitudes;

    public PttElement() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, this);
            return;
        }
        this.fileName = "";
        this.filePath = "";
        this.md5HexStr = "";
        this.waveAmplitudes = new ArrayList<>();
        this.fileSubId = "";
    }

    public int getAutoConvertText() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 10);
        return redirector != null ? ((Integer) redirector.redirect((short) 10, this)).intValue() : this.autoConvertText;
    }

    public boolean getCanConvert2Text() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 12);
        return redirector != null ? ((Boolean) redirector.redirect((short) 12, this)).booleanValue() : this.canConvert2Text;
    }

    public int getDuration() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 7);
        return redirector != null ? ((Integer) redirector.redirect((short) 7, this)).intValue() : this.duration;
    }

    public Integer getFileBizId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 23);
        return redirector != null ? (Integer) redirector.redirect((short) 23, this) : this.fileBizId;
    }

    public Integer getFileId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 13);
        return redirector != null ? (Integer) redirector.redirect((short) 13, this) : this.fileId;
    }

    public String getFileName() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 3);
        return redirector != null ? (String) redirector.redirect((short) 3, this) : this.fileName;
    }

    public String getFilePath() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 4);
        return redirector != null ? (String) redirector.redirect((short) 4, this) : this.filePath;
    }

    public long getFileSize() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 6);
        return redirector != null ? ((Long) redirector.redirect((short) 6, this)).longValue() : this.fileSize;
    }

    public String getFileSubId() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 22);
        return redirector != null ? (String) redirector.redirect((short) 22, this) : this.fileSubId;
    }

    public String getFileUuid() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 14);
        return redirector != null ? (String) redirector.redirect((short) 14, this) : this.fileUuid;
    }

    public int getFormatType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 8);
        return redirector != null ? ((Integer) redirector.redirect((short) 8, this)).intValue() : this.formatType;
    }

    public byte[] getImportRichMediaContext() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 24);
        return redirector != null ? (byte[]) redirector.redirect((short) 24, this) : this.importRichMediaContext;
    }

    public Integer getInvalidState() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 21);
        return redirector != null ? (Integer) redirector.redirect((short) 21, this) : this.invalidState;
    }

    public String getMd5HexStr() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 5);
        return redirector != null ? (String) redirector.redirect((short) 5, this) : this.md5HexStr;
    }

    public Integer getPlayState() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 19);
        return redirector != null ? (Integer) redirector.redirect((short) 19, this) : this.playState;
    }

    public Integer getProgress() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 18);
        return redirector != null ? (Integer) redirector.redirect((short) 18, this) : this.progress;
    }

    public String getText() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 15);
        return redirector != null ? (String) redirector.redirect((short) 15, this) : this.text;
    }

    public Integer getTransferStatus() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 17);
        return redirector != null ? (Integer) redirector.redirect((short) 17, this) : this.transferStatus;
    }

    public Integer getTranslateStatus() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 16);
        return redirector != null ? (Integer) redirector.redirect((short) 16, this) : this.translateStatus;
    }

    public int getVoiceChangeType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 11);
        return redirector != null ? ((Integer) redirector.redirect((short) 11, this)).intValue() : this.voiceChangeType;
    }

    public int getVoiceType() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 9);
        return redirector != null ? ((Integer) redirector.redirect((short) 9, this)).intValue() : this.voiceType;
    }

    public ArrayList<Byte> getWaveAmplitudes() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 20);
        return redirector != null ? (ArrayList) redirector.redirect((short) 20, this) : this.waveAmplitudes;
    }

    public void setAutoConvertText(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 32);
        if (redirector != null) {
            redirector.redirect((short) 32, this, i2);
        } else {
            this.autoConvertText = i2;
        }
    }

    public void setCanConvert2Text(boolean z) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 34);
        if (redirector != null) {
            redirector.redirect((short) 34, this, z);
        } else {
            this.canConvert2Text = z;
        }
    }

    public void setDuration(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 29);
        if (redirector != null) {
            redirector.redirect((short) 29, this, i2);
        } else {
            this.duration = i2;
        }
    }

    public void setFileBizId(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 45);
        if (redirector != null) {
            redirector.redirect((short) 45, this, num);
        } else {
            this.fileBizId = num;
        }
    }

    public void setFileId(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 35);
        if (redirector != null) {
            redirector.redirect((short) 35, this, num);
        } else {
            this.fileId = num;
        }
    }

    public void setFileName(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 25);
        if (redirector != null) {
            redirector.redirect((short) 25, this, str);
        } else {
            this.fileName = str;
        }
    }

    public void setFilePath(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 26);
        if (redirector != null) {
            redirector.redirect((short) 26, this, str);
        } else {
            this.filePath = str;
        }
    }

    public void setFileSize(long j2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 28);
        if (redirector != null) {
            redirector.redirect((short) 28, this, j2);
        } else {
            this.fileSize = j2;
        }
    }

    public void setFileSubId(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 44);
        if (redirector != null) {
            redirector.redirect((short) 44, this, str);
        } else {
            this.fileSubId = str;
        }
    }

    public void setFileUuid(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 36);
        if (redirector != null) {
            redirector.redirect((short) 36, this, str);
        } else {
            this.fileUuid = str;
        }
    }

    public void setFormatType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 30);
        if (redirector != null) {
            redirector.redirect((short) 30, this, i2);
        } else {
            this.formatType = i2;
        }
    }

    public void setImportRichMediaContext(byte[] bArr) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 46);
        if (redirector != null) {
            redirector.redirect((short) 46, this, bArr);
        } else {
            this.importRichMediaContext = bArr;
        }
    }

    public void setInvalidState(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 43);
        if (redirector != null) {
            redirector.redirect((short) 43, this, num);
        } else {
            this.invalidState = num;
        }
    }

    public void setMd5HexStr(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 27);
        if (redirector != null) {
            redirector.redirect((short) 27, this, str);
        } else {
            this.md5HexStr = str;
        }
    }

    public void setPlayState(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 41);
        if (redirector != null) {
            redirector.redirect((short) 41, this, num);
        } else {
            this.playState = num;
        }
    }

    public void setProgress(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 40);
        if (redirector != null) {
            redirector.redirect((short) 40, this, num);
        } else {
            this.progress = num;
        }
    }

    public void setText(String str) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 37);
        if (redirector != null) {
            redirector.redirect((short) 37, this, str);
        } else {
            this.text = str;
        }
    }

    public void setTransferStatus(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 39);
        if (redirector != null) {
            redirector.redirect((short) 39, this, num);
        } else {
            this.transferStatus = num;
        }
    }

    public void setTranslateStatus(Integer num) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 38);
        if (redirector != null) {
            redirector.redirect((short) 38, this, num);
        } else {
            this.translateStatus = num;
        }
    }

    public void setVoiceChangeType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 33);
        if (redirector != null) {
            redirector.redirect((short) 33, this, i2);
        } else {
            this.voiceChangeType = i2;
        }
    }

    public void setVoiceType(int i2) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 31);
        if (redirector != null) {
            redirector.redirect((short) 31, this, i2);
        } else {
            this.voiceType = i2;
        }
    }

    public void setWaveAmplitudes(ArrayList<Byte> arrayList) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 42);
        if (redirector != null) {
            redirector.redirect((short) 42, this, arrayList);
        } else {
            this.waveAmplitudes = arrayList;
        }
    }

    public String toString() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 47);
        if (redirector != null) {
            return (String) redirector.redirect((short) 47, this);
        }
        return "PttElement{fileName=" + this.fileName + ",filePath=" + this.filePath + ",md5HexStr=" + this.md5HexStr + ",fileSize=" + this.fileSize + ",duration=" + this.duration + ",formatType=" + this.formatType + ",voiceType=" + this.voiceType + ",autoConvertText=" + this.autoConvertText + ",voiceChangeType=" + this.voiceChangeType + ",canConvert2Text=" + this.canConvert2Text + ",fileId=" + this.fileId + ",fileUuid=" + this.fileUuid + ",text=" + this.text + ",translateStatus=" + this.translateStatus + ",transferStatus=" + this.transferStatus + ",progress=" + this.progress + ",playState=" + this.playState + ",waveAmplitudes=" + this.waveAmplitudes + ",invalidState=" + this.invalidState + ",fileSubId=" + this.fileSubId + ",fileBizId=" + this.fileBizId + ",importRichMediaContext=" + this.importRichMediaContext + ",}";
    }

    public PttElement(String str, String str2, String str3, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, Integer num, String str4, String str5, Integer num2, Integer num3, Integer num4, Integer num5, ArrayList<Byte> arrayList, Integer num6, String str6, Integer num7, byte[] bArr) {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(93932, (short) 2);
        if (redirector != null) {
            redirector.redirect((short) 2, this, str, str2, str3, Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Boolean.valueOf(z), num, str4, str5, num2, num3, num4, num5, arrayList, num6, str6, num7, bArr);
            return;
        }
        this.fileName = "";
        this.filePath = "";
        this.md5HexStr = "";
        this.waveAmplitudes = new ArrayList<>();
        this.fileSubId = "";
        this.fileName = str;
        this.filePath = str2;
        this.md5HexStr = str3;
        this.fileSize = j2;
        this.duration = i2;
        this.formatType = i3;
        this.voiceType = i4;
        this.autoConvertText = i5;
        this.voiceChangeType = i6;
        this.canConvert2Text = z;
        this.fileId = num;
        this.fileUuid = str4;
        this.text = str5;
        this.translateStatus = num2;
        this.transferStatus = num3;
        this.progress = num4;
        this.playState = num5;
        this.waveAmplitudes = arrayList;
        this.invalidState = num6;
        this.fileSubId = str6;
        this.fileBizId = num7;
        this.importRichMediaContext = bArr;
    }
}
