package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import java.util.LinkedList;

public final class qx extends a {
    public int Scene;
    public LinkedList<aax> vYb = new LinkedList();
    public abi vYc;

    public qx() {
        AppMethodBeat.i(51382);
        AppMethodBeat.o(51382);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(51383);
        int c;
        byte[] bArr;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.e(1, 8, this.vYb);
            aVar.iz(2, this.Scene);
            if (this.vYc != null) {
                aVar.iy(3, this.vYc.computeSize());
                this.vYc.writeFields(aVar);
            }
            AppMethodBeat.o(51383);
            return 0;
        } else if (i == 1) {
            c = (e.a.a.a.c(1, 8, this.vYb) + 0) + e.a.a.b.b.a.bs(2, this.Scene);
            if (this.vYc != null) {
                c += e.a.a.a.ix(3, this.vYc.computeSize());
            }
            AppMethodBeat.o(51383);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vYb.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (c = a.getNextFieldNumber(aVar2); c > 0; c = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, c)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(51383);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            qx qxVar = (qx) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        aax aax = new aax();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = aax.populateBuilderWithField(aVar4, aax, a.getNextFieldNumber(aVar4))) {
                        }
                        qxVar.vYb.add(aax);
                    }
                    AppMethodBeat.o(51383);
                    return 0;
                case 2:
                    qxVar.Scene = aVar3.BTU.vd();
                    AppMethodBeat.o(51383);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        abi abi = new abi();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = abi.populateBuilderWithField(aVar4, abi, a.getNextFieldNumber(aVar4))) {
                        }
                        qxVar.vYc = abi;
                    }
                    AppMethodBeat.o(51383);
                    return 0;
                default:
                    AppMethodBeat.o(51383);
                    return -1;
            }
        } else {
            AppMethodBeat.o(51383);
            return -1;
        }
    }
}
