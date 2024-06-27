package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AVGroupAudioMemberModel.class */
public final class AVGroupAudioMemberModel {
    public int AVState;
    public int invitedTimestamp;
    public boolean isInvited;
    public boolean isMicOff;
    public boolean isMicOffBySelf;
    public int terminalType;
    public String uid;

    public AVGroupAudioMemberModel() {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getAVState() {
        return this.AVState;
    }

    public int getInvitedTimestamp() {
        return this.invitedTimestamp;
    }

    public boolean getIsInvited() {
        return this.isInvited;
    }

    public boolean getIsMicOff() {
        return this.isMicOff;
    }

    public boolean getIsMicOffBySelf() {
        return this.isMicOffBySelf;
    }

    public int getTerminalType() {
        return this.terminalType;
    }

    public String getUid() {
        return this.uid;
    }

    public String toString() {
        return "AVGroupAudioMemberModel{isInvited=" + this.isInvited + ",invitedTimestamp=" + this.invitedTimestamp + ",uid=" + this.uid + ",AVState=" + this.AVState + ",terminalType=" + this.terminalType + ",isMicOff=" + this.isMicOff + ",isMicOffBySelf=" + this.isMicOffBySelf + ",}";
    }

    public AVGroupAudioMemberModel(boolean z, int i, String str, int i2, int i3, boolean z2, boolean z3) {
        this.uid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.isInvited = z;
        this.invitedTimestamp = i;
        this.uid = str;
        this.AVState = i2;
        this.terminalType = i3;
        this.isMicOff = z2;
        this.isMicOffBySelf = z3;
    }
}
