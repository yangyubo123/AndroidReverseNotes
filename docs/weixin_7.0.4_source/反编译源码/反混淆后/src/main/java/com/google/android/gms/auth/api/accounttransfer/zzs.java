package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class zzs implements Creator<zzr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        AppMethodBeat.m2504i(77015);
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    list5 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 3:
                    list4 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 4:
                    list3 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 5:
                    list2 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 6:
                    list = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        zzr zzr = new zzr(i, list5, list4, list3, list2, list);
        AppMethodBeat.m2505o(77015);
        return zzr;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
