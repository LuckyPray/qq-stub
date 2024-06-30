package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/FeedDownloadInfo.class */
public final class FeedDownloadInfo {
    static IPatchRedirector $redirector_;
    public FeedFileType downloadType;
    public int errorCode;
    public String errorMsg;
    public String feedId;
    public String fileId;
    public String fileName;
    public int levelType;
    public long progress;
    public String savePath;
    public String subId;
    public String url;

    public FeedDownloadInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.errorMsg = "";
        this.feedId = "";
        this.subId = "";
        this.fileId = "";
        this.downloadType = FeedFileType.values()[0];
        this.fileName = "";
        this.url = "";
        this.savePath = "";
    }

    public FeedFileType getDownloadType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.downloadType : (FeedFileType) iPatchRedirector.redirect((short) 9, this);
    }

    public int getErrorCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.errorCode : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getErrorMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.errorMsg : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feedId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getFileId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.fileId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getFileName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.fileName : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getLevelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.levelType : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public long getProgress() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.progress : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getSavePath() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.savePath : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public String getSubId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.subId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.url : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "FeedDownloadInfo{errorCode=" + this.errorCode + ",errorMsg=" + this.errorMsg + ",progress=" + this.progress + ",feedId=" + this.feedId + ",subId=" + this.subId + ",fileId=" + this.fileId + ",downloadType=" + this.downloadType + ",fileName=" + this.fileName + ",levelType=" + this.levelType + ",url=" + this.url + ",savePath=" + this.savePath + ",}";
    }

    public FeedDownloadInfo(int i, String str, long j, String str2, String str3, String str4, FeedFileType feedFileType, String str5, int i2, String str6, String str7) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, Long.valueOf(j), str2, str3, str4, feedFileType, str5, Integer.valueOf(i2), str6, str7});
            return;
        }
        this.errorMsg = "";
        this.feedId = "";
        this.subId = "";
        this.fileId = "";
        this.downloadType = FeedFileType.values()[0];
        this.fileName = "";
        this.url = "";
        this.savePath = "";
        this.errorCode = i;
        this.errorMsg = str;
        this.progress = j;
        this.feedId = str2;
        this.subId = str3;
        this.fileId = str4;
        this.downloadType = feedFileType;
        this.fileName = str5;
        this.levelType = i2;
        this.url = str6;
        this.savePath = str7;
    }
}
