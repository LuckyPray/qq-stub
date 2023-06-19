package NS_MINI_INTERFACE;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;

/* loaded from: classes.dex */
public final class INTERFACE$StGetProfileReq extends MessageMicro<INTERFACE$StGetProfileReq> {
    static final FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 16, 26}, new String[]{"appid", "withCredentials", "lang"}, new Object[]{"", 0, ""}, INTERFACE$StGetProfileReq.class);
    public final PBStringField appid = PBField.initString("");
    public final PBInt32Field withCredentials = PBField.initInt32(0);
    public final PBStringField lang = PBField.initString("");
}
