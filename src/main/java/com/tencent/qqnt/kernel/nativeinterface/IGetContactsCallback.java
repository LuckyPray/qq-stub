package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IGetContactsCallback.class */
public interface IGetContactsCallback {
    void onResult(int i, String str, ArrayList<RecentContactInfo> arrayList, ArrayList<Contact> arrayList2);
}
