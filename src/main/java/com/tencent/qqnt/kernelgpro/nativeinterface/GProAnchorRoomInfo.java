package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorRoomInfo.class */
public final class GProAnchorRoomInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProAnchorRoomNoticeItem> beginRoomNoticeTime;
    public Integer continueLiveStatus;
    public String coverUrl169;
    public String coverUrl34;
    public Integer giftFlag;
    public Integer goodsNum;
    public String goodsUrl;

    /* renamed from: id */
    public Integer f54id;
    public String logo;
    public String name;
    public String programId;
    public Integer roomGameType;
    public String roomPrepareNotify;
    public String systemNotice;
    public GProLiveRoomRichTitle tags;
    public Boolean todayHasRoomNotice;

    public GProAnchorRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.beginRoomNoticeTime = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProAnchorRoomNoticeItem> getBeginRoomNoticeTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.beginRoomNoticeTime : (ArrayList) iPatchRedirector.redirect((short) 16, this);
    }

    public Integer getContinueLiveStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.continueLiveStatus : (Integer) iPatchRedirector.redirect((short) 15, this);
    }

    public String getCoverUrl169() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.coverUrl169 : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getCoverUrl34() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.coverUrl34 : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public Integer getGiftFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.giftFlag : (Integer) iPatchRedirector.redirect((short) 6, this);
    }

    public Integer getGoodsNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.goodsNum : (Integer) iPatchRedirector.redirect((short) 8, this);
    }

    public String getGoodsUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.goodsUrl : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public Integer getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.f54id : (Integer) iPatchRedirector.redirect((short) 2, this);
    }

    public String getLogo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.logo : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getProgramId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.programId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public Integer getRoomGameType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.roomGameType : (Integer) iPatchRedirector.redirect((short) 13, this);
    }

    public String getRoomPrepareNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.roomPrepareNotify : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public String getSystemNotice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.systemNotice : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public GProLiveRoomRichTitle getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.tags : (GProLiveRoomRichTitle) iPatchRedirector.redirect((short) 9, this);
    }

    public Boolean getTodayHasRoomNotice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.todayHasRoomNotice : (Boolean) iPatchRedirector.redirect((short) 17, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProAnchorRoomInfo{id=" + this.f54id + ",name=" + this.name + ",logo=" + this.logo + ",programId=" + this.programId + ",giftFlag=" + this.giftFlag + ",goodsUrl=" + this.goodsUrl + ",goodsNum=" + this.goodsNum + ",tags=" + this.tags + ",coverUrl169=" + this.coverUrl169 + ",coverUrl34=" + this.coverUrl34 + ",roomPrepareNotify=" + this.roomPrepareNotify + ",roomGameType=" + this.roomGameType + ",systemNotice=" + this.systemNotice + ",continueLiveStatus=" + this.continueLiveStatus + ",beginRoomNoticeTime=" + this.beginRoomNoticeTime + ",todayHasRoomNotice=" + this.todayHasRoomNotice + ",}";
    }
}
