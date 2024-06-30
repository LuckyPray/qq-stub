package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPURLContent.class */
public final class GProMVPURLContent implements Serializable {
    static IPatchRedirector $redirector_;
    public String displayText;
    long serialVersionUID;
    public GProMVPTencentDocsContent tencentDocsContent;
    public GProMVPThirdPlatform thirdPlatform;
    public GProMVPThirdVideoInfo thirdVideoInfo;
    public int type;
    public String url;
    public GProMVPWeixinOfficialAccountsContent weixinOffcialAccountsContent;

    public GProMVPURLContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.url = "";
        this.displayText = "";
        this.thirdPlatform = new GProMVPThirdPlatform();
        this.thirdVideoInfo = new GProMVPThirdVideoInfo();
        this.weixinOffcialAccountsContent = new GProMVPWeixinOfficialAccountsContent();
        this.tencentDocsContent = new GProMVPTencentDocsContent();
    }

    public String getDisplayText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.displayText : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public GProMVPTencentDocsContent getTencentDocsContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.tencentDocsContent : (GProMVPTencentDocsContent) iPatchRedirector.redirect((short) 9, this);
    }

    public GProMVPThirdPlatform getThirdPlatform() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.thirdPlatform : (GProMVPThirdPlatform) iPatchRedirector.redirect((short) 6, this);
    }

    public GProMVPThirdVideoInfo getThirdVideoInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.thirdVideoInfo : (GProMVPThirdVideoInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.url : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProMVPWeixinOfficialAccountsContent getWeixinOffcialAccountsContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.weixinOffcialAccountsContent : (GProMVPWeixinOfficialAccountsContent) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProMVPURLContent{url=" + this.url + ",displayText=" + this.displayText + ",type=" + this.type + ",thirdPlatform=" + this.thirdPlatform + ",thirdVideoInfo=" + this.thirdVideoInfo + ",weixinOffcialAccountsContent=" + this.weixinOffcialAccountsContent + ",tencentDocsContent=" + this.tencentDocsContent + ",}";
    }

    public GProMVPURLContent(String str, String str2, int i, GProMVPThirdPlatform gProMVPThirdPlatform, GProMVPThirdVideoInfo gProMVPThirdVideoInfo, GProMVPWeixinOfficialAccountsContent gProMVPWeixinOfficialAccountsContent, GProMVPTencentDocsContent gProMVPTencentDocsContent) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, Integer.valueOf(i), gProMVPThirdPlatform, gProMVPThirdVideoInfo, gProMVPWeixinOfficialAccountsContent, gProMVPTencentDocsContent});
            return;
        }
        this.serialVersionUID = 1L;
        this.url = "";
        this.displayText = "";
        this.thirdPlatform = new GProMVPThirdPlatform();
        this.thirdVideoInfo = new GProMVPThirdVideoInfo();
        this.weixinOffcialAccountsContent = new GProMVPWeixinOfficialAccountsContent();
        this.tencentDocsContent = new GProMVPTencentDocsContent();
        this.url = str;
        this.displayText = str2;
        this.type = i;
        this.thirdPlatform = gProMVPThirdPlatform;
        this.thirdVideoInfo = gProMVPThirdVideoInfo;
        this.weixinOffcialAccountsContent = gProMVPWeixinOfficialAccountsContent;
        this.tencentDocsContent = gProMVPTencentDocsContent;
    }
}
