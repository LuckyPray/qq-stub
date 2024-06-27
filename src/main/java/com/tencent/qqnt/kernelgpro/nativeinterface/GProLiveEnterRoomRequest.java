package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveEnterRoomRequest.class */
public final class GProLiveEnterRoomRequest {
    static IPatchRedirector $redirector_;
    public String bypassData;
    public String channelId;
    public String extData;
    public ArrayList<String> formats;
    public String fromSource;
    public String machineCode;
    public String programId;
    public String programNewId;
    public Long roomId;

    public GProLiveEnterRoomRequest() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getBypassData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.bypassData : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getExtData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.extData : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<String> getFormats() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.formats : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String getFromSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.fromSource : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getMachineCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.machineCode : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getProgramId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.programId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getProgramNewId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.programNewId : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public Long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.roomId : (Long) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProLiveEnterRoomRequest{roomId=" + this.roomId + ",machineCode=" + this.machineCode + ",fromSource=" + this.fromSource + ",formats=" + this.formats + ",extData=" + this.extData + ",programId=" + this.programId + ",channelId=" + this.channelId + ",bypassData=" + this.bypassData + ",programNewId=" + this.programNewId + ",}";
    }
}
