package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class u extends bsr {
    public int scene;
    public String sign;
    public int ver;
    public String vzL;
    public String vzM;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56689);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.vzL != null) {
                aVar.e(2, this.vzL);
            }
            aVar.iz(3, this.scene);
            if (this.vzM != null) {
                aVar.e(4, this.vzM);
            }
            if (this.sign != null) {
                aVar.e(5, this.sign);
            }
            aVar.iz(6, this.ver);
            AppMethodBeat.o(56689);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vzL != null) {
                ix += e.a.a.b.b.a.f(2, this.vzL);
            }
            ix += e.a.a.b.b.a.bs(3, this.scene);
            if (this.vzM != null) {
                ix += e.a.a.b.b.a.f(4, this.vzM);
            }
            if (this.sign != null) {
                ix += e.a.a.b.b.a.f(5, this.sign);
            }
            int bs = ix + e.a.a.b.b.a.bs(6, this.ver);
            AppMethodBeat.o(56689);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(56689);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            u uVar = (u) objArr[1];
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
                        uVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(56689);
                    return 0;
                case 2:
                    uVar.vzL = aVar3.BTU.readString();
                    AppMethodBeat.o(56689);
                    return 0;
                case 3:
                    uVar.scene = aVar3.BTU.vd();
                    AppMethodBeat.o(56689);
                    return 0;
                case 4:
                    uVar.vzM = aVar3.BTU.readString();
                    AppMethodBeat.o(56689);
                    return 0;
                case 5:
                    uVar.sign = aVar3.BTU.readString();
                    AppMethodBeat.o(56689);
                    return 0;
                case 6:
                    uVar.ver = aVar3.BTU.vd();
                    AppMethodBeat.o(56689);
                    return 0;
                default:
                    AppMethodBeat.o(56689);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56689);
            return -1;
        }
    }
}
