package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupCmd0xce5Req.class */
public final class GroupCmd0xce5Req {
    public long groupId;
    public int noGraytips;
    public ArrayList<GroupRobotInfo> robotInfoList;
    public int serviceType;

    public GroupCmd0xce5Req() {
        this.robotInfoList = new ArrayList<>();
    }

    public long getGroupId() {
        return this.groupId;
    }

    public int getNoGraytips() {
        return this.noGraytips;
    }

    public ArrayList<GroupRobotInfo> getRobotInfoList() {
        return this.robotInfoList;
    }

    public int getServiceType() {
        return this.serviceType;
    }

    public String toString() {
        return "GroupCmd0xce5Req{groupId=" + this.groupId + ",robotInfoList=" + this.robotInfoList + ",noGraytips=" + this.noGraytips + ",serviceType=" + this.serviceType + ",}";
    }

    public GroupCmd0xce5Req(long j, ArrayList<GroupRobotInfo> arrayList, int i, int i2) {
        this.robotInfoList = new ArrayList<>();
        this.groupId = j;
        this.robotInfoList = arrayList;
        this.noGraytips = i;
        this.serviceType = i2;
    }
}
