package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public final class ax extends a {
    public static final int CTRL_INDEX = 403;
    public static final String NAME = "openOfflinePayView";
    private int bOs;

    public final void a(final c cVar, JSONObject jSONObject, final int i) {
        AppMethodBeat.i(130517);
        Context context = cVar.getContext();
        if (context == null || !(context instanceof MMActivity)) {
            cVar.M(i, j("fail", null));
            ab.e("MicroMsg.JsApiOpenOfflinePayView", "mmActivity is null, invoke fail!");
            AppMethodBeat.o(130517);
            return;
        }
        ((MMActivity) context).ifE = new a() {
            public final void c(int i, int i2, Intent intent) {
                AppMethodBeat.i(130516);
                if (i != (ax.this.hashCode() & CdnLogic.kBizGeneric)) {
                    AppMethodBeat.o(130516);
                    return;
                }
                if (intent != null) {
                    ab.i("MicroMsg.JsApiOpenOfflinePayView", "callback: %s", intent.getStringExtra("key_callback"));
                    cVar.M(i, ax.this.j(r0, null));
                    h.pYm.e(14954, f.dlI(), "openOfflinePayView:ok");
                } else {
                    cVar.M(i, ax.this.j("fail", null));
                    if (!f.dlH()) {
                        h.pYm.e(14954, f.dlI(), "openOfflinePayView:fail");
                    }
                }
                if (!f.dlH()) {
                    f.dlJ();
                }
                AppMethodBeat.o(130516);
            }
        };
        this.bOs = i;
        ab.d("MicroMsg.JsApiOpenOfflinePayView", "json: %s", jSONObject.toString());
        AppBrandSysConfigWC wJ = com.tencent.mm.plugin.appbrand.a.wJ(cVar.getAppId());
        if (wJ == null) {
            cVar.M(i, j("fail", null));
            ab.e("MicroMsg.JsApiOpenOfflinePayView", "sysConfig is null, invoke fail!");
            AppMethodBeat.o(130517);
            return;
        }
        o wI = com.tencent.mm.plugin.appbrand.a.wI(cVar.getAppId());
        if (wI == null) {
            cVar.M(i, j("fail", null));
            ab.e("MicroMsg.JsApiOpenOfflinePayView", "runtime is null, invoke fail!");
            AppMethodBeat.o(130517);
            return;
        }
        String currentUrl = wI.asV().getCurrentUrl();
        Intent intent = new Intent();
        intent.putExtra("appId", cVar.getAppId());
        intent.putExtra("timeStamp", jSONObject.optString("timeStamp"));
        intent.putExtra("nonceStr", jSONObject.optString("nonceStr"));
        intent.putExtra("packageExt", jSONObject.optString("package"));
        intent.putExtra("signtype", jSONObject.optString("signType"));
        intent.putExtra("paySignature", jSONObject.optString("paySign"));
        intent.putExtra("wxapp_username", wJ.cwz);
        intent.putExtra("wxapp_path", currentUrl);
        int hashCode = hashCode() & CdnLogic.kBizGeneric;
        intent.putExtra("key_from_scene", 7);
        d.b(context, "offline", ".ui.WalletOfflineEntranceUI", intent, hashCode);
        AppMethodBeat.o(130517);
    }
}
