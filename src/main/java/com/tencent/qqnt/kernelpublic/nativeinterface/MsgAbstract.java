package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/MsgAbstract.class */
public final class MsgAbstract implements Serializable {
    static IPatchRedirector $redirector_;
    public long abstractTime;
    public ArrayList<MsgAbstractElement> elements;
    public long msgSeq;
    public int msgType;
    public Contact peer;
    public String sendMemberName;
    public String sendNickName;
    public int sendStatus;
    public String senderUid;
    long serialVersionUID;

    public MsgAbstract() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.peer = new Contact();
        this.senderUid = "";
        this.sendMemberName = "";
        this.sendNickName = "";
        this.elements = new ArrayList<>();
    }

    public long getAbstractTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.abstractTime : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public ArrayList<MsgAbstractElement> getElements() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.elements : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public long getMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.msgSeq : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public int getMsgType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.msgType : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public Contact getPeer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.peer : (Contact) iPatchRedirector.redirect((short) 3, this);
    }

    public String getSendMemberName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.sendMemberName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSendNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.sendNickName : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getSendStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sendStatus : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getSenderUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.senderUid : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "MsgAbstract{peer=" + this.peer + ",senderUid=" + this.senderUid + ",sendMemberName=" + this.sendMemberName + ",sendNickName=" + this.sendNickName + ",sendStatus=" + this.sendStatus + ",elements=" + this.elements + ",abstractTime=" + this.abstractTime + ",msgType=" + this.msgType + ",msgSeq=" + this.msgSeq + ",}";
    }

    public MsgAbstract(Contact contact, String str, String str2, String str3, int i, ArrayList<MsgAbstractElement> arrayList, long j, int i2, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, contact, str, str2, str3, Integer.valueOf(i), arrayList, Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2));
            return;
        }
        this.serialVersionUID = 1L;
        this.peer = new Contact();
        this.senderUid = "";
        this.sendMemberName = "";
        this.sendNickName = "";
        this.elements = new ArrayList<>();
        this.peer = contact;
        this.senderUid = str;
        this.sendMemberName = str2;
        this.sendNickName = str3;
        this.sendStatus = i;
        this.elements = arrayList;
        this.abstractTime = j;
        this.msgType = i2;
        this.msgSeq = j2;
    }
}
