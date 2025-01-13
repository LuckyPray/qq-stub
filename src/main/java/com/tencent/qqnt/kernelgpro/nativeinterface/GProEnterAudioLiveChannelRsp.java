package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEnterAudioLiveChannelRsp.class */
public final class GProEnterAudioLiveChannelRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public String authMeta;
    public GProAVChannelConfig avChannelConfig;
    public boolean enableStream;
    public int globalMutedFlag;
    public GProEnterChannelPermission liveChannelPermission;
    public long noStreamDisconnectTrtcSecond;
    public GProEnterAVChannelPermissionInfo permissionInfo;
    public String privateMapKey;
    public String roomSessionId;
    public int sdkAppId;
    long serialVersionUID;
    public String showTips;
    public long sigExpiresSecond;
    public ArrayList<GProStreamInfo> streamInfoList;
    public String trtcUserSign;
    public ArrayList<GProUserBarNodePermission> userBarNodePermission;
    public int userTRTC;
    public long userTinyId;

    public GProEnterAudioLiveChannelRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.authMeta = "";
        this.trtcUserSign = "";
        this.privateMapKey = "";
        this.streamInfoList = new ArrayList<>();
        this.showTips = "";
        this.avChannelConfig = new GProAVChannelConfig();
        this.userBarNodePermission = new ArrayList<>();
        this.roomSessionId = "";
        this.permissionInfo = new GProEnterAVChannelPermissionInfo();
        this.liveChannelPermission = new GProEnterChannelPermission();
    }

    public String getAuthMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.authMeta : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProAVChannelConfig getAvChannelConfig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.avChannelConfig : (GProAVChannelConfig) iPatchRedirector.redirect((short) 11, this);
    }

    public boolean getEnableStream() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.enableStream : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public int getGlobalMutedFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.globalMutedFlag : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public GProEnterChannelPermission getLiveChannelPermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.liveChannelPermission : (GProEnterChannelPermission) iPatchRedirector.redirect((short) 16, this);
    }

    public long getNoStreamDisconnectTrtcSecond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.noStreamDisconnectTrtcSecond : ((Long) iPatchRedirector.redirect((short) 19, this)).longValue();
    }

    public GProEnterAVChannelPermissionInfo getPermissionInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.permissionInfo : (GProEnterAVChannelPermissionInfo) iPatchRedirector.redirect((short) 15, this);
    }

    public String getPrivateMapKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.privateMapKey : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getRoomSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.roomSessionId : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public int getSdkAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.sdkAppId : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getShowTips() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.showTips : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public long getSigExpiresSecond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.sigExpiresSecond : ((Long) iPatchRedirector.redirect((short) 18, this)).longValue();
    }

    public ArrayList<GProStreamInfo> getStreamInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.streamInfoList : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String getTrtcUserSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.trtcUserSign : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProUserBarNodePermission> getUserBarNodePermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.userBarNodePermission : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public int getUserTRTC() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.userTRTC : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getUserTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.userTinyId : ((Long) iPatchRedirector.redirect((short) 17, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 20)) {
            return (String) iPatchRedirector.redirect((short) 20, this);
        }
        return "GProEnterAudioLiveChannelRsp{authMeta=" + this.authMeta + ",enableStream=" + this.enableStream + ",userTRTC=" + this.userTRTC + ",sdkAppId=" + this.sdkAppId + ",trtcUserSign=" + this.trtcUserSign + ",privateMapKey=" + this.privateMapKey + ",streamInfoList=" + this.streamInfoList + ",showTips=" + this.showTips + ",avChannelConfig=" + this.avChannelConfig + ",userBarNodePermission=" + this.userBarNodePermission + ",roomSessionId=" + this.roomSessionId + ",globalMutedFlag=" + this.globalMutedFlag + ",permissionInfo=" + this.permissionInfo + ",liveChannelPermission=" + this.liveChannelPermission + ",userTinyId=" + this.userTinyId + ",sigExpiresSecond=" + this.sigExpiresSecond + ",noStreamDisconnectTrtcSecond=" + this.noStreamDisconnectTrtcSecond + ",}";
    }

    public GProEnterAudioLiveChannelRsp(String str, boolean z, int i, int i2, String str2, String str3, ArrayList<GProStreamInfo> arrayList, String str4, GProAVChannelConfig gProAVChannelConfig, ArrayList<GProUserBarNodePermission> arrayList2, String str5, int i3, GProEnterAVChannelPermissionInfo gProEnterAVChannelPermissionInfo, GProEnterChannelPermission gProEnterChannelPermission, long j, long j2, long j3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str2, str3, arrayList, str4, gProAVChannelConfig, arrayList2, str5, Integer.valueOf(i3), gProEnterAVChannelPermissionInfo, gProEnterChannelPermission, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
            return;
        }
        this.serialVersionUID = 1L;
        this.authMeta = "";
        this.trtcUserSign = "";
        this.privateMapKey = "";
        this.streamInfoList = new ArrayList<>();
        this.showTips = "";
        this.avChannelConfig = new GProAVChannelConfig();
        this.userBarNodePermission = new ArrayList<>();
        this.roomSessionId = "";
        this.permissionInfo = new GProEnterAVChannelPermissionInfo();
        this.liveChannelPermission = new GProEnterChannelPermission();
        this.authMeta = str;
        this.enableStream = z;
        this.userTRTC = i;
        this.sdkAppId = i2;
        this.trtcUserSign = str2;
        this.privateMapKey = str3;
        this.streamInfoList = arrayList;
        this.showTips = str4;
        this.avChannelConfig = gProAVChannelConfig;
        this.userBarNodePermission = arrayList2;
        this.roomSessionId = str5;
        this.globalMutedFlag = i3;
        this.permissionInfo = gProEnterAVChannelPermissionInfo;
        this.liveChannelPermission = gProEnterChannelPermission;
        this.userTinyId = j;
        this.sigExpiresSecond = j2;
        this.noStreamDisconnectTrtcSecond = j3;
    }
}
