package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.asv */
public final class asv extends C1331a {
    public C1332b vKc;
    public C1332b vKe;
    public C1332b wwF;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28521);
        int b;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vKe != null) {
                c6093a.mo13473c(1, this.vKe);
            }
            if (this.vKc != null) {
                c6093a.mo13473c(2, this.vKc);
            }
            if (this.wwF != null) {
                c6093a.mo13473c(3, this.wwF);
            }
            AppMethodBeat.m2505o(28521);
            return 0;
        } else if (i == 1) {
            if (this.vKe != null) {
                b = C6091a.m9571b(1, this.vKe) + 0;
            } else {
                b = 0;
            }
            if (this.vKc != null) {
                b += C6091a.m9571b(2, this.vKc);
            }
            if (this.wwF != null) {
                b += C6091a.m9571b(3, this.wwF);
            }
            AppMethodBeat.m2505o(28521);
            return b;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (b = C1331a.getNextFieldNumber(c6086a); b > 0; b = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, b)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(28521);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            asv asv = (asv) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    asv.vKe = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(28521);
                    return 0;
                case 2:
                    asv.vKc = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(28521);
                    return 0;
                case 3:
                    asv.wwF = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(28521);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28521);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28521);
            return -1;
        }
    }
}
