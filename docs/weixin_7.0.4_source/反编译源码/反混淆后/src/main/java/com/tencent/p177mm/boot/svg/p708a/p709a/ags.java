package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.ags */
public final class ags extends C5163c {
    private final int height = 56;
    private final int width = 40;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 40;
            case 1:
                return 56;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                C5163c.m7881h(looper);
                C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                k = C5163c.m7876a(k, looper);
                k.setColor(-7105645);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(40.0f, 0.0f);
                l.lineTo(40.0f, 0.0f);
                l.lineTo(40.0f, 56.0f);
                l.lineTo(40.0f, 56.0f);
                l.cubicTo(28.04299f, 47.66f, 16.135965f, 39.26f, 4.0f, 31.0f);
                l.cubicTo(2.9492626f, 29.86f, 1.6795801f, 28.79f, 0.0f, 29.0f);
                l.lineTo(0.0f, 27.0f);
                l.cubicTo(0.179955f, 27.41f, 0.52986753f, 27.41f, 1.0f, 27.0f);
                l.cubicTo(13.886528f, 18.41f, 26.88328f, 9.13f, 40.0f, 0.0f);
                l.lineTo(40.0f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
