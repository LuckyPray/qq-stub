package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolNoticeContent.class */
public final class GroupSchoolNoticeContent {
    public ArrayList<GroupSchoolNoticeMediaContent> audios;
    public String content;
    public ArrayList<GroupSchoolNoticeMediaContent> files;
    public boolean isTemplate;
    public ArrayList<GroupSchoolNoticeMediaContent> pics;
    public String title;
    public ArrayList<GroupSchoolNoticeMediaContent> videos;

    public GroupSchoolNoticeContent() {
        this.title = "";
        this.content = "";
        this.pics = new ArrayList<>();
        this.audios = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public ArrayList<GroupSchoolNoticeMediaContent> getAudios() {
        return this.audios;
    }

    public String getContent() {
        return this.content;
    }

    public ArrayList<GroupSchoolNoticeMediaContent> getFiles() {
        return this.files;
    }

    public boolean getIsTemplate() {
        return this.isTemplate;
    }

    public ArrayList<GroupSchoolNoticeMediaContent> getPics() {
        return this.pics;
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<GroupSchoolNoticeMediaContent> getVideos() {
        return this.videos;
    }

    public String toString() {
        return "GroupSchoolNoticeContent{title=" + this.title + ",content=" + this.content + ",pics=" + this.pics + ",audios=" + this.audios + ",videos=" + this.videos + ",files=" + this.files + ",isTemplate=" + this.isTemplate + ",}";
    }

    public GroupSchoolNoticeContent(String str, String str2, ArrayList<GroupSchoolNoticeMediaContent> arrayList, ArrayList<GroupSchoolNoticeMediaContent> arrayList2, ArrayList<GroupSchoolNoticeMediaContent> arrayList3, ArrayList<GroupSchoolNoticeMediaContent> arrayList4, boolean z) {
        this.title = "";
        this.content = "";
        this.pics = new ArrayList<>();
        this.audios = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.files = new ArrayList<>();
        this.title = str;
        this.content = str2;
        this.pics = arrayList;
        this.audios = arrayList2;
        this.videos = arrayList3;
        this.files = arrayList4;
        this.isTemplate = z;
    }
}
