package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveResultItem.class */
public final class GProLiveResultItem {
    static IPatchRedirector $redirector_;
    public GProLiveRoomInfo liveChannel;
    public ArrayList<MsgAbstract> msgAbstracts;

    public GProLiveResultItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.liveChannel = new GProLiveRoomInfo();
            this.msgAbstracts = new ArrayList<>();
        }
    }

    public GProLiveRoomInfo getLiveChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.liveChannel : (GProLiveRoomInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<MsgAbstract> getMsgAbstracts() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.msgAbstracts : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProLiveResultItem{liveChannel=" + this.liveChannel + ",msgAbstracts=" + this.msgAbstracts + ",}";
    }

    public GProLiveResultItem(GProLiveRoomInfo gProLiveRoomInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProLiveRoomInfo);
            return;
        }
        this.liveChannel = new GProLiveRoomInfo();
        this.msgAbstracts = new ArrayList<>();
        this.liveChannel = gProLiveRoomInfo;
    }
}
