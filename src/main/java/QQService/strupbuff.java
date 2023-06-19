package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: P */
/* loaded from: classes.dex */
public final class strupbuff extends JceStruct {
    static Map<String, ArrayList<byte[]>> cache_logstring;
    public byte encoding;
    public Map<String, ArrayList<byte[]>> logstring;
    public String prefix;
    public int seqno;

    public strupbuff() {
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

    public strupbuff(Map<String, ArrayList<byte[]>> map, String str, byte b2, int i2) {
        throw new RuntimeException("stub");
    }
}
