package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class bbh extends a {
    public String desc;
    public String kbV;
    public String path;
    public String title;
    public String username;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56854);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.kbV != null) {
                aVar.e(1, this.kbV);
            }
            if (this.title != null) {
                aVar.e(2, this.title);
            }
            if (this.desc != null) {
                aVar.e(3, this.desc);
            }
            if (this.username != null) {
                aVar.e(4, this.username);
            }
            if (this.path != null) {
                aVar.e(5, this.path);
            }
            AppMethodBeat.o(56854);
            return 0;
        } else if (i == 1) {
            if (this.kbV != null) {
                f = e.a.a.b.b.a.f(1, this.kbV) + 0;
            } else {
                f = 0;
            }
            if (this.title != null) {
                f += e.a.a.b.b.a.f(2, this.title);
            }
            if (this.desc != null) {
                f += e.a.a.b.b.a.f(3, this.desc);
            }
            if (this.username != null) {
                f += e.a.a.b.b.a.f(4, this.username);
            }
            if (this.path != null) {
                f += e.a.a.b.b.a.f(5, this.path);
            }
            AppMethodBeat.o(56854);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(56854);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bbh bbh = (bbh) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bbh.kbV = aVar3.BTU.readString();
                    AppMethodBeat.o(56854);
                    return 0;
                case 2:
                    bbh.title = aVar3.BTU.readString();
                    AppMethodBeat.o(56854);
                    return 0;
                case 3:
                    bbh.desc = aVar3.BTU.readString();
                    AppMethodBeat.o(56854);
                    return 0;
                case 4:
                    bbh.username = aVar3.BTU.readString();
                    AppMethodBeat.o(56854);
                    return 0;
                case 5:
                    bbh.path = aVar3.BTU.readString();
                    AppMethodBeat.o(56854);
                    return 0;
                default:
                    AppMethodBeat.o(56854);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56854);
            return -1;
        }
    }
}
