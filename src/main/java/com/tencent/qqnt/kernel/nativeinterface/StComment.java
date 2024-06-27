package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StComment.class */
public final class StComment {
    public String clientKey;
    public ArrayList<StRichMsg> content;

    /* renamed from: id */
    public String f45id;
    public ArrayList<StMedia> mediaItems;
    public long replyNum;
    public ArrayList<StReply> replys;
    public long time;
    public StUser user;

    public StComment() {
        this.f45id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.user = new StUser();
        this.content = new ArrayList<>();
        this.replys = new ArrayList<>();
        this.clientKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mediaItems = new ArrayList<>();
    }

    public String getClientKey() {
        return this.clientKey;
    }

    public ArrayList<StRichMsg> getContent() {
        return this.content;
    }

    public String getId() {
        return this.f45id;
    }

    public ArrayList<StMedia> getMediaItems() {
        return this.mediaItems;
    }

    public long getReplyNum() {
        return this.replyNum;
    }

    public ArrayList<StReply> getReplys() {
        return this.replys;
    }

    public long getTime() {
        return this.time;
    }

    public StUser getUser() {
        return this.user;
    }

    public void setClientKey(String str) {
        this.clientKey = str;
    }

    public void setContent(ArrayList<StRichMsg> arrayList) {
        this.content = arrayList;
    }

    public void setId(String str) {
        this.f45id = str;
    }

    public void setMediaItems(ArrayList<StMedia> arrayList) {
        this.mediaItems = arrayList;
    }

    public void setReplyNum(long j) {
        this.replyNum = j;
    }

    public void setReplys(ArrayList<StReply> arrayList) {
        this.replys = arrayList;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setUser(StUser stUser) {
        this.user = stUser;
    }

    public StComment(String str, StUser stUser, ArrayList<StRichMsg> arrayList, long j, ArrayList<StReply> arrayList2, long j2, String str2, ArrayList<StMedia> arrayList3) {
        this.f45id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.user = new StUser();
        this.content = new ArrayList<>();
        this.replys = new ArrayList<>();
        this.clientKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mediaItems = new ArrayList<>();
        this.f45id = str;
        this.user = stUser;
        this.content = arrayList;
        this.time = j;
        this.replys = arrayList2;
        this.replyNum = j2;
        this.clientKey = str2;
        this.mediaItems = arrayList3;
    }
}
