package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FileAssistantModel.class */
public final class FileAssistantModel {
    public int chatType;
    public long expTime;
    public String fileName;
    public ArrayList<SearchHitInfo> fileNameHits;
    public String filePath;
    public long fileSize;
    public FileAssistantStatus fileStatus;
    public long fileTime;
    public FileAssistantFileType fileType;

    /* renamed from: id */
    public String f5id;
    public boolean isSend;
    public long msgId;
    public String peerUid;
    public FileAssistantSession session;
    public FileAssistantSource source;
    public String thumbPath;

    public FileAssistantModel() {
        this.f5id = "";
        this.fileName = "";
        this.fileNameHits = new ArrayList<>();
        this.fileStatus = FileAssistantStatus.values()[0];
        this.source = FileAssistantSource.values()[0];
        this.session = new FileAssistantSession();
        this.thumbPath = "";
        this.filePath = "";
        this.peerUid = "";
        this.fileType = FileAssistantFileType.values()[0];
    }

    public int getChatType() {
        return this.chatType;
    }

    public long getExpTime() {
        return this.expTime;
    }

    public String getFileName() {
        return this.fileName;
    }

    public ArrayList<SearchHitInfo> getFileNameHits() {
        return this.fileNameHits;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public FileAssistantStatus getFileStatus() {
        return this.fileStatus;
    }

    public long getFileTime() {
        return this.fileTime;
    }

    public FileAssistantFileType getFileType() {
        return this.fileType;
    }

    public String getId() {
        return this.f5id;
    }

    public boolean getIsSend() {
        return this.isSend;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public FileAssistantSession getSession() {
        return this.session;
    }

    public FileAssistantSource getSource() {
        return this.source;
    }

    public String getThumbPath() {
        return this.thumbPath;
    }

    public String toString() {
        return "FileAssistantModel{id=" + this.f5id + ",fileName=" + this.fileName + ",fileNameHits=" + this.fileNameHits + ",fileStatus=" + this.fileStatus + ",fileSize=" + this.fileSize + ",isSend=" + this.isSend + ",source=" + this.source + ",fileTime=" + this.fileTime + ",expTime=" + this.expTime + ",session=" + this.session + ",thumbPath=" + this.thumbPath + ",filePath=" + this.filePath + ",msgId=" + this.msgId + ",chatType=" + this.chatType + ",peerUid=" + this.peerUid + ",fileType=" + this.fileType + ",}";
    }

    public FileAssistantModel(String str, String str2, ArrayList<SearchHitInfo> arrayList, FileAssistantStatus fileAssistantStatus, long j, boolean z, FileAssistantSource fileAssistantSource, long j2, long j3, FileAssistantSession fileAssistantSession, String str3, String str4, long j4, int i, String str5, FileAssistantFileType fileAssistantFileType) {
        this.f5id = "";
        this.fileName = "";
        this.fileNameHits = new ArrayList<>();
        this.fileStatus = FileAssistantStatus.values()[0];
        this.source = FileAssistantSource.values()[0];
        this.session = new FileAssistantSession();
        this.thumbPath = "";
        this.filePath = "";
        this.peerUid = "";
        this.fileType = FileAssistantFileType.values()[0];
        this.f5id = str;
        this.fileName = str2;
        this.fileNameHits = arrayList;
        this.fileStatus = fileAssistantStatus;
        this.fileSize = j;
        this.isSend = z;
        this.source = fileAssistantSource;
        this.fileTime = j2;
        this.expTime = j3;
        this.session = fileAssistantSession;
        this.thumbPath = str3;
        this.filePath = str4;
        this.msgId = j4;
        this.chatType = i;
        this.peerUid = str5;
        this.fileType = fileAssistantFileType;
    }
}
