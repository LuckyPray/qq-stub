package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EnterOrExitAioInfo.class */
public final class EnterOrExitAioInfo {
    public int option;
    public Contact peer;

    public EnterOrExitAioInfo() {
        this.peer = new Contact();
    }

    public int getOption() {
        return this.option;
    }

    public Contact getPeer() {
        return this.peer;
    }

    public String toString() {
        return "EnterOrExitAioInfo{peer=" + this.peer + ",option=" + this.option + ",}";
    }

    public EnterOrExitAioInfo(Contact contact, int i) {
        this.peer = new Contact();
        this.peer = contact;
        this.option = i;
    }
}
