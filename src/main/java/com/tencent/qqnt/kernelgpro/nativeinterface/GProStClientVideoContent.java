package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStClientVideoContent.class */
public final class GProStClientVideoContent {
    static IPatchRedirector $redirector_;
    public String coverUrl;
    public String taskId;
    public String videoId;
    public String videoUrl;

    public GProStClientVideoContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.taskId = "";
        this.videoId = "";
        this.videoUrl = "";
        this.coverUrl = "";
    }

    public String getCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.coverUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getTaskId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.taskId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getVideoId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.videoId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getVideoUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.videoUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStClientVideoContent{taskId=" + this.taskId + ",videoId=" + this.videoId + ",videoUrl=" + this.videoUrl + ",coverUrl=" + this.coverUrl + ",}";
    }
}
