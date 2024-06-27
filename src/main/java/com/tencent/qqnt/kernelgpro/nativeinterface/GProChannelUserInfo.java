package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelUserInfo.class */
public final class GProChannelUserInfo {
    static IPatchRedirector $redirector_;
    public GProBaseClientIdentity clientIdentity;
    public GProClientIdentityBytes clientIdentityBytes;
    public byte[] clientIdentityBytesBinary;
    public byte[] clientIdentityBytesJson;
    public int memberType;
    public GProChannelUserPermission permission;
    public ArrayList<GProRoleGroupInfo> roleGroups;
    public int roleType;
    public GProVoiceLiveInfo voiceLiveInfo;

    public GProChannelUserInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.clientIdentity = new GProBaseClientIdentity();
        this.permission = new GProChannelUserPermission();
        this.roleGroups = new ArrayList<>();
        this.clientIdentityBytesBinary = new byte[0];
        this.clientIdentityBytesJson = new byte[0];
        this.voiceLiveInfo = new GProVoiceLiveInfo();
        this.clientIdentityBytes = new GProClientIdentityBytes();
    }

    public GProBaseClientIdentity getClientIdentity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.clientIdentity : (GProBaseClientIdentity) iPatchRedirector.redirect((short) 2, this);
    }

    public GProClientIdentityBytes getClientIdentityBytes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.clientIdentityBytes : (GProClientIdentityBytes) iPatchRedirector.redirect((short) 10, this);
    }

    public byte[] getClientIdentityBytesBinary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.clientIdentityBytesBinary : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public byte[] getClientIdentityBytesJson() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.clientIdentityBytesJson : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public int getMemberType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.memberType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProChannelUserPermission getPermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.permission : (GProChannelUserPermission) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProRoleGroupInfo> getRoleGroups() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.roleGroups : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public int getRoleType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.roleType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public GProVoiceLiveInfo getVoiceLiveInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.voiceLiveInfo : (GProVoiceLiveInfo) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProChannelUserInfo{clientIdentity=" + this.clientIdentity + ",memberType=" + this.memberType + ",permission=" + this.permission + ",roleGroups=" + this.roleGroups + ",clientIdentityBytesBinary=" + this.clientIdentityBytesBinary + ",roleType=" + this.roleType + ",clientIdentityBytesJson=" + this.clientIdentityBytesJson + ",voiceLiveInfo=" + this.voiceLiveInfo + ",clientIdentityBytes=" + this.clientIdentityBytes + ",}";
    }
}
