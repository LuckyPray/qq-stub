package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorRoomNoticeItem.class */
public final class GProAnchorRoomNoticeItem {
    static IPatchRedirector $redirector_;
    public Long anchorUid;
    public String ext;
    public String programId;
    public ArrayList<GProAnchorRoomTag> romTags;
    public String roomLogo11;
    public Long roomLogo11Time;
    public String roomLogo169;
    public Long roomLogo169Time;
    public String roomLogo34;
    public Long roomLogo34Time;
    public Long roomPlayEndTime;
    public Long roomPlayStartTime3;
    public String roomPrompt;
    public String roomTitle;

    public GProAnchorRoomNoticeItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.romTags = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public Long getAnchorUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.anchorUid : (Long) iPatchRedirector.redirect((short) 3, this);
    }

    public String getExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.ext : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public String getProgramId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.programId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProAnchorRoomTag> getRomTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.romTags : (ArrayList) iPatchRedirector.redirect((short) 13, this);
    }

    public String getRoomLogo11() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.roomLogo11 : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public Long getRoomLogo11Time() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.roomLogo11Time : (Long) iPatchRedirector.redirect((short) 10, this);
    }

    public String getRoomLogo169() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.roomLogo169 : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public Long getRoomLogo169Time() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.roomLogo169Time : (Long) iPatchRedirector.redirect((short) 11, this);
    }

    public String getRoomLogo34() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.roomLogo34 : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public Long getRoomLogo34Time() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.roomLogo34Time : (Long) iPatchRedirector.redirect((short) 12, this);
    }

    public Long getRoomPlayEndTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.roomPlayEndTime : (Long) iPatchRedirector.redirect((short) 5, this);
    }

    public Long getRoomPlayStartTime3() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.roomPlayStartTime3 : (Long) iPatchRedirector.redirect((short) 4, this);
    }

    public String getRoomPrompt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.roomPrompt : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public String getRoomTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.roomTitle : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
            return (String) iPatchRedirector.redirect((short) 16, this);
        }
        return "GProAnchorRoomNoticeItem{programId=" + this.programId + ",anchorUid=" + this.anchorUid + ",roomPlayStartTime3=" + this.roomPlayStartTime3 + ",roomPlayEndTime=" + this.roomPlayEndTime + ",roomTitle=" + this.roomTitle + ",roomLogo11=" + this.roomLogo11 + ",roomLogo169=" + this.roomLogo169 + ",roomLogo34=" + this.roomLogo34 + ",roomLogo11Time=" + this.roomLogo11Time + ",roomLogo169Time=" + this.roomLogo169Time + ",roomLogo34Time=" + this.roomLogo34Time + ",romTags=" + this.romTags + ",roomPrompt=" + this.roomPrompt + ",ext=" + this.ext + ",}";
    }
}
