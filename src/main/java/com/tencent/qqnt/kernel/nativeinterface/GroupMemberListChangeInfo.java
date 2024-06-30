package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberListChangeInfo.class */
public final class GroupMemberListChangeInfo {
    public long groupCode;
    public boolean hasNext;
    public boolean hasPrev;
    public boolean hasRobot;
    public ArrayList<GroupMemberInfoListId> ids;
    public HashMap<String, MemberInfo> infos;
    public String sceneId;

    public GroupMemberListChangeInfo() {
        this.sceneId = "";
        this.ids = new ArrayList<>();
        this.infos = new HashMap<>();
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public boolean getHasNext() {
        return this.hasNext;
    }

    public boolean getHasPrev() {
        return this.hasPrev;
    }

    public boolean getHasRobot() {
        return this.hasRobot;
    }

    public ArrayList<GroupMemberInfoListId> getIds() {
        return this.ids;
    }

    public HashMap<String, MemberInfo> getInfos() {
        return this.infos;
    }

    public String getSceneId() {
        return this.sceneId;
    }

    public String toString() {
        return "GroupMemberListChangeInfo{sceneId=" + this.sceneId + ",groupCode=" + this.groupCode + ",ids=" + this.ids + ",infos=" + this.infos + ",hasPrev=" + this.hasPrev + ",hasNext=" + this.hasNext + ",hasRobot=" + this.hasRobot + ",}";
    }

    public GroupMemberListChangeInfo(String str, long j, ArrayList<GroupMemberInfoListId> arrayList, HashMap<String, MemberInfo> hashMap, boolean z, boolean z2) {
        this.sceneId = "";
        this.ids = new ArrayList<>();
        this.infos = new HashMap<>();
        this.sceneId = str;
        this.groupCode = j;
        this.ids = arrayList;
        this.infos = hashMap;
        this.hasPrev = z;
        this.hasNext = z2;
    }
}
