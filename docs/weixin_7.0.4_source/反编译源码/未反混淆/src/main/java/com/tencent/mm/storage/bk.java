package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import java.util.LinkedList;

public final class bk extends a {
    public LinkedList<bl> xZQ = new LinkedList();

    public bk() {
        AppMethodBeat.i(60208);
        AppMethodBeat.o(60208);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(60209);
        int c;
        byte[] bArr;
        if (i == 0) {
            ((e.a.a.c.a) objArr[0]).e(1, 8, this.xZQ);
            AppMethodBeat.o(60209);
            return 0;
        } else if (i == 1) {
            c = e.a.a.a.c(1, 8, this.xZQ) + 0;
            AppMethodBeat.o(60209);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.xZQ.clear();
            e.a.a.a.a aVar = new e.a.a.a.a(bArr, unknownTagHandler);
            for (c = a.getNextFieldNumber(aVar); c > 0; c = a.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, c)) {
                    aVar.ems();
                }
            }
            AppMethodBeat.o(60209);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar2 = (e.a.a.a.a) objArr[0];
            bk bkVar = (bk) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar2.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bl blVar = new bl();
                        e.a.a.a.a aVar3 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = blVar.populateBuilderWithField(aVar3, blVar, a.getNextFieldNumber(aVar3))) {
                        }
                        bkVar.xZQ.add(blVar);
                    }
                    AppMethodBeat.o(60209);
                    return 0;
                default:
                    AppMethodBeat.o(60209);
                    return -1;
            }
        } else {
            AppMethodBeat.o(60209);
            return -1;
        }
    }
}
