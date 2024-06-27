package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FileSessionResult.class */
public final class FileSessionResult {
    public ArrayList<FileAssistantSession> selfSend;
    public ArrayList<FileAssistantSession> senderList;
    public ArrayList<FileAssistantSession> sessionList;
    public ArrayList<FileAssistantSession> stranger;

    public FileSessionResult() {
        this.selfSend = new ArrayList<>();
        this.senderList = new ArrayList<>();
        this.stranger = new ArrayList<>();
        this.sessionList = new ArrayList<>();
    }

    public ArrayList<FileAssistantSession> getSelfSend() {
        return this.selfSend;
    }

    public ArrayList<FileAssistantSession> getSenderList() {
        return this.senderList;
    }

    public ArrayList<FileAssistantSession> getSessionList() {
        return this.sessionList;
    }

    public ArrayList<FileAssistantSession> getStranger() {
        return this.stranger;
    }

    public String toString() {
        return "FileSessionResult{selfSend=" + this.selfSend + ",senderList=" + this.senderList + ",stranger=" + this.stranger + ",sessionList=" + this.sessionList + ",}";
    }

    public FileSessionResult(ArrayList<FileAssistantSession> arrayList, ArrayList<FileAssistantSession> arrayList2, ArrayList<FileAssistantSession> arrayList3, ArrayList<FileAssistantSession> arrayList4) {
        this.selfSend = new ArrayList<>();
        this.senderList = new ArrayList<>();
        this.stranger = new ArrayList<>();
        this.sessionList = new ArrayList<>();
        this.selfSend = arrayList;
        this.senderList = arrayList2;
        this.stranger = arrayList3;
        this.sessionList = arrayList4;
    }
}
