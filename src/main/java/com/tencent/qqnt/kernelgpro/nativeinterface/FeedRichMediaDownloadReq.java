package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/FeedRichMediaDownloadReq.class */
public final class FeedRichMediaDownloadReq {
    static IPatchRedirector $redirector_;
    public String feedId;
    public Integer feedsType;
    public String fileId;
    public FeedFileType fileType;
    public Integer levelType;
    public String savePath;
    public String subId;
    public String url;

    public FeedRichMediaDownloadReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileType = FeedFileType.values()[0];
        this.savePath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feedId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public Integer getFeedsType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.feedsType : (Integer) iPatchRedirector.redirect((short) 9, this);
    }

    public String getFileId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.fileId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public FeedFileType getFileType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.fileType : (FeedFileType) iPatchRedirector.redirect((short) 6, this);
    }

    public Integer getLevelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.levelType : (Integer) iPatchRedirector.redirect((short) 7, this);
    }

    public String getSavePath() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.savePath : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getSubId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.subId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.url : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "FeedRichMediaDownloadReq{feedId=" + this.feedId + ",subId=" + this.subId + ",fileId=" + this.fileId + ",fileType=" + this.fileType + ",levelType=" + this.levelType + ",savePath=" + this.savePath + ",feedsType=" + this.feedsType + ",url=" + this.url + ",}";
    }

    public FeedRichMediaDownloadReq(String str, String str2, String str3, FeedFileType feedFileType, Integer num, String str4, Integer num2, String str5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, feedFileType, num, str4, num2, str5});
            return;
        }
        this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileType = FeedFileType.values()[0];
        this.savePath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedId = str;
        this.subId = str2;
        this.fileId = str3;
        this.fileType = feedFileType;
        this.levelType = num;
        this.savePath = str4;
        this.feedsType = num2;
        this.url = str5;
    }
}
