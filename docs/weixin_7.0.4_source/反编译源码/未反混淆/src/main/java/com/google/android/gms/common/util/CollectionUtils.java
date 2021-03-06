package com.google.android.gms.common.util;

import android.support.v4.f.a;
import android.support.v4.f.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static <K, V> Map<K, V> inOrderMapOf() {
        AppMethodBeat.i(90107);
        Map mapOf = mapOf();
        AppMethodBeat.o(90107);
        return mapOf;
    }

    public static <K, V> Map<K, V> inOrderMapOf(K k, V v) {
        AppMethodBeat.i(90108);
        Map mapOf = mapOf(k, v);
        AppMethodBeat.o(90108);
        return mapOf;
    }

    public static <K, V> Map<K, V> inOrderMapOf(K k, V v, K k2, V v2) {
        AppMethodBeat.i(90109);
        Map zzg = zzg(2, false);
        zzg.put(k, v);
        zzg.put(k2, v2);
        zzg = Collections.unmodifiableMap(zzg);
        AppMethodBeat.o(90109);
        return zzg;
    }

    public static <K, V> Map<K, V> inOrderMapOf(K k, V v, K k2, V v2, K k3, V v3) {
        AppMethodBeat.i(90110);
        Map zzg = zzg(3, false);
        zzg.put(k, v);
        zzg.put(k2, v2);
        zzg.put(k3, v3);
        zzg = Collections.unmodifiableMap(zzg);
        AppMethodBeat.o(90110);
        return zzg;
    }

    public static <K, V> Map<K, V> inOrderMapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        AppMethodBeat.i(90111);
        Map zzg = zzg(4, false);
        zzg.put(k, v);
        zzg.put(k2, v2);
        zzg.put(k3, v3);
        zzg.put(k4, v4);
        zzg = Collections.unmodifiableMap(zzg);
        AppMethodBeat.o(90111);
        return zzg;
    }

    public static <K, V> Map<K, V> inOrderMapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        AppMethodBeat.i(90112);
        Map zzg = zzg(5, false);
        zzg.put(k, v);
        zzg.put(k2, v2);
        zzg.put(k3, v3);
        zzg.put(k4, v4);
        zzg.put(k5, v5);
        zzg = Collections.unmodifiableMap(zzg);
        AppMethodBeat.o(90112);
        return zzg;
    }

    public static <K, V> Map<K, V> inOrderMapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        AppMethodBeat.i(90113);
        Map zzg = zzg(6, false);
        zzg.put(k, v);
        zzg.put(k2, v2);
        zzg.put(k3, v3);
        zzg.put(k4, v4);
        zzg.put(k5, v5);
        zzg.put(k6, v6);
        zzg = Collections.unmodifiableMap(zzg);
        AppMethodBeat.o(90113);
        return zzg;
    }

    public static <K, V> Map<K, V> inOrderMapOfKeyValueArrays(K[] kArr, V[] vArr) {
        AppMethodBeat.i(90114);
        zza(kArr, vArr);
        int length = kArr.length;
        Map inOrderMapOf;
        switch (length) {
            case 0:
                inOrderMapOf = inOrderMapOf();
                AppMethodBeat.o(90114);
                return inOrderMapOf;
            case 1:
                inOrderMapOf = inOrderMapOf(kArr[0], vArr[0]);
                AppMethodBeat.o(90114);
                return inOrderMapOf;
            default:
                inOrderMapOf = Collections.unmodifiableMap(zzb(length, false, kArr, vArr));
                AppMethodBeat.o(90114);
                return inOrderMapOf;
        }
    }

    public static <T> Set<T> inOrderSetOf() {
        AppMethodBeat.i(90071);
        Set of = setOf();
        AppMethodBeat.o(90071);
        return of;
    }

    public static <T> Set<T> inOrderSetOf(T t) {
        AppMethodBeat.i(90072);
        Set of = setOf((Object) t);
        AppMethodBeat.o(90072);
        return of;
    }

    public static <T> Set<T> inOrderSetOf(T t, T t2) {
        AppMethodBeat.i(90073);
        Set zze = zze(2, false);
        zze.add(t);
        zze.add(t2);
        zze = Collections.unmodifiableSet(zze);
        AppMethodBeat.o(90073);
        return zze;
    }

    public static <T> Set<T> inOrderSetOf(T t, T t2, T t3) {
        AppMethodBeat.i(90074);
        Set zze = zze(3, false);
        zze.add(t);
        zze.add(t2);
        zze.add(t3);
        zze = Collections.unmodifiableSet(zze);
        AppMethodBeat.o(90074);
        return zze;
    }

    public static <T> Set<T> inOrderSetOf(T t, T t2, T t3, T t4) {
        AppMethodBeat.i(90075);
        Set zze = zze(4, false);
        zze.add(t);
        zze.add(t2);
        zze.add(t3);
        zze.add(t4);
        zze = Collections.unmodifiableSet(zze);
        AppMethodBeat.o(90075);
        return zze;
    }

    public static <T> Set<T> inOrderSetOf(T... tArr) {
        AppMethodBeat.i(90076);
        Set inOrderSetOf;
        switch (tArr.length) {
            case 0:
                inOrderSetOf = inOrderSetOf();
                AppMethodBeat.o(90076);
                return inOrderSetOf;
            case 1:
                inOrderSetOf = inOrderSetOf(tArr[0]);
                AppMethodBeat.o(90076);
                return inOrderSetOf;
            case 2:
                inOrderSetOf = inOrderSetOf(tArr[0], tArr[1]);
                AppMethodBeat.o(90076);
                return inOrderSetOf;
            case 3:
                inOrderSetOf = inOrderSetOf(tArr[0], tArr[1], tArr[2]);
                AppMethodBeat.o(90076);
                return inOrderSetOf;
            case 4:
                inOrderSetOf = inOrderSetOf(tArr[0], tArr[1], tArr[2], tArr[3]);
                AppMethodBeat.o(90076);
                return inOrderSetOf;
            default:
                inOrderSetOf = Collections.unmodifiableSet(zzb(tArr.length, false, tArr));
                AppMethodBeat.o(90076);
                return inOrderSetOf;
        }
    }

    public static boolean isEmpty(Collection<?> collection) {
        AppMethodBeat.i(90047);
        if (collection == null) {
            AppMethodBeat.o(90047);
            return true;
        }
        boolean isEmpty = collection.isEmpty();
        AppMethodBeat.o(90047);
        return isEmpty;
    }

    public static boolean isEmpty(Map<?, ?> map) {
        AppMethodBeat.i(90048);
        if (map == null) {
            AppMethodBeat.o(90048);
            return true;
        }
        boolean isEmpty = map.isEmpty();
        AppMethodBeat.o(90048);
        return isEmpty;
    }

    @Deprecated
    public static <T> List<T> listOf() {
        AppMethodBeat.i(90050);
        List emptyList = Collections.emptyList();
        AppMethodBeat.o(90050);
        return emptyList;
    }

    @Deprecated
    public static <T> List<T> listOf(T t) {
        AppMethodBeat.i(90051);
        List singletonList = Collections.singletonList(t);
        AppMethodBeat.o(90051);
        return singletonList;
    }

    @Deprecated
    public static <T> List<T> listOf(T... tArr) {
        AppMethodBeat.i(90052);
        List listOf;
        switch (tArr.length) {
            case 0:
                listOf = listOf();
                AppMethodBeat.o(90052);
                return listOf;
            case 1:
                listOf = listOf(tArr[0]);
                AppMethodBeat.o(90052);
                return listOf;
            default:
                listOf = Collections.unmodifiableList(Arrays.asList(tArr));
                AppMethodBeat.o(90052);
                return listOf;
        }
    }

    public static <K, V> Map<K, V> mapOf() {
        AppMethodBeat.i(90097);
        Map emptyMap = Collections.emptyMap();
        AppMethodBeat.o(90097);
        return emptyMap;
    }

    public static <K, V> Map<K, V> mapOf(K k, V v) {
        AppMethodBeat.i(90098);
        Map singletonMap = Collections.singletonMap(k, v);
        AppMethodBeat.o(90098);
        return singletonMap;
    }

    public static <K, V> Map<K, V> mapOf(K k, V v, K k2, V v2) {
        AppMethodBeat.i(90099);
        Map zzf = zzf(2, false);
        zzf.put(k, v);
        zzf.put(k2, v2);
        zzf = Collections.unmodifiableMap(zzf);
        AppMethodBeat.o(90099);
        return zzf;
    }

    public static <K, V> Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3) {
        AppMethodBeat.i(90100);
        Map zzf = zzf(3, false);
        zzf.put(k, v);
        zzf.put(k2, v2);
        zzf.put(k3, v3);
        zzf = Collections.unmodifiableMap(zzf);
        AppMethodBeat.o(90100);
        return zzf;
    }

    public static <K, V> Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        AppMethodBeat.i(90101);
        Map zzf = zzf(4, false);
        zzf.put(k, v);
        zzf.put(k2, v2);
        zzf.put(k3, v3);
        zzf.put(k4, v4);
        zzf = Collections.unmodifiableMap(zzf);
        AppMethodBeat.o(90101);
        return zzf;
    }

    public static <K, V> Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        AppMethodBeat.i(90102);
        Map zzf = zzf(5, false);
        zzf.put(k, v);
        zzf.put(k2, v2);
        zzf.put(k3, v3);
        zzf.put(k4, v4);
        zzf.put(k5, v5);
        zzf = Collections.unmodifiableMap(zzf);
        AppMethodBeat.o(90102);
        return zzf;
    }

    public static <K, V> Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        AppMethodBeat.i(90103);
        Map zzf = zzf(6, false);
        zzf.put(k, v);
        zzf.put(k2, v2);
        zzf.put(k3, v3);
        zzf.put(k4, v4);
        zzf.put(k5, v5);
        zzf.put(k6, v6);
        zzf = Collections.unmodifiableMap(zzf);
        AppMethodBeat.o(90103);
        return zzf;
    }

    public static <K, V> Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        AppMethodBeat.i(90104);
        zza(kArr, vArr);
        Map mapOf;
        switch (kArr.length) {
            case 0:
                mapOf = mapOf();
                AppMethodBeat.o(90104);
                return mapOf;
            case 1:
                mapOf = mapOf(kArr[0], vArr[0]);
                AppMethodBeat.o(90104);
                return mapOf;
            default:
                mapOf = Collections.unmodifiableMap(zza(kArr.length, false, kArr, vArr));
                AppMethodBeat.o(90104);
                return mapOf;
        }
    }

    public static <K, V> Map<K, V> mutableInOrderMapOf() {
        AppMethodBeat.i(90130);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AppMethodBeat.o(90130);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> mutableInOrderMapOf(K k, V v) {
        AppMethodBeat.i(90131);
        Map mutableInOrderMapOfWithSize = mutableInOrderMapOfWithSize(1, k, v);
        AppMethodBeat.o(90131);
        return mutableInOrderMapOfWithSize;
    }

    public static <K, V> Map<K, V> mutableInOrderMapOf(K k, V v, K k2, V v2) {
        AppMethodBeat.i(90132);
        Map mutableInOrderMapOfWithSize = mutableInOrderMapOfWithSize(2, k, v, k2, v2);
        AppMethodBeat.o(90132);
        return mutableInOrderMapOfWithSize;
    }

    public static <K, V> Map<K, V> mutableInOrderMapOf(K k, V v, K k2, V v2, K k3, V v3) {
        AppMethodBeat.i(90133);
        Map mutableInOrderMapOfWithSize = mutableInOrderMapOfWithSize(3, k, v, k2, v2, k3, v3);
        AppMethodBeat.o(90133);
        return mutableInOrderMapOfWithSize;
    }

    public static <K, V> Map<K, V> mutableInOrderMapOfKeyValueArrays(K[] kArr, V[] vArr) {
        AppMethodBeat.i(90134);
        zza(kArr, vArr);
        int length = kArr.length;
        Map mutableInOrderMapOf;
        if (length == 0) {
            mutableInOrderMapOf = mutableInOrderMapOf();
            AppMethodBeat.o(90134);
            return mutableInOrderMapOf;
        }
        mutableInOrderMapOf = zzb(length, true, kArr, vArr);
        AppMethodBeat.o(90134);
        return mutableInOrderMapOf;
    }

    public static <K, V> Map<K, V> mutableInOrderMapOfKeyValueArraysWithSize(int i, K[] kArr, V[] vArr) {
        AppMethodBeat.i(90129);
        zza(kArr, vArr);
        int max = Math.max(i, kArr.length);
        Map mutableInOrderMapOf;
        if (max == 0) {
            mutableInOrderMapOf = mutableInOrderMapOf();
            AppMethodBeat.o(90129);
            return mutableInOrderMapOf;
        } else if (kArr.length == 0) {
            mutableInOrderMapOf = mutableInOrderMapOfWithSize(max);
            AppMethodBeat.o(90129);
            return mutableInOrderMapOf;
        } else {
            mutableInOrderMapOf = zzb(i, true, kArr, vArr);
            AppMethodBeat.o(90129);
            return mutableInOrderMapOf;
        }
    }

    public static <K, V> Map<K, V> mutableInOrderMapOfWithSize(int i) {
        AppMethodBeat.i(90125);
        Map mutableInOrderMapOf;
        if (i == 0) {
            mutableInOrderMapOf = mutableInOrderMapOf();
            AppMethodBeat.o(90125);
            return mutableInOrderMapOf;
        }
        mutableInOrderMapOf = zzg(i, true);
        AppMethodBeat.o(90125);
        return mutableInOrderMapOf;
    }

    public static <K, V> Map<K, V> mutableInOrderMapOfWithSize(int i, K k, V v) {
        AppMethodBeat.i(90126);
        Map zzg = zzg(Math.max(i, 1), true);
        zzg.put(k, v);
        AppMethodBeat.o(90126);
        return zzg;
    }

    public static <K, V> Map<K, V> mutableInOrderMapOfWithSize(int i, K k, V v, K k2, V v2) {
        AppMethodBeat.i(90127);
        Map zzg = zzg(Math.max(i, 2), true);
        zzg.put(k, v);
        zzg.put(k2, v2);
        AppMethodBeat.o(90127);
        return zzg;
    }

    public static <K, V> Map<K, V> mutableInOrderMapOfWithSize(int i, K k, V v, K k2, V v2, K k3, V v3) {
        AppMethodBeat.i(90128);
        Map zzg = zzg(Math.max(i, 3), true);
        zzg.put(k, v);
        zzg.put(k2, v2);
        zzg.put(k3, v3);
        AppMethodBeat.o(90128);
        return zzg;
    }

    public static <T> Set<T> mutableInOrderSetOf() {
        AppMethodBeat.i(90089);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AppMethodBeat.o(90089);
        return linkedHashSet;
    }

    public static <T> Set<T> mutableInOrderSetOf(T t) {
        AppMethodBeat.i(90090);
        Set mutableInOrderSetOfWithSize = mutableInOrderSetOfWithSize(1, (Object) t);
        AppMethodBeat.o(90090);
        return mutableInOrderSetOfWithSize;
    }

    public static <T> Set<T> mutableInOrderSetOf(T t, T t2) {
        AppMethodBeat.i(90091);
        Set mutableInOrderSetOfWithSize = mutableInOrderSetOfWithSize(2, t, t2);
        AppMethodBeat.o(90091);
        return mutableInOrderSetOfWithSize;
    }

    public static <T> Set<T> mutableInOrderSetOf(T... tArr) {
        AppMethodBeat.i(90092);
        Set mutableInOrderSetOf;
        if (tArr.length == 0) {
            mutableInOrderSetOf = mutableInOrderSetOf();
            AppMethodBeat.o(90092);
            return mutableInOrderSetOf;
        }
        mutableInOrderSetOf = zzb(tArr.length, true, tArr);
        AppMethodBeat.o(90092);
        return mutableInOrderSetOf;
    }

    public static <T> Set<T> mutableInOrderSetOfWithSize(int i) {
        AppMethodBeat.i(90085);
        Set mutableInOrderSetOf;
        if (i == 0) {
            mutableInOrderSetOf = mutableInOrderSetOf();
            AppMethodBeat.o(90085);
            return mutableInOrderSetOf;
        }
        mutableInOrderSetOf = zze(i, true);
        AppMethodBeat.o(90085);
        return mutableInOrderSetOf;
    }

    public static <T> Set<T> mutableInOrderSetOfWithSize(int i, T t) {
        AppMethodBeat.i(90086);
        Set zze = zze(Math.max(i, 1), true);
        zze.add(t);
        AppMethodBeat.o(90086);
        return zze;
    }

    public static <T> Set<T> mutableInOrderSetOfWithSize(int i, T t, T t2) {
        AppMethodBeat.i(90087);
        Set zze = zze(Math.max(i, 2), true);
        zze.add(t);
        zze.add(t2);
        AppMethodBeat.o(90087);
        return zze;
    }

    public static <T> Set<T> mutableInOrderSetOfWithSize(int i, T... tArr) {
        AppMethodBeat.i(90088);
        int max = Math.max(i, tArr.length);
        Set mutableSetOf;
        if (max == 0) {
            mutableSetOf = mutableSetOf();
            AppMethodBeat.o(90088);
            return mutableSetOf;
        } else if (tArr.length == 0) {
            mutableSetOf = mutableInOrderSetOfWithSize(i);
            AppMethodBeat.o(90088);
            return mutableSetOf;
        } else {
            mutableSetOf = zzb(max, true, tArr);
            AppMethodBeat.o(90088);
            return mutableSetOf;
        }
    }

    public static <T> List<T> mutableListOf() {
        AppMethodBeat.i(90057);
        ArrayList arrayList = new ArrayList();
        AppMethodBeat.o(90057);
        return arrayList;
    }

    public static <T> List<T> mutableListOf(T t) {
        AppMethodBeat.i(90058);
        List mutableListOfWithSize = mutableListOfWithSize(1, (Object) t);
        AppMethodBeat.o(90058);
        return mutableListOfWithSize;
    }

    public static <T> List<T> mutableListOf(T t, T t2) {
        AppMethodBeat.i(90059);
        List mutableListOfWithSize = mutableListOfWithSize(2, t, t2);
        AppMethodBeat.o(90059);
        return mutableListOfWithSize;
    }

    public static <T> List<T> mutableListOf(T... tArr) {
        AppMethodBeat.i(90060);
        if (tArr.length == 0) {
            List mutableListOf = mutableListOf();
            AppMethodBeat.o(90060);
            return mutableListOf;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(tArr));
        AppMethodBeat.o(90060);
        return arrayList;
    }

    public static <T> List<T> mutableListOfWithSize(int i) {
        AppMethodBeat.i(90053);
        List mutableListOf;
        if (i == 0) {
            mutableListOf = mutableListOf();
            AppMethodBeat.o(90053);
            return mutableListOf;
        }
        mutableListOf = zzc(i, true);
        AppMethodBeat.o(90053);
        return mutableListOf;
    }

    public static <T> List<T> mutableListOfWithSize(int i, T t) {
        AppMethodBeat.i(90054);
        List zzc = zzc(Math.max(i, 1), true);
        zzc.add(t);
        AppMethodBeat.o(90054);
        return zzc;
    }

    public static <T> List<T> mutableListOfWithSize(int i, T t, T t2) {
        AppMethodBeat.i(90055);
        List zzc = zzc(Math.max(i, 2), true);
        zzc.add(t);
        zzc.add(t2);
        AppMethodBeat.o(90055);
        return zzc;
    }

    public static <T> List<T> mutableListOfWithSize(int i, T... tArr) {
        AppMethodBeat.i(90056);
        int max = Math.max(i, tArr.length);
        List mutableListOf;
        if (max == 0) {
            mutableListOf = mutableListOf();
            AppMethodBeat.o(90056);
            return mutableListOf;
        } else if (tArr.length == 0) {
            mutableListOf = mutableListOfWithSize(i);
            AppMethodBeat.o(90056);
            return mutableListOf;
        } else if (tArr.length == max) {
            ArrayList arrayList = new ArrayList(Arrays.asList(tArr));
            AppMethodBeat.o(90056);
            return arrayList;
        } else {
            mutableListOf = zzc(max, true);
            mutableListOf.addAll(Arrays.asList(tArr));
            AppMethodBeat.o(90056);
            return mutableListOf;
        }
    }

    public static <K, V> Map<K, V> mutableMapOf() {
        AppMethodBeat.i(90120);
        a aVar = new a();
        AppMethodBeat.o(90120);
        return aVar;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k, V v) {
        AppMethodBeat.i(90121);
        Map mutableMapOfWithSize = mutableMapOfWithSize(1, k, v);
        AppMethodBeat.o(90121);
        return mutableMapOfWithSize;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k, V v, K k2, V v2) {
        AppMethodBeat.i(90122);
        Map mutableMapOfWithSize = mutableMapOfWithSize(2, k, v, k2, v2);
        AppMethodBeat.o(90122);
        return mutableMapOfWithSize;
    }

    public static <K, V> Map<K, V> mutableMapOf(K k, V v, K k2, V v2, K k3, V v3) {
        AppMethodBeat.i(90123);
        Map mutableMapOfWithSize = mutableMapOfWithSize(3, k, v, k2, v2, k3, v3);
        AppMethodBeat.o(90123);
        return mutableMapOfWithSize;
    }

    public static <K, V> Map<K, V> mutableMapOfKeyValueArrays(K[] kArr, V[] vArr) {
        AppMethodBeat.i(90124);
        zza(kArr, vArr);
        int length = kArr.length;
        Map mutableMapOf;
        if (length == 0) {
            mutableMapOf = mutableMapOf();
            AppMethodBeat.o(90124);
            return mutableMapOf;
        }
        mutableMapOf = zza(length, true, kArr, vArr);
        AppMethodBeat.o(90124);
        return mutableMapOf;
    }

    public static <K, V> Map<K, V> mutableMapOfKeyValueArraysWithSize(int i, K[] kArr, V[] vArr) {
        AppMethodBeat.i(90119);
        zza(kArr, vArr);
        int max = Math.max(i, kArr.length);
        Map mutableMapOf;
        if (max == 0) {
            mutableMapOf = mutableMapOf();
            AppMethodBeat.o(90119);
            return mutableMapOf;
        } else if (kArr.length == 0) {
            mutableMapOf = mutableMapOfWithSize(i);
            AppMethodBeat.o(90119);
            return mutableMapOf;
        } else {
            mutableMapOf = zza(max, true, kArr, vArr);
            AppMethodBeat.o(90119);
            return mutableMapOf;
        }
    }

    public static <K, V> Map<K, V> mutableMapOfWithSize(int i) {
        AppMethodBeat.i(90115);
        Map mutableMapOf;
        if (i == 0) {
            mutableMapOf = mutableMapOf();
            AppMethodBeat.o(90115);
            return mutableMapOf;
        }
        mutableMapOf = zzf(i, true);
        AppMethodBeat.o(90115);
        return mutableMapOf;
    }

    public static <K, V> Map<K, V> mutableMapOfWithSize(int i, K k, V v) {
        AppMethodBeat.i(90116);
        Map zzf = zzf(Math.max(i, 1), true);
        zzf.put(k, v);
        AppMethodBeat.o(90116);
        return zzf;
    }

    public static <K, V> Map<K, V> mutableMapOfWithSize(int i, K k, V v, K k2, V v2) {
        AppMethodBeat.i(90117);
        Map zzf = zzf(Math.max(i, 2), true);
        zzf.put(k, v);
        zzf.put(k2, v2);
        AppMethodBeat.o(90117);
        return zzf;
    }

    public static <K, V> Map<K, V> mutableMapOfWithSize(int i, K k, V v, K k2, V v2, K k3, V v3) {
        AppMethodBeat.i(90118);
        Map zzf = zzf(Math.max(i, 3), true);
        zzf.put(k, v);
        zzf.put(k2, v2);
        zzf.put(k3, v3);
        AppMethodBeat.o(90118);
        return zzf;
    }

    public static <T> Set<T> mutableSetOf() {
        AppMethodBeat.i(90081);
        b bVar = new b();
        AppMethodBeat.o(90081);
        return bVar;
    }

    public static <T> Set<T> mutableSetOf(T t) {
        AppMethodBeat.i(90082);
        Set mutableSetOfWithSize = mutableSetOfWithSize(1, (Object) t);
        AppMethodBeat.o(90082);
        return mutableSetOfWithSize;
    }

    public static <T> Set<T> mutableSetOf(T t, T t2) {
        AppMethodBeat.i(90083);
        Set mutableSetOfWithSize = mutableSetOfWithSize(2, t, t2);
        AppMethodBeat.o(90083);
        return mutableSetOfWithSize;
    }

    public static <T> Set<T> mutableSetOf(T... tArr) {
        AppMethodBeat.i(90084);
        Set mutableSetOf;
        if (tArr.length == 0) {
            mutableSetOf = mutableSetOf();
            AppMethodBeat.o(90084);
            return mutableSetOf;
        }
        mutableSetOf = zza(tArr.length, true, (Object[]) tArr);
        AppMethodBeat.o(90084);
        return mutableSetOf;
    }

    public static <T> Set<T> mutableSetOfWithSize(int i) {
        AppMethodBeat.i(90077);
        Set mutableSetOf;
        if (i == 0) {
            mutableSetOf = mutableSetOf();
            AppMethodBeat.o(90077);
            return mutableSetOf;
        }
        mutableSetOf = zzd(i, true);
        AppMethodBeat.o(90077);
        return mutableSetOf;
    }

    public static <T> Set<T> mutableSetOfWithSize(int i, T t) {
        AppMethodBeat.i(90078);
        Set zzd = zzd(Math.max(i, 1), true);
        zzd.add(t);
        AppMethodBeat.o(90078);
        return zzd;
    }

    public static <T> Set<T> mutableSetOfWithSize(int i, T t, T t2) {
        AppMethodBeat.i(90079);
        Set zzd = zzd(Math.max(i, 2), true);
        zzd.add(t);
        zzd.add(t2);
        AppMethodBeat.o(90079);
        return zzd;
    }

    public static <T> Set<T> mutableSetOfWithSize(int i, T... tArr) {
        AppMethodBeat.i(90080);
        int max = Math.max(i, tArr.length);
        Set mutableSetOf;
        if (max == 0) {
            mutableSetOf = mutableSetOf();
            AppMethodBeat.o(90080);
            return mutableSetOf;
        } else if (tArr.length == 0) {
            mutableSetOf = mutableSetOfWithSize(i);
            AppMethodBeat.o(90080);
            return mutableSetOf;
        } else {
            mutableSetOf = zza(max, true, (Object[]) tArr);
            AppMethodBeat.o(90080);
            return mutableSetOf;
        }
    }

    @Deprecated
    public static <T> Set<T> setOf() {
        AppMethodBeat.i(90063);
        Set emptySet = Collections.emptySet();
        AppMethodBeat.o(90063);
        return emptySet;
    }

    @Deprecated
    public static <T> Set<T> setOf(T t) {
        AppMethodBeat.i(90064);
        Set singleton = Collections.singleton(t);
        AppMethodBeat.o(90064);
        return singleton;
    }

    @Deprecated
    public static <T> Set<T> setOf(T t, T t2) {
        AppMethodBeat.i(90065);
        Set zzd = zzd(2, false);
        zzd.add(t);
        zzd.add(t2);
        zzd = Collections.unmodifiableSet(zzd);
        AppMethodBeat.o(90065);
        return zzd;
    }

    @Deprecated
    public static <T> Set<T> setOf(T t, T t2, T t3) {
        AppMethodBeat.i(90066);
        Set zzd = zzd(3, false);
        zzd.add(t);
        zzd.add(t2);
        zzd.add(t3);
        zzd = Collections.unmodifiableSet(zzd);
        AppMethodBeat.o(90066);
        return zzd;
    }

    @Deprecated
    public static <T> Set<T> setOf(T t, T t2, T t3, T t4) {
        AppMethodBeat.i(90067);
        Set zzd = zzd(4, false);
        zzd.add(t);
        zzd.add(t2);
        zzd.add(t3);
        zzd.add(t4);
        zzd = Collections.unmodifiableSet(zzd);
        AppMethodBeat.o(90067);
        return zzd;
    }

    @Deprecated
    public static <T> Set<T> setOf(T... tArr) {
        AppMethodBeat.i(90068);
        Set of;
        switch (tArr.length) {
            case 0:
                of = setOf();
                AppMethodBeat.o(90068);
                return of;
            case 1:
                of = setOf(tArr[0]);
                AppMethodBeat.o(90068);
                return of;
            case 2:
                of = setOf(tArr[0], tArr[1]);
                AppMethodBeat.o(90068);
                return of;
            case 3:
                of = setOf(tArr[0], tArr[1], tArr[2]);
                AppMethodBeat.o(90068);
                return of;
            case 4:
                of = setOf(tArr[0], tArr[1], tArr[2], tArr[3]);
                AppMethodBeat.o(90068);
                return of;
            default:
                of = Collections.unmodifiableSet(zza(tArr.length, false, (Object[]) tArr));
                AppMethodBeat.o(90068);
                return of;
        }
    }

    private static <K, V> Map<K, V> zza(int i, boolean z, K[] kArr, V[] vArr) {
        AppMethodBeat.i(90096);
        Map zzf = zzf(i, z);
        zza(zzf, (Object[]) kArr, (Object[]) vArr);
        AppMethodBeat.o(90096);
        return zzf;
    }

    private static <T> Set<T> zza(int i, boolean z, T[] tArr) {
        AppMethodBeat.i(90062);
        Set zzd = zzd(i, z);
        Collections.addAll(zzd, tArr);
        AppMethodBeat.o(90062);
        return zzd;
    }

    private static <K, V> void zza(Map<K, V> map, K[] kArr, V[] vArr) {
        AppMethodBeat.i(90094);
        for (int i = 0; i < kArr.length; i++) {
            map.put(kArr[i], vArr[i]);
        }
        AppMethodBeat.o(90094);
    }

    private static <K, V> void zza(K[] kArr, V[] vArr) {
        AppMethodBeat.i(90093);
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + vArr.length);
            AppMethodBeat.o(90093);
            throw illegalArgumentException;
        }
        AppMethodBeat.o(90093);
    }

    private static <K, V> Map<K, V> zzb(int i, boolean z, K[] kArr, V[] vArr) {
        AppMethodBeat.i(90106);
        Map zzg = zzg(i, z);
        zza(zzg, (Object[]) kArr, (Object[]) vArr);
        AppMethodBeat.o(90106);
        return zzg;
    }

    private static <T> Set<T> zzb(int i, boolean z, T[] tArr) {
        AppMethodBeat.i(90070);
        Set zze = zze(i, z);
        Collections.addAll(zze, tArr);
        AppMethodBeat.o(90070);
        return zze;
    }

    private static <T> List<T> zzc(int i, boolean z) {
        AppMethodBeat.i(90049);
        ArrayList arrayList = new ArrayList(i);
        AppMethodBeat.o(90049);
        return arrayList;
    }

    private static <T> Set<T> zzd(int i, boolean z) {
        AppMethodBeat.i(90061);
        float f = z ? 0.75f : 1.0f;
        if (i <= (z ? 128 : 256)) {
            b bVar = new b(i);
            AppMethodBeat.o(90061);
            return bVar;
        }
        HashSet hashSet = new HashSet(i, f);
        AppMethodBeat.o(90061);
        return hashSet;
    }

    private static <T> Set<T> zze(int i, boolean z) {
        AppMethodBeat.i(90069);
        LinkedHashSet linkedHashSet = new LinkedHashSet(i, z ? 0.75f : 1.0f);
        AppMethodBeat.o(90069);
        return linkedHashSet;
    }

    private static <K, V> Map<K, V> zzf(int i, boolean z) {
        AppMethodBeat.i(90095);
        float f = z ? 0.75f : 1.0f;
        if (i <= (z ? 128 : 256)) {
            a aVar = new a(i);
            AppMethodBeat.o(90095);
            return aVar;
        }
        HashMap hashMap = new HashMap(i, f);
        AppMethodBeat.o(90095);
        return hashMap;
    }

    private static <K, V> Map<K, V> zzg(int i, boolean z) {
        AppMethodBeat.i(90105);
        LinkedHashMap linkedHashMap = new LinkedHashMap(i, z ? 0.75f : 1.0f);
        AppMethodBeat.o(90105);
        return linkedHashMap;
    }
}
