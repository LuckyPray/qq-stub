package com.tencent.qqnt.kernel.nativeinterface;

import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotBase.class */
public final class RobotBase implements Serializable {
    public long robotUin;
    long serialVersionUID = 1;
    public String robotName = "";
    public String robotAvatar = "";
    public String robotDesc = "";

    public String getRobotAvatar() {
        return this.robotAvatar;
    }

    public String getRobotDesc() {
        return this.robotDesc;
    }

    public String getRobotName() {
        return this.robotName;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "RobotBase{robotUin=" + this.robotUin + ",robotName=" + this.robotName + ",robotAvatar=" + this.robotAvatar + ",robotDesc=" + this.robotDesc + ",}";
    }
}
