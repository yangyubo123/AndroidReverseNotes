package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class cpz extends bsr {
    public String wPm;
    public int wem;
    public long wen;
    public long xlQ;
    public cqf xmK;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(5265);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.xmK == null) {
                bVar = new b("Not all required fields were included: ReportData");
                AppMethodBeat.o(5265);
                throw bVar;
            }
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.wPm != null) {
                aVar.e(2, this.wPm);
            }
            aVar.iz(3, this.wem);
            aVar.ai(4, this.wen);
            if (this.xmK != null) {
                aVar.iy(5, this.xmK.computeSize());
                this.xmK.writeFields(aVar);
            }
            aVar.ai(6, this.xlQ);
            AppMethodBeat.o(5265);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.wPm != null) {
                ix += e.a.a.b.b.a.f(2, this.wPm);
            }
            ix = (ix + e.a.a.b.b.a.bs(3, this.wem)) + e.a.a.b.b.a.o(4, this.wen);
            if (this.xmK != null) {
                ix += e.a.a.a.ix(5, this.xmK.computeSize());
            }
            int o = ix + e.a.a.b.b.a.o(6, this.xlQ);
            AppMethodBeat.o(5265);
            return o;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.xmK == null) {
                bVar = new b("Not all required fields were included: ReportData");
                AppMethodBeat.o(5265);
                throw bVar;
            }
            AppMethodBeat.o(5265);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cpz cpz = (cpz) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cpz.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(5265);
                    return 0;
                case 2:
                    cpz.wPm = aVar3.BTU.readString();
                    AppMethodBeat.o(5265);
                    return 0;
                case 3:
                    cpz.wem = aVar3.BTU.vd();
                    AppMethodBeat.o(5265);
                    return 0;
                case 4:
                    cpz.wen = aVar3.BTU.ve();
                    AppMethodBeat.o(5265);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cqf cqf = new cqf();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cqf.populateBuilderWithField(aVar4, cqf, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cpz.xmK = cqf;
                    }
                    AppMethodBeat.o(5265);
                    return 0;
                case 6:
                    cpz.xlQ = aVar3.BTU.ve();
                    AppMethodBeat.o(5265);
                    return 0;
                default:
                    AppMethodBeat.o(5265);
                    return -1;
            }
        } else {
            AppMethodBeat.o(5265);
            return -1;
        }
    }
}
