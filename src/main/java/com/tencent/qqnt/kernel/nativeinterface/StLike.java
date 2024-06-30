package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StLike.class */
public final class StLike {
    public int count;

    /* renamed from: id */
    public String f46id;
    public int ownerStatus;
    public StUser postUser;
    public int status;

    public StLike() {
        this.f46id = "";
        this.postUser = new StUser();
    }

    public int getCount() {
        return this.count;
    }

    public String getId() {
        return this.f46id;
    }

    public int getOwnerStatus() {
        return this.ownerStatus;
    }

    public StUser getPostUser() {
        return this.postUser;
    }

    public int getStatus() {
        return this.status;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setId(String str) {
        this.f46id = str;
    }

    public void setOwnerStatus(int i) {
        this.ownerStatus = i;
    }

    public void setPostUser(StUser stUser) {
        this.postUser = stUser;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public StLike(String str, int i, int i2, StUser stUser, int i3) {
        this.f46id = "";
        this.postUser = new StUser();
        this.f46id = str;
        this.count = i;
        this.status = i2;
        this.postUser = stUser;
        this.ownerStatus = i3;
    }
}
