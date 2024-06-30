package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/InlineKetBoardModal.class */
public final class InlineKetBoardModal {
    public String content = "";
    public String confirmText = "";
    public String cancelText = "";

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
