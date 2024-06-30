package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotUsingLabel.class */
public final class RobotUsingLabel {
    public String labelMsg = "";
    public UsingLabelTheme labelTheme = UsingLabelTheme.values()[0];

    public String getLabelMsg() {
        return this.labelMsg;
    }

    public UsingLabelTheme getLabelTheme() {
        return this.labelTheme;
    }

    public String toString() {
        return "RobotUsingLabel{labelMsg=" + this.labelMsg + ",labelTheme=" + this.labelTheme + ",}";
    }
}
