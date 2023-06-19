package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class ReqSetCard extends JceStruct {
    static int cache_eSubCmd;
    static ReqHead cache_stHeader;
    static ArrayList<TagInfo> cache_vAddTags;
    static byte[] cache_vBackground;
    static ArrayList<TagInfo> cache_vDelTags;
    static byte[] cache_vReqSetTemplate;
    static ArrayList<TagInfo> cache_vTagsID;
    public byte bIsSingle;
    public int eSubCmd;
    public ReqHead stHeader;
    public ArrayList<TagInfo> vAddTags;
    public byte[] vBackground;
    public ArrayList<TagInfo> vDelTags;
    public byte[] vReqSetTemplate;
    public ArrayList<TagInfo> vTagsID;

    public ReqSetCard() {
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

    public ReqSetCard(ReqHead reqHead, int i2, byte b2, ArrayList<TagInfo> arrayList, byte[] bArr, ArrayList<TagInfo> arrayList2, ArrayList<TagInfo> arrayList3, byte[] bArr2) {
        throw new RuntimeException("stub");
    }
}
