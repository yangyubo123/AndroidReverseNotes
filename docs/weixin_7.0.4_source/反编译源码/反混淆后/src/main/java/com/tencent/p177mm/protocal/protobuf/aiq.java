package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.aiq */
public final class aiq extends btd {
    public LinkedList<C30177dq> vHk = new LinkedList();
    public int woD;
    public int woE;
    public LinkedList<Integer> woF = new LinkedList();
    public LinkedList<C35969zf> woG = new LinkedList();
    public int woH;

    public aiq() {
        AppMethodBeat.m2504i(73653);
        AppMethodBeat.m2505o(73653);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(73654);
        C6092b c6092b;
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(73654);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.woD);
            c6093a.mo13480iz(3, this.woE);
            c6093a.mo13474e(4, 2, this.woF);
            c6093a.mo13474e(5, 8, this.woG);
            c6093a.mo13480iz(6, this.woH);
            c6093a.mo13474e(7, 8, this.vHk);
            AppMethodBeat.m2505o(73654);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int bs = (((((ix + C6091a.m9572bs(2, this.woD)) + C6091a.m9572bs(3, this.woE)) + C6087a.m9552c(4, 2, this.woF)) + C6087a.m9552c(5, 8, this.woG)) + C6091a.m9572bs(6, this.woH)) + C6087a.m9552c(7, 8, this.vHk);
            AppMethodBeat.m2505o(73654);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.woF.clear();
            this.woG.clear();
            this.vHk.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(73654);
                throw c6092b;
            }
            AppMethodBeat.m2505o(73654);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            aiq aiq = (aiq) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        aiq.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(73654);
                    return 0;
                case 2:
                    aiq.woD = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(73654);
                    return 0;
                case 3:
                    aiq.woE = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(73654);
                    return 0;
                case 4:
                    aiq.woF.add(Integer.valueOf(c6086a2.BTU.mo13458vd()));
                    AppMethodBeat.m2505o(73654);
                    return 0;
                case 5:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C35969zf c35969zf = new C35969zf();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c35969zf.populateBuilderWithField(c6086a3, c35969zf, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        aiq.woG.add(c35969zf);
                    }
                    AppMethodBeat.m2505o(73654);
                    return 0;
                case 6:
                    aiq.woH = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(73654);
                    return 0;
                case 7:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C30177dq c30177dq = new C30177dq();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c30177dq.populateBuilderWithField(c6086a3, c30177dq, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        aiq.vHk.add(c30177dq);
                    }
                    AppMethodBeat.m2505o(73654);
                    return 0;
                default:
                    AppMethodBeat.m2505o(73654);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(73654);
            return -1;
        }
    }
}
