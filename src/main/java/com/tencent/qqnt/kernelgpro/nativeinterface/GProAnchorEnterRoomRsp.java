package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorEnterRoomRsp.class */
public final class GProAnchorEnterRoomRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProAnchorTlv> exts;
    public GProAnchorMediaInfo media;
    public GProAnchorRoomInfo room;
    public GProAnchorTrtcInfo trtc;
    public GProAnchorUserInfo user;

    public GProAnchorEnterRoomRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.exts = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProAnchorTlv> getExts() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.exts : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public GProAnchorMediaInfo getMedia() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.media : (GProAnchorMediaInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProAnchorRoomInfo getRoom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.room : (GProAnchorRoomInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public GProAnchorTrtcInfo getTrtc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.trtc : (GProAnchorTrtcInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProAnchorUserInfo getUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.user : (GProAnchorUserInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProAnchorEnterRoomRsp{room=" + this.room + ",user=" + this.user + ",media=" + this.media + ",trtc=" + this.trtc + ",exts=" + this.exts + ",}";
    }
}
