package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.cap */
public final class cap extends C1331a {
    public String jBB;
    public int wCd;
    public String wZP;
    public int wZQ;
    public String wZR;
    public int wZS;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(94565);
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.wZP != null) {
                c6093a.mo13475e(1, this.wZP);
            }
            c6093a.mo13480iz(2, this.wZQ);
            if (this.jBB != null) {
                c6093a.mo13475e(3, this.jBB);
            }
            if (this.wZR != null) {
                c6093a.mo13475e(4, this.wZR);
            }
            c6093a.mo13480iz(5, this.wCd);
            c6093a.mo13480iz(6, this.wZS);
            AppMethodBeat.m2505o(94565);
            return 0;
        } else if (i == 1) {
            if (this.wZP != null) {
                f = C6091a.m9575f(1, this.wZP) + 0;
            } else {
                f = 0;
            }
            f += C6091a.m9572bs(2, this.wZQ);
            if (this.jBB != null) {
                f += C6091a.m9575f(3, this.jBB);
            }
            if (this.wZR != null) {
                f += C6091a.m9575f(4, this.wZR);
            }
            int bs = (f + C6091a.m9572bs(5, this.wCd)) + C6091a.m9572bs(6, this.wZS);
            AppMethodBeat.m2505o(94565);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(94565);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            cap cap = (cap) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cap.wZP = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(94565);
                    return 0;
                case 2:
                    cap.wZQ = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(94565);
                    return 0;
                case 3:
                    cap.jBB = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(94565);
                    return 0;
                case 4:
                    cap.wZR = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(94565);
                    return 0;
                case 5:
                    cap.wCd = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(94565);
                    return 0;
                case 6:
                    cap.wZS = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(94565);
                    return 0;
                default:
                    AppMethodBeat.m2505o(94565);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(94565);
            return -1;
        }
    }
}
