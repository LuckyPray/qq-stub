package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProFetchRolePermissionCallback.class */
public interface IGProFetchRolePermissionCallback {
    void onFetchRolePermissionCallback(int i, String str, GProGuildRole gProGuildRole, GProRolePermission gProRolePermission, ArrayList<GProRolePermissionDesc> arrayList, ArrayList<GProRolePermissionCategory> arrayList2);
}
