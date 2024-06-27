package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMemberGetBoundGroupRsp.class */
public final class GProMemberGetBoundGroupRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> allBindGroupCodeList;
    public int bindingGroupLimit;
    public ArrayList<GProBindingGroup> bindingGroupList;
    public int bindingGroupSize;
    public long guildId;
    public int srcType;

    public GProMemberGetBoundGroupRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.bindingGroupList = new ArrayList<>();
            this.allBindGroupCodeList = new ArrayList<>();
        }
    }

    public ArrayList<Long> getAllBindGroupCodeList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.allBindGroupCodeList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public int getBindingGroupLimit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.bindingGroupLimit : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public ArrayList<GProBindingGroup> getBindingGroupList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.bindingGroupList : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public int getBindingGroupSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.bindingGroupSize : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public int getSrcType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.srcType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProMemberGetBoundGroupRsp{bindingGroupList=" + this.bindingGroupList + ",bindingGroupSize=" + this.bindingGroupSize + ",allBindGroupCodeList=" + this.allBindGroupCodeList + ",bindingGroupLimit=" + this.bindingGroupLimit + ",guildId=" + this.guildId + ",srcType=" + this.srcType + ",}";
    }
}
