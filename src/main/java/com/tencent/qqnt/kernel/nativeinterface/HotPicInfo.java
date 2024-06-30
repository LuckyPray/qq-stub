package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/HotPicInfo.class */
public final class HotPicInfo {
    public String downloadUrl;
    public int fileHeight;
    public String fileMd5;
    public long fileSize;
    public int fileType;
    public int fileWidth;
    public boolean isExist;
    public String path;
    public String picId;
    public int picIndex;
    public int sourceType;
    public ThirdPartyInfo thirdPartyInfo;
    public String thumbDownloadUrl;
    public int thumbFileHeight;
    public long thumbFileSize;
    public int thumbFileWidth;
    public String thumbMd5;

    public HotPicInfo() {
        this.picId = "";
        this.fileMd5 = "";
        this.downloadUrl = "";
        this.thumbMd5 = "";
        this.thumbDownloadUrl = "";
        this.thirdPartyInfo = new ThirdPartyInfo();
        this.path = "";
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public int getFileHeight() {
        return this.fileHeight;
    }

    public String getFileMd5() {
        return this.fileMd5;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public int getFileType() {
        return this.fileType;
    }

    public int getFileWidth() {
        return this.fileWidth;
    }

    public boolean getIsExist() {
        return this.isExist;
    }

    public String getPath() {
        return this.path;
    }

    public String getPicId() {
        return this.picId;
    }

    public int getPicIndex() {
        return this.picIndex;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public ThirdPartyInfo getThirdPartyInfo() {
        return this.thirdPartyInfo;
    }

    public String getThumbDownloadUrl() {
        return this.thumbDownloadUrl;
    }

    public int getThumbFileHeight() {
        return this.thumbFileHeight;
    }

    public long getThumbFileSize() {
        return this.thumbFileSize;
    }

    public int getThumbFileWidth() {
        return this.thumbFileWidth;
    }

    public String getThumbMd5() {
        return this.thumbMd5;
    }

    public String toString() {
        return "HotPicInfo{picId=" + this.picId + ",fileMd5=" + this.fileMd5 + ",fileType=" + this.fileType + ",fileSize=" + this.fileSize + ",fileWidth=" + this.fileWidth + ",fileHeight=" + this.fileHeight + ",downloadUrl=" + this.downloadUrl + ",thumbMd5=" + this.thumbMd5 + ",thumbFileSize=" + this.thumbFileSize + ",thumbFileWidth=" + this.thumbFileWidth + ",thumbFileHeight=" + this.thumbFileHeight + ",thumbDownloadUrl=" + this.thumbDownloadUrl + ",picIndex=" + this.picIndex + ",sourceType=" + this.sourceType + ",thirdPartyInfo=" + this.thirdPartyInfo + ",path=" + this.path + ",isExist=" + this.isExist + ",}";
    }

    public HotPicInfo(String str, String str2, int i, long j, int i2, int i3, String str3, String str4, long j2, int i4, int i5, String str5, int i6, int i7, ThirdPartyInfo thirdPartyInfo, String str6, boolean z) {
        this.picId = "";
        this.fileMd5 = "";
        this.downloadUrl = "";
        this.thumbMd5 = "";
        this.thumbDownloadUrl = "";
        this.thirdPartyInfo = new ThirdPartyInfo();
        this.path = "";
        this.picId = str;
        this.fileMd5 = str2;
        this.fileType = i;
        this.fileSize = j;
        this.fileWidth = i2;
        this.fileHeight = i3;
        this.downloadUrl = str3;
        this.thumbMd5 = str4;
        this.thumbFileSize = j2;
        this.thumbFileWidth = i4;
        this.thumbFileHeight = i5;
        this.thumbDownloadUrl = str5;
        this.picIndex = i6;
        this.sourceType = i7;
        this.thirdPartyInfo = thirdPartyInfo;
        this.path = str6;
        this.isExist = z;
    }
}
