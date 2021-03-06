package com.tencent.p177mm.plugin.backup.bakoldlogic.p343c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.plugin.appbrand.jsapi.p299b.C42478j;
import com.tencent.p177mm.protocal.C4851z;
import com.tencent.p177mm.protocal.protobuf.aet;
import com.tencent.p177mm.protocal.protobuf.aeu;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.c.e */
public final class C6790e extends C1207m implements C1918k {
    private final C7472b ehh;
    private C1202f ehi;
    /* renamed from: id */
    private final String f1967id;
    public byte[] jAn;

    public C6790e(String str) {
        AppMethodBeat.m2504i(17891);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new aet();
        c1196a.fsK = new aeu();
        c1196a.uri = "/cgi-bin/micromsg-bin/getbakchatkey";
        c1196a.fsI = C42478j.CTRL_INDEX;
        this.ehh = c1196a.acD();
        aet aet = (aet) this.ehh.fsG.fsP;
        aet.f16203ID = str;
        aet.wmw = C4851z.dmx().ver;
        this.f1967id = str;
        C4990ab.m7417i("MicroMsg.NetSceneGetBakchatkey", "init id:%s, ver:0x%x", aet.f16203ID, Integer.valueOf(aet.wmw));
        AppMethodBeat.m2505o(17891);
    }

    public final void cancel() {
        AppMethodBeat.m2504i(17892);
        super.cancel();
        AppMethodBeat.m2505o(17892);
    }

    public final int getType() {
        return C42478j.CTRL_INDEX;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(17893);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.ehh, this);
        AppMethodBeat.m2505o(17893);
        return a;
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(17894);
        C4990ab.m7417i("MicroMsg.NetSceneGetBakchatkey", "errType %d,  errCode %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            int i4;
            this.jAn = ((aeu) this.ehh.fsH.fsP).vIn.getBuffer().f1226wR;
            String str2 = "MicroMsg.NetSceneGetBakchatkey";
            String str3 = "id:%s,  key len:%d";
            Object[] objArr = new Object[2];
            objArr[0] = this.f1967id;
            if (this.jAn == null) {
                i4 = 0;
            } else {
                i4 = this.jAn.length;
            }
            objArr[1] = Integer.valueOf(i4);
            C4990ab.m7417i(str2, str3, objArr);
            if (this.jAn != null) {
                str2 = "";
                for (byte b : this.jAn) {
                    str2 = str2 + Integer.toHexString(b & 255) + " ";
                }
                C4990ab.m7417i("MicroMsg.NetSceneGetBakchatkey", "dump bakchat: %s", str2);
            }
        }
        this.ehi.onSceneEnd(i2, i3, str, this);
        AppMethodBeat.m2505o(17894);
    }
}
