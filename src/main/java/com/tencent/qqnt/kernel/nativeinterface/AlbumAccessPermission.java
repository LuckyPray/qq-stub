package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AlbumAccessPermission.class */
public final class AlbumAccessPermission {
    public int permissionType;
    public String question = "";
    public String answer = "";
    public ArrayList<String> whiteList = new ArrayList<>();

    public String getAnswer() {
        return this.answer;
    }

    public int getPermissionType() {
        return this.permissionType;
    }

    public String getQuestion() {
        return this.question;
    }

    public ArrayList<String> getWhiteList() {
        return this.whiteList;
    }
}
