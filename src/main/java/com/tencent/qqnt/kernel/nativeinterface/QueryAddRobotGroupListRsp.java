package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QueryAddRobotGroupListRsp.class */
public final class QueryAddRobotGroupListRsp {
    public ArrayList<AddRobotGroupInfo> groupList = new ArrayList<>();
    public byte[] cookie = new byte[0];

    public byte[] getCookie() {
        return this.cookie;
    }

    public ArrayList<AddRobotGroupInfo> getGroupList() {
        return this.groupList;
    }

    public String toString() {
        return "QueryAddRobotGroupListRsp{groupList=" + this.groupList + ",cookie=" + this.cookie + ",}";
    }
}
