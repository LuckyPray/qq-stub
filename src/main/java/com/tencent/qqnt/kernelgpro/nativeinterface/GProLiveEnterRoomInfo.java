package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveEnterRoomInfo.class */
public final class GProLiveEnterRoomInfo {
    static IPatchRedirector $redirector_;
    public String businessPid;
    public Integer gameType;
    public Integer giftFlag;
    public Integer goodsFlag;
    public String logo;
    public String name;
    public Long ownerUid;
    public Integer payFlag;
    public String programId;
    public Long roomId;
    public GProLiveRoomRichTitle roomLabels;
    public String sid;
    public String systemNotice;

    public GProLiveEnterRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getBusinessPid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.businessPid : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public Integer getGameType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.gameType : (Integer) iPatchRedirector.redirect((short) 6, this);
    }

    public Integer getGiftFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.giftFlag : (Integer) iPatchRedirector.redirect((short) 8, this);
    }

    public Integer getGoodsFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.goodsFlag : (Integer) iPatchRedirector.redirect((short) 9, this);
    }

    public String getLogo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.logo : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.name : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public Long getOwnerUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.ownerUid : (Long) iPatchRedirector.redirect((short) 3, this);
    }

    public Integer getPayFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.payFlag : (Integer) iPatchRedirector.redirect((short) 13, this);
    }

    public String getProgramId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.programId : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public Long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.roomId : (Long) iPatchRedirector.redirect((short) 2, this);
    }

    public GProLiveRoomRichTitle getRoomLabels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.roomLabels : (GProLiveRoomRichTitle) iPatchRedirector.redirect((short) 7, this);
    }

    public String getSid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.sid : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getSystemNotice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.systemNotice : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProLiveEnterRoomInfo{roomId=" + this.roomId + ",ownerUid=" + this.ownerUid + ",logo=" + this.logo + ",name=" + this.name + ",gameType=" + this.gameType + ",roomLabels=" + this.roomLabels + ",giftFlag=" + this.giftFlag + ",goodsFlag=" + this.goodsFlag + ",programId=" + this.programId + ",systemNotice=" + this.systemNotice + ",sid=" + this.sid + ",payFlag=" + this.payFlag + ",businessPid=" + this.businessPid + ",}";
    }
}
