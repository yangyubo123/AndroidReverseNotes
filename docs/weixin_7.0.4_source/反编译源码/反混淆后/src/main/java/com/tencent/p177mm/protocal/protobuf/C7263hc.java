package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.hc */
public final class C7263hc extends C1331a {
    public String vJF;
    public LinkedList<bqr> vJL = new LinkedList();

    public C7263hc() {
        AppMethodBeat.m2504i(56710);
        AppMethodBeat.m2505o(56710);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(56711);
        int f;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vJF != null) {
                c6093a.mo13475e(1, this.vJF);
            }
            c6093a.mo13474e(2, 8, this.vJL);
            AppMethodBeat.m2505o(56711);
            return 0;
        } else if (i == 1) {
            if (this.vJF != null) {
                f = C6091a.m9575f(1, this.vJF) + 0;
            } else {
                f = 0;
            }
            int c = f + C6087a.m9552c(2, 8, this.vJL);
            AppMethodBeat.m2505o(56711);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vJL.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(56711);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C7263hc c7263hc = (C7263hc) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    c7263hc.vJF = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56711);
                    return 0;
                case 2:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bqr bqr = new bqr();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = bqr.populateBuilderWithField(c6086a3, bqr, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c7263hc.vJL.add(bqr);
                    }
                    AppMethodBeat.m2505o(56711);
                    return 0;
                default:
                    AppMethodBeat.m2505o(56711);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(56711);
            return -1;
        }
    }
}
