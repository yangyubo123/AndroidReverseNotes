package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.plugin.appbrand.jsapi.b.a;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ho extends c {
    private final int height = a.CTRL_INDEX;
    private final int width = 438;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 438;
            case 1:
                return a.CTRL_INDEX;
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
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-15028967);
                Path l = c.l(looper);
                l.moveTo(57.052635f, 156.0f);
                l.cubicTo(55.918964f, 156.0f, 55.0f, 154.65694f, 55.0f, 153.00008f);
                l.cubicTo(55.0f, 151.34306f, 55.918964f, 150.0f, 57.052635f, 150.0f);
                l.lineTo(122.528206f, 150.0f);
                l.cubicTo(123.66188f, 150.0f, 124.58084f, 151.34306f, 124.58084f, 152.99992f);
                l.cubicTo(124.58084f, 154.65678f, 123.66188f, 156.0f, 122.528206f, 156.0f);
                l.lineTo(57.052635f, 156.0f);
                l.close();
                l.moveTo(57.492485f, 174.68736f);
                l.cubicTo(56.115887f, 174.68736f, 55.0f, 173.3443f, 55.0f, 171.68744f);
                l.cubicTo(55.0f, 170.03043f, 56.115887f, 168.68736f, 57.492485f, 168.68736f);
                l.lineTo(136.99854f, 168.68736f);
                l.cubicTo(138.37514f, 168.68736f, 139.49103f, 170.03043f, 139.49103f, 171.68729f);
                l.cubicTo(139.49103f, 173.3443f, 138.37514f, 174.68736f, 136.99854f, 174.68736f);
                l.lineTo(57.492485f, 174.68736f);
                l.close();
                l.moveTo(97.27607f, 193.47983f);
                l.lineTo(57.45447f, 193.47983f);
                l.cubicTo(56.098866f, 193.47983f, 55.0f, 192.13673f, 55.0f, 190.47983f);
                l.cubicTo(55.0f, 188.82294f, 56.098866f, 187.47983f, 57.45447f, 187.47983f);
                l.lineTo(97.27607f, 187.47983f);
                l.cubicTo(98.631676f, 187.47983f, 99.730545f, 188.82294f, 99.730545f, 190.47983f);
                l.cubicTo(99.73042f, 192.13673f, 98.63155f, 193.47983f, 97.27607f, 193.47983f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k2 = c.a(k, looper);
                k2.setColor(WebView.NIGHT_MODE_COLOR);
                Path l2 = c.l(looper);
                l2.moveTo(133.0f, 120.0f);
                l2.lineTo(133.0f, 45.0f);
                l2.lineTo(305.0f, 45.0f);
                l2.lineTo(305.0f, 318.0f);
                l2.lineTo(133.0f, 318.0f);
                l2.lineTo(133.0f, 225.46962f);
                l2.lineTo(134.5f, 225.46962f);
                l2.lineTo(134.5f, 316.5f);
                l2.lineTo(303.5f, 316.5f);
                l2.lineTo(303.5f, 46.5f);
                l2.lineTo(134.5f, 46.5f);
                l2.lineTo(134.5f, 120.0f);
                l2.lineTo(133.0f, 120.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                l = c.l(looper);
                l.moveTo(120.0f, 120.0f);
                l.lineTo(120.0f, 21.991756f);
                l.cubicTo(120.0f, 13.170865f, 127.1606f, 6.0f, 135.99364f, 6.0f);
                l.lineTo(302.00635f, 6.0f);
                l.cubicTo(310.8361f, 6.0f, 318.0f, 13.159754f, 318.0f, 21.991756f);
                l.lineTo(318.0f, 350.00824f);
                l.cubicTo(318.0f, 358.82913f, 310.83942f, 366.0f, 302.00635f, 366.0f);
                l.lineTo(135.99364f, 366.0f);
                l.cubicTo(127.1639f, 366.0f, 120.0f, 358.84024f, 120.0f, 350.00824f);
                l.lineTo(120.0f, 225.46962f);
                l.lineTo(123.0f, 225.46962f);
                l.lineTo(123.0f, 350.00754f);
                l.cubicTo(123.0f, 357.18307f, 128.82472f, 363.0f, 136.00838f, 363.0f);
                l.lineTo(301.99164f, 363.0f);
                l.cubicTo(309.17596f, 363.0f, 315.0f, 357.18747f, 315.0f, 350.00754f);
                l.lineTo(315.0f, 21.992458f);
                l.cubicTo(315.0f, 14.816921f, 309.17526f, 9.0f, 301.99164f, 9.0f);
                l.lineTo(136.00838f, 9.0f);
                l.cubicTo(128.82405f, 9.0f, 123.0f, 14.812543f, 123.0f, 21.992458f);
                l.lineTo(123.0f, 120.0f);
                l.lineTo(120.0f, 120.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k2 = c.a(k, looper);
                k2.setColor(WebView.NIGHT_MODE_COLOR);
                l2 = c.l(looper);
                l2.moveTo(206.0f, 24.0f);
                l2.lineTo(232.0f, 24.0f);
                l2.lineTo(232.0f, 27.0f);
                l2.lineTo(206.0f, 27.0f);
                l2.lineTo(206.0f, 24.0f);
                l2.close();
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                l = c.l(looper);
                l.moveTo(60.651176f, 249.89926f);
                l.lineTo(60.595497f, 225.46962f);
                l.lineTo(33.888363f, 225.46962f);
                l.cubicTo(27.33306f, 225.46962f, 22.0f, 220.17123f, 22.0f, 213.65854f);
                l.lineTo(22.0f, 131.81108f);
                l.cubicTo(22.0f, 125.298386f, 27.33306f, 120.0f, 33.888363f, 120.0f);
                l.lineTo(160.11163f, 120.0f);
                l.cubicTo(166.66695f, 120.0f, 172.0f, 125.298386f, 172.0f, 131.81108f);
                l.lineTo(172.0f, 213.65854f);
                l.cubicTo(172.0f, 220.17123f, 166.66695f, 225.46962f, 160.11163f, 225.46962f);
                l.lineTo(97.138374f, 225.46962f);
                l.lineTo(69.358574f, 253.56952f);
                l.cubicTo(68.354385f, 254.50647f, 67.109116f, 254.99985f, 65.80787f, 255.0f);
                l.cubicTo(62.971363f, 255.0003f, 60.6581f, 252.7121f, 60.651176f, 249.89926f);
                l.close();
                l.moveTo(63.58853f, 247.54555f);
                l.lineTo(63.608063f, 222.6283f);
                l.lineTo(36.50444f, 222.48622f);
                l.cubicTo(28.85407f, 222.5878f, 25.13076f, 218.84735f, 25.09161f, 211.1126f);
                l.lineTo(25.0f, 134.37363f);
                l.cubicTo(25.132122f, 125.48259f, 30.013842f, 122.979996f, 36.41283f, 123.0f);
                l.lineTo(157.58717f, 123.0f);
                l.cubicTo(167.20503f, 123.0f, 169.02705f, 128.21953f, 169.0f, 134.37363f);
                l.lineTo(169.09161f, 211.1126f);
                l.cubicTo(169.11636f, 218.63168f, 166.0281f, 222.59373f, 157.67879f, 222.48622f);
                l.lineTo(95.95168f, 222.58171f);
                l.lineTo(68.555214f, 250.40294f);
                l.cubicTo(67.59119f, 251.30519f, 66.85377f, 251.84087f, 65.63155f, 251.84087f);
                l.cubicTo(63.608063f, 251.86566f, 63.595177f, 250.2542f, 63.58853f, 247.54555f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
