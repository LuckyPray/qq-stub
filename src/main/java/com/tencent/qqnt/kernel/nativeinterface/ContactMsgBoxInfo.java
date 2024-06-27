package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ContactMsgBoxInfo.class */
public final class ContactMsgBoxInfo {
    public Contact contact;
    public MsgBoxNecessaryMsgInfo firstUnreadMsgInfo;
    public ArrayList<SpecificEventTypeInfoInMsgBox> listOfSpecificEventTypeInfosInMsgBox;
    public Long unreadCnt;

    public ContactMsgBoxInfo() {
        this.contact = new Contact();
        this.listOfSpecificEventTypeInfosInMsgBox = new ArrayList<>();
    }

    public Contact getContact() {
        return this.contact;
    }

    public MsgBoxNecessaryMsgInfo getFirstUnreadMsgInfo() {
        return this.firstUnreadMsgInfo;
    }

    public ArrayList<SpecificEventTypeInfoInMsgBox> getListOfSpecificEventTypeInfosInMsgBox() {
        return this.listOfSpecificEventTypeInfosInMsgBox;
    }

    public Long getUnreadCnt() {
        return this.unreadCnt;
    }

    public String toString() {
        return "ContactMsgBoxInfo{contact=" + this.contact + ",firstUnreadMsgInfo=" + this.firstUnreadMsgInfo + ",unreadCnt=" + this.unreadCnt + ",listOfSpecificEventTypeInfosInMsgBox=" + this.listOfSpecificEventTypeInfosInMsgBox + ",}";
    }

    public ContactMsgBoxInfo(Contact contact, MsgBoxNecessaryMsgInfo msgBoxNecessaryMsgInfo, Long l, ArrayList<SpecificEventTypeInfoInMsgBox> arrayList) {
        this.contact = new Contact();
        this.listOfSpecificEventTypeInfosInMsgBox = new ArrayList<>();
        this.contact = contact;
        this.firstUnreadMsgInfo = msgBoxNecessaryMsgInfo;
        this.unreadCnt = l;
        this.listOfSpecificEventTypeInfosInMsgBox = arrayList;
    }
}
