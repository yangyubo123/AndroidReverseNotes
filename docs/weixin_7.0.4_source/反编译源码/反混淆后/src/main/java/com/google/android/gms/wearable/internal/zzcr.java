package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil.ResultConverter;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final /* synthetic */ class zzcr implements ResultConverter {
    static final ResultConverter zzbx = new zzcr();

    static {
        AppMethodBeat.m2504i(71167);
        AppMethodBeat.m2505o(71167);
    }

    private zzcr() {
    }

    public final Object convert(Result result) {
        AppMethodBeat.m2504i(71166);
        zzcu zzcu = new zzcu((GetFdForAssetResult) result);
        AppMethodBeat.m2505o(71166);
        return zzcu;
    }
}
