package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupPortrait.class */
public final class GroupPortrait {
    public int defaultId;
    public int portraitCnt;
    public int verifyingPortraitCnt;
    public ArrayList<GroupPortraitInfo> portraitInfo = new ArrayList<>();
    public ArrayList<GroupPortraitInfo> verifyingPortraitInfo = new ArrayList<>();

    public int getDefaultId() {
        return this.defaultId;
    }

    public int getPortraitCnt() {
        return this.portraitCnt;
    }

    public ArrayList<GroupPortraitInfo> getPortraitInfo() {
        return this.portraitInfo;
    }

    public int getVerifyingPortraitCnt() {
        return this.verifyingPortraitCnt;
    }

    public ArrayList<GroupPortraitInfo> getVerifyingPortraitInfo() {
        return this.verifyingPortraitInfo;
    }

    public String toString() {
        return "GroupPortrait{portraitCnt=" + this.portraitCnt + ",portraitInfo=" + this.portraitInfo + ",defaultId=" + this.defaultId + ",verifyingPortraitCnt=" + this.verifyingPortraitCnt + ",verifyingPortraitInfo=" + this.verifyingPortraitInfo + ",}";
    }
}
