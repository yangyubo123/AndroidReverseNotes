package com.tencent.p177mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.aff;
import com.tencent.p177mm.protocal.protobuf.afg;
import com.tencent.p177mm.protocal.protobuf.atz;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.webview.model.l */
public final class C43921l extends C1207m implements C1918k {
    private C1202f ehi;
    public final C7472b fAT;

    public C43921l(List<atz> list, String str) {
        AppMethodBeat.m2504i(6598);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new aff();
        c1196a.fsK = new afg();
        c1196a.uri = "/cgi-bin/mmo2o-bin/getbeaconsingroup";
        this.fAT = c1196a.acD();
        aff aff = (aff) this.fAT.fsG.fsP;
        aff.wmF.addAll(list);
        aff.csB = str;
        C4990ab.m7417i("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang]getBeaconsInGroupRequest.beacons.size:%d", Integer.valueOf(aff.wmF.size()));
        AppMethodBeat.m2505o(6598);
    }

    public final int getType() {
        return 1704;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(6599);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.fAT, this);
        AppMethodBeat.m2505o(6599);
        return a;
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(6600);
        C4990ab.m7417i("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang][NetSceneGetBeaconSinGroup]:netId:%s,errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C4990ab.m7410d("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang][NetSceneGetBeaconSinGroup]:net end ok");
        } else {
            C4990ab.m7410d("MicroMsg.NetSceneGetBeaconSinGroup", "[oneliang][NetSceneGetBeaconSinGroup]:net end not ok");
        }
        this.ehi.onSceneEnd(i2, i3, str, this);
        AppMethodBeat.m2505o(6600);
    }
}
