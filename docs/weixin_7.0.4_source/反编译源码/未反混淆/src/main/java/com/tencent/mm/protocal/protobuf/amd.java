package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class amd extends btd {
    public LinkedList<biu> wrh = new LinkedList();
    public b wri;
    public b wrj;

    public amd() {
        AppMethodBeat.i(56825);
        AppMethodBeat.o(56825);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56826);
        e.a.a.b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new e.a.a.b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56826);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.e(2, 8, this.wrh);
            if (this.wri != null) {
                aVar.c(3, this.wri);
            }
            if (this.wrj != null) {
                aVar.c(4, this.wrj);
            }
            AppMethodBeat.o(56826);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.a.c(2, 8, this.wrh);
            if (this.wri != null) {
                ix += e.a.a.b.b.a.b(3, this.wri);
            }
            if (this.wrj != null) {
                ix += e.a.a.b.b.a.b(4, this.wrj);
            }
            AppMethodBeat.o(56826);
            return ix;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wrh.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new e.a.a.b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56826);
                throw bVar;
            }
            AppMethodBeat.o(56826);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            amd amd = (amd) objArr[1];
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
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        amd.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(56826);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        biu biu = new biu();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = biu.populateBuilderWithField(aVar4, biu, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        amd.wrh.add(biu);
                    }
                    AppMethodBeat.o(56826);
                    return 0;
                case 3:
                    amd.wri = aVar3.BTU.emu();
                    AppMethodBeat.o(56826);
                    return 0;
                case 4:
                    amd.wrj = aVar3.BTU.emu();
                    AppMethodBeat.o(56826);
                    return 0;
                default:
                    AppMethodBeat.o(56826);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56826);
            return -1;
        }
    }
}
