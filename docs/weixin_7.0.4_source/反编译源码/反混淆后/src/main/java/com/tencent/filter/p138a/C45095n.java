package com.tencent.filter.p138a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.C25624m.C0933f;
import com.tencent.filter.C25624m.C0934g;
import com.tencent.filter.C25624m.C0936o;
import com.tencent.filter.GLSLRender;
import com.tencent.matrix.trace.core.AppMethodBeat;

/* renamed from: com.tencent.filter.a.n */
public final class C45095n extends BaseFilter {
    public C45095n() {
        super(GLSLRender.bJB);
    }

    public final void ApplyGLSLFilter(boolean z, float f, float f2) {
        AppMethodBeat.m2504i(86454);
        BaseFilter baseFilter = new BaseFilter(GLSLRender.bKH);
        float[] fArr = new float[]{1.0f, 1.0f, 1.0f};
        baseFilter.addParam(new C0934g("channelparam", new float[]{0.4f, 0.4f, 0.2f}));
        baseFilter.addParam(new C0934g("mixparam", fArr));
        setNextFilter(baseFilter, null);
        BaseFilter baseFilter2 = new BaseFilter(GLSLRender.bKD);
        baseFilter2.addParam(new C0936o("inputImageTexture2", "sh/coffee_curve.png", 33986));
        baseFilter.setNextFilter(baseFilter2, null);
        baseFilter = new BaseFilter(GLSLRender.bLN);
        baseFilter.addParam(new C0934g("color2", new float[]{0.22352941f, 0.19215687f, 0.16078432f, 1.0f}));
        baseFilter.addParam(new C0933f("transparency", 1.0f));
        baseFilter2.setNextFilter(baseFilter, null);
        baseFilter2 = new BaseFilter(GLSLRender.bLN);
        baseFilter2.addParam(new C0934g("color2", new float[]{0.44313726f, 0.39215687f, 0.36078432f, 1.0f}));
        baseFilter2.addParam(new C0933f("transparency", 1.0f));
        baseFilter.setNextFilter(baseFilter2, null);
        super.ApplyGLSLFilter(z, f, f2);
        AppMethodBeat.m2505o(86454);
    }
}
