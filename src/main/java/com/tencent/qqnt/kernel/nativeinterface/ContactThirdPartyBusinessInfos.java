package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ContactThirdPartyBusinessInfos.class */
public final class ContactThirdPartyBusinessInfos {
    public Contact contact;
    public ArrayList<ThirdPartyBusinessInfo> infos;

    public ContactThirdPartyBusinessInfos() {
        this.contact = new Contact();
        this.infos = new ArrayList<>();
    }

    public Contact getContact() {
        return this.contact;
    }

    public ArrayList<ThirdPartyBusinessInfo> getInfos() {
        return this.infos;
    }

    public String toString() {
        return "ContactThirdPartyBusinessInfos{contact=" + this.contact + ",infos=" + this.infos + ",}";
    }

    public ContactThirdPartyBusinessInfos(Contact contact, ArrayList<ThirdPartyBusinessInfo> arrayList) {
        this.contact = new Contact();
        this.infos = new ArrayList<>();
        this.contact = contact;
        this.infos = arrayList;
    }
}
