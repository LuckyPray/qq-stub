package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveAnchorPlayStream.class */
public final class GProLiveAnchorPlayStream {
    static IPatchRedirector $redirector_;
    public Integer bitrate;
    public Integer codecType;
    public Integer definition;
    public String definitionName;
    public Integer type;
    public String url;

    public GProLiveAnchorPlayStream() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public Integer getBitrate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.bitrate : (Integer) iPatchRedirector.redirect((short) 4, this);
    }

    public Integer getCodecType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.codecType : (Integer) iPatchRedirector.redirect((short) 6, this);
    }

    public Integer getDefinition() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.definition : (Integer) iPatchRedirector.redirect((short) 5, this);
    }

    public String getDefinitionName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.definitionName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public Integer getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.type : (Integer) iPatchRedirector.redirect((short) 2, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.url : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProLiveAnchorPlayStream{type=" + this.type + ",url=" + this.url + ",bitrate=" + this.bitrate + ",definition=" + this.definition + ",codecType=" + this.codecType + ",definitionName=" + this.definitionName + ",}";
    }
}
