package com.tencent.mm.plugin.appbrand.jsapi.k;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import org.json.JSONObject;

@l(dWo = {1, 1, 13}, dWp = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\n"}, dWq = {"Lcom/tencent/mm/plugin/appbrand/jsapi/page/PrivateJsApiSetDisplayOrientation;", "Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandSyncJsApi;", "Lcom/tencent/mm/plugin/appbrand/AppBrandComponentWxaShared;", "()V", "invoke", "", "env", "data", "Lorg/json/JSONObject;", "Companion", "luggage-wechat-full-sdk_release"})
public final class ac extends u<d> {
    public static final int CTRL_INDEX = 533;
    public static final String NAME = "setDisplayOrientation";
    @Deprecated
    public static final a hTG = new a();

    @l(dWo = {1, 1, 13}, dWp = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, dWq = {"Lcom/tencent/mm/plugin/appbrand/jsapi/page/PrivateJsApiSetDisplayOrientation$Companion;", "", "()V", "CTRL_INDEX", "", "LANDSCAPE", "LANDSCAPE_REVERSE", "NAME", "", "PORTRAIT", "TAG", "luggage-wechat-full-sdk_release"})
    static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        AppMethodBeat.i(102470);
        AppMethodBeat.o(102470);
    }

    public final /* synthetic */ String b(c cVar, JSONObject jSONObject) {
        Integer num = null;
        AppMethodBeat.i(102469);
        d dVar = (d) cVar;
        j.p(dVar, "env");
        com.tencent.mm.plugin.appbrand.page.u currentPageView = dVar instanceof com.tencent.mm.plugin.appbrand.page.u ? (com.tencent.mm.plugin.appbrand.page.u) dVar : dVar instanceof q ? ((q) dVar).getCurrentPageView() : null;
        String AK;
        if (currentPageView == null) {
            AK = AK("fail:page don't exist");
            j.o(AK, "makeReturnJson(Constants…Msg.API_PAGE_DON_T_EXIST)");
            AppMethodBeat.o(102469);
            return AK;
        }
        String str;
        if (jSONObject != null) {
            num = Integer.valueOf(jSONObject.optInt("orientation", 0));
        }
        if (num != null && num.intValue() == 90) {
            str = "landscape";
        } else if (num != null && num.intValue() == -90) {
            str = "landscapeLeft";
        } else {
            str = "portrait";
        }
        ab.i("MicroMsg.AppBrand.PrivateJsApiSetDisplayOrientation", "set display orientation:%s", str);
        if (com.tencent.mm.plugin.appbrand.config.a.a.yV(str) == null) {
            AK = AK("fail:invalid data");
            j.o(AK, "makeReturnJson(Constants…sApiMsg.API_INVALID_DATA)");
            AppMethodBeat.o(102469);
            return AK;
        }
        if (currentPageView instanceof com.tencent.luggage.sdk.a.a.a) {
            com.tencent.luggage.sdk.a.a.a aVar = (com.tencent.luggage.sdk.a.a.a) currentPageView;
            HashMap hashMap = new HashMap();
            hashMap.put(getName(), str);
            aVar.d(str, hashMap);
        } else {
            currentPageView.Dg(str);
        }
        AK = AK("ok");
        j.o(AK, "makeReturnJson(\"ok\")");
        AppMethodBeat.o(102469);
        return AK;
    }
}
