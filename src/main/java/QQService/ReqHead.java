package QQService;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqHead extends JceStruct implements Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static byte[] cache_vCookies;
    public byte bReqType;
    public byte bTriggered;
    public int iSeq;
    public long lUIN;
    public short shVersion;
    public byte[] vCookies;

    public ReqHead() {
        throw new RuntimeException("stub");
    }

    public Object clone() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void display(StringBuilder sb, int i2) {
        throw new RuntimeException("stub");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("stub");
    }

    public byte getBReqType() {
        throw new RuntimeException("stub");
    }

    public byte getBTriggered() {
        throw new RuntimeException("stub");
    }

    public int getISeq() {
        throw new RuntimeException("stub");
    }

    public long getLUIN() {
        throw new RuntimeException("stub");
    }

    public short getShVersion() {
        throw new RuntimeException("stub");
    }

    public byte[] getVCookies() {
        throw new RuntimeException("stub");
    }

    public int hashCode() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    public void setBReqType(byte b2) {
        throw new RuntimeException("stub");
    }

    public void setBTriggered(byte b2) {
        throw new RuntimeException("stub");
    }

    public void setISeq(int i2) {
        throw new RuntimeException("stub");
    }

    public void setLUIN(long j2) {
        throw new RuntimeException("stub");
    }

    public void setShVersion(short s) {
        throw new RuntimeException("stub");
    }

    public void setVCookies(byte[] bArr) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        throw new RuntimeException("stub");
    }

    public ReqHead(long j2, short s, int i2, byte b2, byte b3, byte[] bArr) {
        throw new RuntimeException("stub");
    }
}
