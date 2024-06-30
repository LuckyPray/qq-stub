package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRoomInfo.class */
public final class GProRoomInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProViewerExt ViewerExt;
    public ArrayList<GProAudienceInfo> audienceInfos;
    public String programId;
    public HashMap<String, String> roomIcons;
    public long roomId;
    public String roomName;
    public String roomPv;
    public int roomState;
    public String screenShot;
    long serialVersionUID;
    public long viewer;

    public GProRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.roomName = "";
        this.ViewerExt = new GProViewerExt();
        this.programId = "";
        this.roomIcons = new HashMap<>();
        this.roomPv = "";
        this.audienceInfos = new ArrayList<>();
        this.screenShot = "";
    }

    public ArrayList<GProAudienceInfo> getAudienceInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.audienceInfos : (ArrayList) iPatchRedirector.redirect((short) 10, this);
    }

    public String getProgramId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.programId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public HashMap<String, String> getRoomIcons() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.roomIcons : (HashMap) iPatchRedirector.redirect((short) 8, this);
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getRoomName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getRoomPv() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.roomPv : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getRoomState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.roomState : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getScreenShot() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.screenShot : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public long getViewer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.viewer : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public GProViewerExt getViewerExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.ViewerExt : (GProViewerExt) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProRoomInfo{roomId=" + this.roomId + ",roomName=" + this.roomName + ",viewer=" + this.viewer + ",roomState=" + this.roomState + ",ViewerExt=" + this.ViewerExt + ",programId=" + this.programId + ",roomIcons=" + this.roomIcons + ",roomPv=" + this.roomPv + ",audienceInfos=" + this.audienceInfos + ",screenShot=" + this.screenShot + ",}";
    }
}
