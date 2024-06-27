package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InlineKetBoardModal.class */
public final class InlineKetBoardModal {
    public String content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String confirmText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String cancelText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getCancelText() {
        return this.cancelText;
    }

    public String getConfirmText() {
        return this.confirmText;
    }

    public String getContent() {
        return this.content;
    }

    public String toString() {
        return "InlineKetBoardModal{content=" + this.content + ",confirmText=" + this.confirmText + ",cancelText=" + this.cancelText + ",}";
    }
}
