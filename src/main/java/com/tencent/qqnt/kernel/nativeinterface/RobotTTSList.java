package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotTTSList.class */
public final class RobotTTSList {
    public String defaultTtsId = "";
    public String pickTtsId = "";
    public byte[] vipVoiceInfo = new byte[0];
    public ArrayList<TtsInfo> ttsList = new ArrayList<>();

    public String getDefaultTtsId() {
        return this.defaultTtsId;
    }

    public String getPickTtsId() {
        return this.pickTtsId;
    }

    public ArrayList<TtsInfo> getTtsList() {
        return this.ttsList;
    }

    public byte[] getVipVoiceInfo() {
        return this.vipVoiceInfo;
    }

    public String toString() {
        return "RobotTTSList{defaultTtsId=" + this.defaultTtsId + ",pickTtsId=" + this.pickTtsId + ",vipVoiceInfo=" + this.vipVoiceInfo + ",ttsList=" + this.ttsList + ",}";
    }
}
