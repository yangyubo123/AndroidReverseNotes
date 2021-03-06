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

/* renamed from: com.tencent.mm.boot.svg.a.a.aar */
public final class aar extends C5163c {
    private final int height = 72;
    private final int width = 72;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
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
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(35.991314f, 65.99143f);
                l.cubicTo(19.422773f, 65.99143f, 5.9913154f, 52.559975f, 5.9913154f, 35.991432f);
                l.cubicTo(5.9913154f, 19.422892f, 19.422773f, 5.991433f, 35.991314f, 5.991433f);
                l.cubicTo(52.559856f, 5.991433f, 65.99132f, 19.422892f, 65.99132f, 35.991432f);
                l.cubicTo(65.99132f, 52.559975f, 52.559856f, 65.99143f, 35.991314f, 65.99143f);
                l.close();
                l.moveTo(35.991314f, 62.391434f);
                l.cubicTo(50.571632f, 62.391434f, 62.391315f, 50.57175f, 62.391315f, 35.991432f);
                l.cubicTo(62.391315f, 21.411116f, 50.571632f, 9.591434f, 35.991314f, 9.591434f);
                l.cubicTo(21.410997f, 9.591434f, 9.591315f, 21.411116f, 9.591315f, 35.991432f);
                l.cubicTo(9.591315f, 50.57175f, 21.410997f, 62.391434f, 35.991314f, 62.391434f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(a, looper);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(20.84846f, 23.342865f);
                l2.lineTo(25.84846f, 23.342865f);
                l2.lineTo(25.84846f, 28.342865f);
                l2.lineTo(20.84846f, 28.342865f);
                l2.lineTo(20.84846f, 23.342865f);
                l2.close();
                canvas.drawPath(l2, k);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(a, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(20.84846f, 33.342865f);
                l2.lineTo(25.84846f, 33.342865f);
                l2.lineTo(25.84846f, 38.342865f);
                l2.lineTo(20.84846f, 38.342865f);
                l2.lineTo(20.84846f, 33.342865f);
                l2.close();
                canvas.drawPath(l2, k);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(a, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(20.84846f, 43.342865f);
                l2.lineTo(25.84846f, 43.342865f);
                l2.lineTo(25.84846f, 48.342865f);
                l2.lineTo(20.84846f, 48.342865f);
                l2.lineTo(20.84846f, 43.342865f);
                l2.close();
                canvas.drawPath(l2, k);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(a, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(29.0f, 24.0f);
                l2.lineTo(51.0f, 24.0f);
                l2.lineTo(51.0f, 27.6f);
                l2.lineTo(29.0f, 27.6f);
                l2.lineTo(29.0f, 24.0f);
                l2.close();
                canvas.drawPath(l2, k);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(a, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(29.0f, 34.0f);
                l2.lineTo(51.0f, 34.0f);
                l2.lineTo(51.0f, 37.6f);
                l2.lineTo(29.0f, 37.6f);
                l2.lineTo(29.0f, 34.0f);
                l2.close();
                canvas.drawPath(l2, k);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(a, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(29.0f, 44.0f);
                l2.lineTo(51.0f, 44.0f);
                l2.lineTo(51.0f, 47.6f);
                l2.lineTo(29.0f, 47.6f);
                l2.lineTo(29.0f, 44.0f);
                l2.close();
                canvas.drawPath(l2, k);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
