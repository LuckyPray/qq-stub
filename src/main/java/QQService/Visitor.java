package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;

/* compiled from: P */
/* loaded from: classes.dex */
public final class Visitor extends JceStruct {
    static FaceInfo cache_stFace;
    static byte[] cache_vecNick;
    public int iFaceID;
    public long lUIN;
    public FaceInfo stFace;
    public String strNick;
    public byte[] vecNick;

    public Visitor() {
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

    public Visitor(long j2, FaceInfo faceInfo, int i2, String str, byte[] bArr) {
        throw new RuntimeException("stub");
    }
}
