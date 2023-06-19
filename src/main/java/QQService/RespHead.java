package QQService;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespHead extends JceStruct implements Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public int iReplyCode;
    public int iSeq;
    public long lUIN;
    public short shVersion;
    public String strResult;

    public RespHead() {
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

    public int hashCode() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        throw new RuntimeException("stub");
    }

    public RespHead(short s, int i2, long j2, int i3, String str) {
        throw new RuntimeException("stub");
    }
}
