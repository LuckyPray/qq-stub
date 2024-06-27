package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorSetRoomInfoReq.class */
public final class GProAnchorSetRoomInfoReq {
    static IPatchRedirector $redirector_;
    public ArrayList<GProAnchorTlv> attrs;
    public String machine;
    public String programId;
    public Long roomId;
    public String source;
    public GProLiveRoomRichTitle tags;

    public GProAnchorSetRoomInfoReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.attrs = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProAnchorTlv> getAttrs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.attrs : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getMachine() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.machine : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getProgramId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.programId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public Long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.roomId : (Long) iPatchRedirector.redirect((short) 2, this);
    }

    public String getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.source : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProLiveRoomRichTitle getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.tags : (GProLiveRoomRichTitle) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProAnchorSetRoomInfoReq{roomId=" + this.roomId + ",attrs=" + this.attrs + ",programId=" + this.programId + ",tags=" + this.tags + ",source=" + this.source + ",machine=" + this.machine + ",}";
    }
}
