package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserAVRspInfo.class */
public final class GProUserAVRspInfo {
    static IPatchRedirector $redirector_;
    public GProAVDevOptInfo devOpt;
    public ArrayList<GProAVRoomCtrlOptInfo> roomDevOpts;
    public GProSecurityResult secResult;
    public String tipMsg;
    public String trtcKey;
    public int userState;

    public GProUserAVRspInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.tipMsg = "";
        this.secResult = new GProSecurityResult();
        this.trtcKey = "";
        this.devOpt = new GProAVDevOptInfo();
        this.roomDevOpts = new ArrayList<>();
    }

    public GProAVDevOptInfo getDevOpt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.devOpt : (GProAVDevOptInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProAVRoomCtrlOptInfo> getRoomDevOpts() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.roomDevOpts : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public GProSecurityResult getSecResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.secResult : (GProSecurityResult) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTipMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tipMsg : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getTrtcKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.trtcKey : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getUserState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.userState : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProUserAVRspInfo{tipMsg=" + this.tipMsg + ",secResult=" + this.secResult + ",trtcKey=" + this.trtcKey + ",userState=" + this.userState + ",devOpt=" + this.devOpt + ",roomDevOpts=" + this.roomDevOpts + ",}";
    }

    public GProUserAVRspInfo(String str, GProSecurityResult gProSecurityResult, String str2, int i, GProAVDevOptInfo gProAVDevOptInfo, ArrayList<GProAVRoomCtrlOptInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, gProSecurityResult, str2, Integer.valueOf(i), gProAVDevOptInfo, arrayList);
            return;
        }
        this.tipMsg = "";
        this.secResult = new GProSecurityResult();
        this.trtcKey = "";
        this.devOpt = new GProAVDevOptInfo();
        this.roomDevOpts = new ArrayList<>();
        this.tipMsg = str;
        this.secResult = gProSecurityResult;
        this.trtcKey = str2;
        this.userState = i;
        this.devOpt = gProAVDevOptInfo;
        this.roomDevOpts = arrayList;
    }
}
