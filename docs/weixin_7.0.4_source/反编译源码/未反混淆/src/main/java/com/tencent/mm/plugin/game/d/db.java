package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class db extends a {
    public String Title;
    public String mZi;
    public String mZj;
    public int ndC;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(111669);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.Title != null) {
                aVar.e(1, this.Title);
            }
            if (this.mZj != null) {
                aVar.e(2, this.mZj);
            }
            if (this.mZi != null) {
                aVar.e(3, this.mZi);
            }
            aVar.iz(4, this.ndC);
            AppMethodBeat.o(111669);
            return 0;
        } else if (i == 1) {
            if (this.Title != null) {
                f = e.a.a.b.b.a.f(1, this.Title) + 0;
            } else {
                f = 0;
            }
            if (this.mZj != null) {
                f += e.a.a.b.b.a.f(2, this.mZj);
            }
            if (this.mZi != null) {
                f += e.a.a.b.b.a.f(3, this.mZi);
            }
            int bs = f + e.a.a.b.b.a.bs(4, this.ndC);
            AppMethodBeat.o(111669);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(111669);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            db dbVar = (db) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    dbVar.Title = aVar3.BTU.readString();
                    AppMethodBeat.o(111669);
                    return 0;
                case 2:
                    dbVar.mZj = aVar3.BTU.readString();
                    AppMethodBeat.o(111669);
                    return 0;
                case 3:
                    dbVar.mZi = aVar3.BTU.readString();
                    AppMethodBeat.o(111669);
                    return 0;
                case 4:
                    dbVar.ndC = aVar3.BTU.vd();
                    AppMethodBeat.o(111669);
                    return 0;
                default:
                    AppMethodBeat.o(111669);
                    return -1;
            }
        } else {
            AppMethodBeat.o(111669);
            return -1;
        }
    }
}
