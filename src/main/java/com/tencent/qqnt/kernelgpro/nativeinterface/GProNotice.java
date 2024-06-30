package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNotice.class */
public final class GProNotice {
    static IPatchRedirector $redirector_;
    public ArrayList<GProNoticeAction> actionList;
    public ArrayList<GProNoticeText> comment;
    public GProNoticeCover cover;
    public int createTs;
    public int expireTs;
    public long guildId;
    public String handleResult;
    public int handleTs;
    public String handlerNickName;
    public long handlerTinyId;
    public long handlerUin;
    public String joinSign;
    public ArrayList<GProNoticeJump> jumpLink;
    public int msgType;
    public String noticeId;
    public int noticeType;
    public ArrayList<GProNoticeText> subTitle;
    public int templateId;
    public ArrayList<GProNoticeText> title;

    public GProNotice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.noticeId = "";
        this.title = new ArrayList<>();
        this.subTitle = new ArrayList<>();
        this.comment = new ArrayList<>();
        this.cover = new GProNoticeCover();
        this.actionList = new ArrayList<>();
        this.joinSign = "";
        this.jumpLink = new ArrayList<>();
        this.handleResult = "";
        this.handlerNickName = "";
    }

    public ArrayList<GProNoticeAction> getActionList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.actionList : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public ArrayList<GProNoticeText> getComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.comment : (ArrayList) iPatchRedirector.redirect((short) 10, this);
    }

    public GProNoticeCover getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.cover : (GProNoticeCover) iPatchRedirector.redirect((short) 11, this);
    }

    public int getCreateTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createTs : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getExpireTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.expireTs : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getHandleResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.handleResult : (String) iPatchRedirector.redirect((short) 18, this);
    }

    public int getHandleTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.handleTs : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getHandlerNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.handlerNickName : (String) iPatchRedirector.redirect((short) 20, this);
    }

    public long getHandlerTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.handlerTinyId : ((Long) iPatchRedirector.redirect((short) 19, this)).longValue();
    }

    public long getHandlerUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.handlerUin : ((Long) iPatchRedirector.redirect((short) 17, this)).longValue();
    }

    public String getJoinSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.joinSign : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public ArrayList<GProNoticeJump> getJumpLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.jumpLink : (ArrayList) iPatchRedirector.redirect((short) 15, this);
    }

    public int getMsgType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.msgType : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public String getNoticeId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.noticeId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getNoticeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.noticeType : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public ArrayList<GProNoticeText> getSubTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.subTitle : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public int getTemplateId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.templateId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<GProNoticeText> getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.title : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public void setActionList(ArrayList<GProNoticeAction> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) {
            this.actionList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 31, this, arrayList);
        }
    }

    public void setComment(ArrayList<GProNoticeText> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) {
            this.comment = arrayList;
        } else {
            iPatchRedirector.redirect((short) 29, this, arrayList);
        }
    }

    public void setCover(GProNoticeCover gProNoticeCover) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) {
            this.cover = gProNoticeCover;
        } else {
            iPatchRedirector.redirect((short) 30, this, gProNoticeCover);
        }
    }

    public void setCreateTs(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) {
            this.createTs = i;
        } else {
            iPatchRedirector.redirect((short) 23, this, i);
        }
    }

    public void setExpireTs(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) {
            this.expireTs = i;
        } else {
            iPatchRedirector.redirect((short) 24, this, i);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 26, this, j);
        }
    }

    public void setHandleResult(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) {
            this.handleResult = str;
        } else {
            iPatchRedirector.redirect((short) 37, this, str);
        }
    }

    public void setHandleTs(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) {
            this.handleTs = i;
        } else {
            iPatchRedirector.redirect((short) 25, this, i);
        }
    }

    public void setHandlerNickName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 39)) {
            this.handlerNickName = str;
        } else {
            iPatchRedirector.redirect((short) 39, this, str);
        }
    }

    public void setHandlerTinyId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) {
            this.handlerTinyId = j;
        } else {
            iPatchRedirector.redirect((short) 38, this, j);
        }
    }

    public void setHandlerUin(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) {
            this.handlerUin = j;
        } else {
            iPatchRedirector.redirect((short) 36, this, j);
        }
    }

    public void setJoinSign(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) {
            this.joinSign = str;
        } else {
            iPatchRedirector.redirect((short) 32, this, str);
        }
    }

    public void setJumpLink(ArrayList<GProNoticeJump> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) {
            this.jumpLink = arrayList;
        } else {
            iPatchRedirector.redirect((short) 34, this, arrayList);
        }
    }

    public void setMsgType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) {
            this.msgType = i;
        } else {
            iPatchRedirector.redirect((short) 33, this, i);
        }
    }

    public void setNoticeId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) {
            this.noticeId = str;
        } else {
            iPatchRedirector.redirect((short) 21, this, str);
        }
    }

    public void setNoticeType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) {
            this.noticeType = i;
        } else {
            iPatchRedirector.redirect((short) 35, this, i);
        }
    }

    public void setSubTitle(ArrayList<GProNoticeText> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) {
            this.subTitle = arrayList;
        } else {
            iPatchRedirector.redirect((short) 28, this, arrayList);
        }
    }

    public void setTemplateId(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) {
            this.templateId = i;
        } else {
            iPatchRedirector.redirect((short) 22, this, i);
        }
    }

    public void setTitle(ArrayList<GProNoticeText> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) {
            this.title = arrayList;
        } else {
            iPatchRedirector.redirect((short) 27, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 40)) {
            return (String) iPatchRedirector.redirect((short) 40, this);
        }
        return "GProNotice{noticeId=" + this.noticeId + ",templateId=" + this.templateId + ",createTs=" + this.createTs + ",expireTs=" + this.expireTs + ",handleTs=" + this.handleTs + ",guildId=" + this.guildId + ",title=" + this.title + ",subTitle=" + this.subTitle + ",comment=" + this.comment + ",cover=" + this.cover + ",actionList=" + this.actionList + ",joinSign=" + this.joinSign + ",msgType=" + this.msgType + ",jumpLink=" + this.jumpLink + ",noticeType=" + this.noticeType + ",handlerUin=" + this.handlerUin + ",handleResult=" + this.handleResult + ",handlerTinyId=" + this.handlerTinyId + ",handlerNickName=" + this.handlerNickName + ",}";
    }
}
