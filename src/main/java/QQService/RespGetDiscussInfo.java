package QQService;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes.dex */
public final class RespGetDiscussInfo extends JceStruct {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static ArrayList<DiscussMemberInfo> cache_Members;
    public long CreateTime;
    public long DiscussFlag;
    public long DiscussUin;
    public long GroupCode;
    public long GroupUin;
    public long InfoSeq;
    public long InteRemarkTimeStamp;
    public ArrayList<DiscussMemberInfo> Members;
    public String Name;
    public long OwnerUin;

    public RespGetDiscussInfo() {
        throw new RuntimeException("stub");
    }

    public String className() {
        throw new RuntimeException("stub");
    }

    public Object clone() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void display(StringBuilder sb, int i2) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(StringBuilder sb, int i2) {
        throw new RuntimeException("stub");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("stub");
    }

    public String fullClassName() {
        throw new RuntimeException("stub");
    }

    public long getDiscussUin() {
        throw new RuntimeException("stub");
    }

    public long getGroupCode() {
        throw new RuntimeException("stub");
    }

    public long getGroupUin() {
        throw new RuntimeException("stub");
    }

    public int hashCode() {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    public void setGroupCode(long j2) {
        throw new RuntimeException("stub");
    }

    public void setGroupUin(long j2) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        throw new RuntimeException("stub");
    }

    public RespGetDiscussInfo(long j2, long j3, long j4, long j5, String str, ArrayList<DiscussMemberInfo> arrayList, long j6, long j7, long j8, long j9) {
        throw new RuntimeException("stub");
    }
}
