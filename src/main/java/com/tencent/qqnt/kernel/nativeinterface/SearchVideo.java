package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchVideo.class */
public final class SearchVideo {
    public SearchStFeed feed = new SearchStFeed();
    public byte[] rawData = new byte[0];
    public SearchJump jumpLink = new SearchJump();

    public SearchStFeed getFeed() {
        return this.feed;
    }

    public SearchJump getJumpLink() {
        return this.jumpLink;
    }

    public byte[] getRawData() {
        return this.rawData;
    }

    public String toString() {
        return "SearchVideo{feed=" + this.feed + ",rawData=" + this.rawData + ",jumpLink=" + this.jumpLink + ",}";
    }
}
