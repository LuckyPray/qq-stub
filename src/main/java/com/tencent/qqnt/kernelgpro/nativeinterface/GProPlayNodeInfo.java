package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPlayNodeInfo.class */
public final class GProPlayNodeInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public int accessFlag;
    public long addTime;
    public long addTinyId;
    public String addUserAvatarMeta;
    public String addUserName;
    public ArrayList<String> backgroundColorList;
    public long orderNum;
    public String playNodeId;
    public int playSourceDuration;
    public String playSourceId;
    public String playSourceName;
    public String playSourcePic;
    public String playSourceShowName;
    long serialVersionUID;
    public String singerList;
    public String thirdSourceIcon;
    public String thirdSourceId;

    public GProPlayNodeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.playSourceId = "";
        this.thirdSourceId = "";
        this.playSourceShowName = "";
        this.playSourceName = "";
        this.singerList = "";
        this.playSourcePic = "";
        this.thirdSourceIcon = "";
        this.playNodeId = "";
        this.backgroundColorList = new ArrayList<>();
        this.addUserName = "";
        this.addUserAvatarMeta = "";
    }

    public int getAccessFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.accessFlag : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public long getAddTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.addTime : ((Long) iPatchRedirector.redirect((short) 17, this)).longValue();
    }

    public long getAddTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.addTinyId : ((Long) iPatchRedirector.redirect((short) 14, this)).longValue();
    }

    public String getAddUserAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.addUserAvatarMeta : (String) iPatchRedirector.redirect((short) 16, this);
    }

    public String getAddUserName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.addUserName : (String) iPatchRedirector.redirect((short) 15, this);
    }

    public ArrayList<String> getBackgroundColorList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.backgroundColorList : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public long getOrderNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.orderNum : ((Long) iPatchRedirector.redirect((short) 18, this)).longValue();
    }

    public String getPlayNodeId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.playNodeId : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getPlaySourceDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.playSourceDuration : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getPlaySourceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.playSourceId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getPlaySourceName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.playSourceName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getPlaySourcePic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.playSourcePic : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getPlaySourceShowName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.playSourceShowName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSingerList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.singerList : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getThirdSourceIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.thirdSourceIcon : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getThirdSourceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.thirdSourceId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
            return (String) iPatchRedirector.redirect((short) 19, this);
        }
        return "GProPlayNodeInfo{playSourceId=" + this.playSourceId + ",thirdSourceId=" + this.thirdSourceId + ",playSourceShowName=" + this.playSourceShowName + ",playSourceName=" + this.playSourceName + ",singerList=" + this.singerList + ",playSourceDuration=" + this.playSourceDuration + ",playSourcePic=" + this.playSourcePic + ",thirdSourceIcon=" + this.thirdSourceIcon + ",playNodeId=" + this.playNodeId + ",backgroundColorList=" + this.backgroundColorList + ",accessFlag=" + this.accessFlag + ",addTinyId=" + this.addTinyId + ",addUserName=" + this.addUserName + ",addUserAvatarMeta=" + this.addUserAvatarMeta + ",addTime=" + this.addTime + ",orderNum=" + this.orderNum + ",}";
    }

    public GProPlayNodeInfo(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, ArrayList<String> arrayList, int i2, long j, String str9, String str10, long j2, long j3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, str3, str4, str5, Integer.valueOf(i), str6, str7, str8, arrayList, Integer.valueOf(i2), Long.valueOf(j), str9, str10, Long.valueOf(j2), Long.valueOf(j3));
            return;
        }
        this.serialVersionUID = 1L;
        this.playSourceId = "";
        this.thirdSourceId = "";
        this.playSourceShowName = "";
        this.playSourceName = "";
        this.singerList = "";
        this.playSourcePic = "";
        this.thirdSourceIcon = "";
        this.playNodeId = "";
        this.backgroundColorList = new ArrayList<>();
        this.addUserName = "";
        this.addUserAvatarMeta = "";
        this.playSourceId = str;
        this.thirdSourceId = str2;
        this.playSourceShowName = str3;
        this.playSourceName = str4;
        this.singerList = str5;
        this.playSourceDuration = i;
        this.playSourcePic = str6;
        this.thirdSourceIcon = str7;
        this.playNodeId = str8;
        this.backgroundColorList = arrayList;
        this.accessFlag = i2;
        this.addTinyId = j;
        this.addUserName = str9;
        this.addUserAvatarMeta = str10;
        this.addTime = j2;
        this.orderNum = j3;
    }
}
