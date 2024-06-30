package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRichTextURLContent.class */
public final class GProStRichTextURLContent {
    static IPatchRedirector $redirector_;
    public String displayText;
    public String playUrl;
    public GProStRichTextTencentDocsContent tencentDocsContent;
    public GProThirdPlatform thirdPlatform;
    public GProCommThirdVideoInfo thirdVideoInfo;
    public int type;
    public String url;
    public GProStRichTextWeixinOfficialAccountsContent weixinOffcialAccountsContent;

    public GProStRichTextURLContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.url = "";
        this.displayText = "";
        this.playUrl = "";
        this.thirdPlatform = new GProThirdPlatform();
        this.thirdVideoInfo = new GProCommThirdVideoInfo();
        this.weixinOffcialAccountsContent = new GProStRichTextWeixinOfficialAccountsContent();
        this.tencentDocsContent = new GProStRichTextTencentDocsContent();
    }

    public String getDisplayText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.displayText : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getPlayUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.playUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public GProStRichTextTencentDocsContent getTencentDocsContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.tencentDocsContent : (GProStRichTextTencentDocsContent) iPatchRedirector.redirect((short) 9, this);
    }

    public GProThirdPlatform getThirdPlatform() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.thirdPlatform : (GProThirdPlatform) iPatchRedirector.redirect((short) 6, this);
    }

    public GProCommThirdVideoInfo getThirdVideoInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.thirdVideoInfo : (GProCommThirdVideoInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.url : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStRichTextWeixinOfficialAccountsContent getWeixinOffcialAccountsContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.weixinOffcialAccountsContent : (GProStRichTextWeixinOfficialAccountsContent) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProStRichTextURLContent{url=" + this.url + ",displayText=" + this.displayText + ",type=" + this.type + ",playUrl=" + this.playUrl + ",thirdPlatform=" + this.thirdPlatform + ",thirdVideoInfo=" + this.thirdVideoInfo + ",weixinOffcialAccountsContent=" + this.weixinOffcialAccountsContent + ",tencentDocsContent=" + this.tencentDocsContent + ",}";
    }
}
