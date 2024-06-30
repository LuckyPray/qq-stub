package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicSearchEmojiInfo.class */
public final class EmojiHotPicSearchEmojiInfo {
    public int emojiType;
    public int imageHeight;
    public String imageMD5;
    public String imageOther;
    public long imageSize;
    public String imageUrl;
    public int imageWidth;
    public EmojiHotPicSearchTextMallEmojiInfo mallEmojiInfo;
    public String packageID;
    public String packageType;
    public String resourceID;
    public String srcIconUrl;
    public String srcName;
    public String srcWebUrl;
    public EmojiHotPicSearchTextComposeInfo textComposeInfo;
    public int thumbnailHeight;
    public String thumbnailMD5;
    public long thumbnailSize;
    public String thumbnailUrl;
    public int thumbnailWidth;

    public EmojiHotPicSearchEmojiInfo() {
        this.resourceID = "";
        this.imageMD5 = "";
        this.imageUrl = "";
        this.thumbnailMD5 = "";
        this.thumbnailUrl = "";
    }

    public int getEmojiType() {
        return this.emojiType;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public String getImageMD5() {
        return this.imageMD5;
    }

    public String getImageOther() {
        return this.imageOther;
    }

    public long getImageSize() {
        return this.imageSize;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public EmojiHotPicSearchTextMallEmojiInfo getMallEmojiInfo() {
        return this.mallEmojiInfo;
    }

    public String getPackageID() {
        return this.packageID;
    }

    public String getPackageType() {
        return this.packageType;
    }

    public String getResourceID() {
        return this.resourceID;
    }

    public String getSrcIconUrl() {
        return this.srcIconUrl;
    }

    public String getSrcName() {
        return this.srcName;
    }

    public String getSrcWebUrl() {
        return this.srcWebUrl;
    }

    public EmojiHotPicSearchTextComposeInfo getTextComposeInfo() {
        return this.textComposeInfo;
    }

    public int getThumbnailHeight() {
        return this.thumbnailHeight;
    }

    public String getThumbnailMD5() {
        return this.thumbnailMD5;
    }

    public long getThumbnailSize() {
        return this.thumbnailSize;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int getThumbnailWidth() {
        return this.thumbnailWidth;
    }

    public String toString() {
        return "EmojiHotPicSearchEmojiInfo{resourceID=" + this.resourceID + ",imageMD5=" + this.imageMD5 + ",imageWidth=" + this.imageWidth + ",imageHeight=" + this.imageHeight + ",imageUrl=" + this.imageUrl + ",imageSize=" + this.imageSize + ",thumbnailMD5=" + this.thumbnailMD5 + ",thumbnailWidth=" + this.thumbnailWidth + ",thumbnailHeight=" + this.thumbnailHeight + ",thumbnailUrl=" + this.thumbnailUrl + ",thumbnailSize=" + this.thumbnailSize + ",imageOther=" + this.imageOther + ",packageID=" + this.packageID + ",packageType=" + this.packageType + ",srcWebUrl=" + this.srcWebUrl + ",srcIconUrl=" + this.srcIconUrl + ",srcName=" + this.srcName + ",emojiType=" + this.emojiType + ",textComposeInfo=" + this.textComposeInfo + ",mallEmojiInfo=" + this.mallEmojiInfo + ",}";
    }

    public EmojiHotPicSearchEmojiInfo(String str, String str2, int i, int i2, String str3, long j, String str4, int i3, int i4, String str5, long j2, String str6, String str7, String str8, String str9, String str10, String str11, int i5, EmojiHotPicSearchTextComposeInfo emojiHotPicSearchTextComposeInfo) {
        this.resourceID = "";
        this.imageMD5 = "";
        this.imageUrl = "";
        this.thumbnailMD5 = "";
        this.thumbnailUrl = "";
        this.resourceID = str;
        this.imageMD5 = str2;
        this.imageWidth = i;
        this.imageHeight = i2;
        this.imageUrl = str3;
        this.imageSize = j;
        this.thumbnailMD5 = str4;
        this.thumbnailWidth = i3;
        this.thumbnailHeight = i4;
        this.thumbnailUrl = str5;
        this.thumbnailSize = j2;
        this.imageOther = str6;
        this.packageID = str7;
        this.packageType = str8;
        this.srcWebUrl = str9;
        this.srcIconUrl = str10;
        this.srcName = str11;
        this.emojiType = i5;
        this.textComposeInfo = emojiHotPicSearchTextComposeInfo;
    }
}
