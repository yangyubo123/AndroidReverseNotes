package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aoy extends bsr {
    public String csB;
    public int vSb;
    public String wsY;
    public String wsZ;
    public int wta;
    public int wtb = 4;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(96228);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.csB != null) {
                aVar.e(2, this.csB);
            }
            if (this.wsY != null) {
                aVar.e(3, this.wsY);
            }
            if (this.wsZ != null) {
                aVar.e(4, this.wsZ);
            }
            aVar.iz(5, this.vSb);
            aVar.iz(6, this.wta);
            aVar.iz(7, this.wtb);
            AppMethodBeat.o(96228);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.csB != null) {
                ix += e.a.a.b.b.a.f(2, this.csB);
            }
            if (this.wsY != null) {
                ix += e.a.a.b.b.a.f(3, this.wsY);
            }
            if (this.wsZ != null) {
                ix += e.a.a.b.b.a.f(4, this.wsZ);
            }
            int bs = ((ix + e.a.a.b.b.a.bs(5, this.vSb)) + e.a.a.b.b.a.bs(6, this.wta)) + e.a.a.b.b.a.bs(7, this.wtb);
            AppMethodBeat.o(96228);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(96228);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aoy aoy = (aoy) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aoy.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(96228);
                    return 0;
                case 2:
                    aoy.csB = aVar3.BTU.readString();
                    AppMethodBeat.o(96228);
                    return 0;
                case 3:
                    aoy.wsY = aVar3.BTU.readString();
                    AppMethodBeat.o(96228);
                    return 0;
                case 4:
                    aoy.wsZ = aVar3.BTU.readString();
                    AppMethodBeat.o(96228);
                    return 0;
                case 5:
                    aoy.vSb = aVar3.BTU.vd();
                    AppMethodBeat.o(96228);
                    return 0;
                case 6:
                    aoy.wta = aVar3.BTU.vd();
                    AppMethodBeat.o(96228);
                    return 0;
                case 7:
                    aoy.wtb = aVar3.BTU.vd();
                    AppMethodBeat.o(96228);
                    return 0;
                default:
                    AppMethodBeat.o(96228);
                    return -1;
            }
        } else {
            AppMethodBeat.o(96228);
            return -1;
        }
    }
}
