package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStClientImageContent.class */
public final class GProStClientImageContent {
    static IPatchRedirector $redirector_;
    public boolean isGif;
    public boolean isOrig;
    public String md5;
    public int origSize;
    public String picId;
    public String taskId;
    public String url;

    public GProStClientImageContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.taskId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.picId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public boolean getIsGif() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.isGif : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public boolean getIsOrig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isOrig : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String getMd5() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.md5 : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public int getOrigSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.origSize : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getPicId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.picId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getTaskId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.taskId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.url : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProStClientImageContent{taskId=" + this.taskId + ",picId=" + this.picId + ",url=" + this.url + ",isOrig=" + this.isOrig + ",origSize=" + this.origSize + ",isGif=" + this.isGif + ",md5=" + this.md5 + ",}";
    }
}
