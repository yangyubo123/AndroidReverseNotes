package com.tencent.mm.media.editor.c;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.v;
import a.y;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo = {1, 1, 13}, dWp = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0002J \u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0002J5\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2%\b\u0002\u0010$\u001a\u001f\u0012\u0013\u0012\u00110#¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020!\u0018\u00010%R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006("}, dWq = {"Lcom/tencent/mm/media/editor/touch/MatrixChecker;", "", "()V", "bounds", "Landroid/graphics/RectF;", "getBounds", "()Landroid/graphics/RectF;", "setBounds", "(Landroid/graphics/RectF;)V", "maxScale", "", "getMaxScale", "()F", "setMaxScale", "(F)V", "minScale", "getMinScale", "setMinScale", "pivot", "", "getPivot", "()[F", "setPivot", "([F)V", "clamp", "value", "min", "max", "interpolate", "from", "to", "input", "resolve", "", "matrix", "Landroid/graphics/Matrix;", "updateCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "plugin-mediaeditor_release"})
public final class a {
    public float aJf = 1.0f;
    public float aJg = 1.0f;
    private RectF eUx = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    float[] eUy = new float[2];

    @l(dWo = {1, 1, 13}, dWp = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, dWq = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"})
    static final class a implements AnimatorUpdateListener {
        final /* synthetic */ float eUA;
        final /* synthetic */ float eUB;
        final /* synthetic */ float eUC;
        final /* synthetic */ float[] eUD;
        final /* synthetic */ float[] eUE;
        final /* synthetic */ b eUF;
        final /* synthetic */ a eUz;

        a(a aVar, float f, float f2, float f3, float[] fArr, float[] fArr2, b bVar) {
            this.eUz = aVar;
            this.eUA = f;
            this.eUB = f2;
            this.eUC = f3;
            this.eUD = fArr;
            this.eUE = fArr2;
            this.eUF = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AppMethodBeat.i(12900);
            a aVar = this.eUz;
            j.o(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                v vVar = new v("null cannot be cast to non-null type kotlin.Float");
                AppMethodBeat.o(12900);
                throw vVar;
            }
            float floatValue = ((Float) animatedValue).floatValue();
            Matrix matrix = new Matrix();
            matrix.setTranslate(-aVar.eUy[0], -aVar.eUy[1]);
            matrix.postScale(((this.eUB * floatValue) + ((1.0f - floatValue) * this.eUA)), ((this.eUB * floatValue) + ((1.0f - floatValue) * this.eUA)));
            matrix.postRotate(this.eUC);
            matrix.postTranslate(((this.eUE[0] * floatValue) + ((1.0f - floatValue) * this.eUD[0])), ((this.eUE[1] * floatValue) + ((1.0f - floatValue) * this.eUD[1])));
            b bVar = this.eUF;
            if (bVar != null) {
                bVar.am(matrix);
                AppMethodBeat.o(12900);
                return;
            }
            AppMethodBeat.o(12900);
        }
    }

    public a() {
        AppMethodBeat.i(12905);
        AppMethodBeat.o(12905);
    }

    public final void b(RectF rectF) {
        AppMethodBeat.i(12901);
        j.p(rectF, "<set-?>");
        this.eUx = rectF;
        AppMethodBeat.o(12901);
    }

    public final void g(float[] fArr) {
        AppMethodBeat.i(12902);
        j.p(fArr, "<set-?>");
        this.eUy = fArr;
        AppMethodBeat.o(12902);
    }

    public final void a(Matrix matrix, b<? super Matrix, y> bVar) {
        AppMethodBeat.i(12903);
        j.p(matrix, "matrix");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, this.eUy);
        float[] fArr2 = new float[]{i(fArr[0], this.eUx.left, this.eUx.right), i(fArr[1], this.eUx.top, this.eUx.bottom)};
        float[] fArr3 = new float[9];
        matrix.getValues(fArr3);
        double d = (double) fArr3[0];
        double d2 = (double) fArr3[3];
        float sqrt = (float) Math.sqrt((d * d) + (d2 * d2));
        float round = (float) Math.round(Math.atan2(d2, (double) fArr3[4]) * 57.29577951308232d);
        float i = i(sqrt, this.aJg, this.aJf);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        j.o(ofFloat, "animator");
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new a(this, sqrt, i, round, fArr, fArr2, bVar));
        ofFloat.start();
        AppMethodBeat.o(12903);
    }

    private static float i(float f, float f2, float f3) {
        AppMethodBeat.i(12904);
        float max = Math.max(f2, Math.min(f, f3));
        AppMethodBeat.o(12904);
        return max;
    }
}
