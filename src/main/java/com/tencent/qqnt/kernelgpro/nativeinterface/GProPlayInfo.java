package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPlayInfo.class */
public final class GProPlayInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProPlayNodeExtInfo playNodeExInfo;
    public GProPlayNodeInfo playNodeInfo;
    long serialVersionUID;
    public GProSongInfo songInfo;

    public GProPlayInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.playNodeInfo = new GProPlayNodeInfo();
        this.playNodeExInfo = new GProPlayNodeExtInfo();
        this.songInfo = new GProSongInfo();
    }

    public GProPlayNodeExtInfo getPlayNodeExInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.playNodeExInfo : (GProPlayNodeExtInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProPlayNodeInfo getPlayNodeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.playNodeInfo : (GProPlayNodeInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public GProSongInfo getSongInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.songInfo : (GProSongInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProPlayInfo{playNodeInfo=" + this.playNodeInfo + ",playNodeExInfo=" + this.playNodeExInfo + ",songInfo=" + this.songInfo + ",}";
    }

    public GProPlayInfo(GProPlayNodeInfo gProPlayNodeInfo, GProPlayNodeExtInfo gProPlayNodeExtInfo, GProSongInfo gProSongInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProPlayNodeInfo, gProPlayNodeExtInfo, gProSongInfo);
            return;
        }
        this.serialVersionUID = 1L;
        this.playNodeInfo = new GProPlayNodeInfo();
        this.playNodeExInfo = new GProPlayNodeExtInfo();
        this.songInfo = new GProSongInfo();
        this.playNodeInfo = gProPlayNodeInfo;
        this.playNodeExInfo = gProPlayNodeExtInfo;
        this.songInfo = gProSongInfo;
    }
}
