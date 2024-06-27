package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelRDeliveryDataChangeListener.class */
public interface IKernelRDeliveryDataChangeListener {
    void onDataAdd(String str, RDeliveryData rDeliveryData);

    void onDataChange(String str, RDeliveryData rDeliveryData, RDeliveryData rDeliveryData2);

    void onDataDelete(String str);
}
