package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.go */
public final class C44122go extends C1331a {
    public long endTime;
    public long startTime;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28324);
        int o;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13472ai(1, this.startTime);
            c6093a.mo13472ai(2, this.endTime);
            AppMethodBeat.m2505o(28324);
            return 0;
        } else if (i == 1) {
            o = (C6091a.m9578o(1, this.startTime) + 0) + C6091a.m9578o(2, this.endTime);
            AppMethodBeat.m2505o(28324);
            return o;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (o = C1331a.getNextFieldNumber(c6086a); o > 0; o = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, o)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(28324);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C44122go c44122go = (C44122go) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    c44122go.startTime = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(28324);
                    return 0;
                case 2:
                    c44122go.endTime = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(28324);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28324);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28324);
            return -1;
        }
    }
}
