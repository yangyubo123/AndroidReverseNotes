package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.btk */
public final class btk extends C1331a {
    public String cGA;
    public String geY;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(80171);
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.geY != null) {
                c6093a.mo13475e(1, this.geY);
            }
            if (this.cGA != null) {
                c6093a.mo13475e(2, this.cGA);
            }
            AppMethodBeat.m2505o(80171);
            return 0;
        } else if (i == 1) {
            if (this.geY != null) {
                f = C6091a.m9575f(1, this.geY) + 0;
            } else {
                f = 0;
            }
            if (this.cGA != null) {
                f += C6091a.m9575f(2, this.cGA);
            }
            AppMethodBeat.m2505o(80171);
            return f;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(80171);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            btk btk = (btk) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    btk.geY = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(80171);
                    return 0;
                case 2:
                    btk.cGA = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(80171);
                    return 0;
                default:
                    AppMethodBeat.m2505o(80171);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(80171);
            return -1;
        }
    }
}
