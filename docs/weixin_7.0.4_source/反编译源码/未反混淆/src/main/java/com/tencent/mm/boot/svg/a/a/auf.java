package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class auf extends c {
    private final int height = 30;
    private final int width = 30;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 30;
            case 1:
                return 30;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.saveLayerAlpha(null, 76, 4);
                k = c.a(k, looper);
                k.setColor(-1);
                canvas.save();
                k = c.a(k, looper);
                Path l = c.l(looper);
                l.moveTo(17.0625f, 15.0f);
                l.lineTo(26.0f, 6.0625f);
                l.lineTo(23.9375f, 4.0f);
                l.lineTo(15.0f, 12.9375f);
                l.lineTo(6.0625f, 4.0f);
                l.lineTo(4.0f, 6.0625f);
                l.lineTo(12.9375f, 15.0f);
                l.lineTo(4.0f, 23.9375f);
                l.lineTo(6.0625f, 26.0f);
                l.lineTo(15.0f, 17.0625f);
                l.lineTo(23.9375f, 26.0f);
                l.lineTo(26.0f, 23.9375f);
                l.lineTo(17.0625f, 15.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
