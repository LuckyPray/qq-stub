package NS_MINI_INTERFACE;

import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBStringField;

/* compiled from: P */
/* loaded from: classes.dex */
public final class INTERFACE$StApiUserInfo extends MessageMicro<INTERFACE$StApiUserInfo> {
    static final FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[]{10, 18, 24, 34, 42, 50}, new String[]{"nick", "avatar", "gender", "address", "language", "openid"}, new Object[]{"", "", 0, null, "", ""}, INTERFACE$StApiUserInfo.class);
    public final PBStringField nick = PBField.initString("");
    public final PBStringField avatar = PBField.initString("");
    public final PBInt32Field gender = PBField.initInt32(0);
    public INTERFACE$StAddressInfo address = new INTERFACE$StAddressInfo();
    public final PBStringField language = PBField.initString("");
    public final PBStringField openid = PBField.initString("");
}
