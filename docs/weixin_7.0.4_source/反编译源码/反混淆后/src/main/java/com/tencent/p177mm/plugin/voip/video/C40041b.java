package com.tencent.p177mm.plugin.voip.video;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.tencent.mm.plugin.voip.video.b */
public final class C40041b implements EGLConfigChooser {
    private static int EGL_OPENGL_ES2_BIT = 4;
    private static int[] eZf = new int[]{12324, 4, 12323, 4, 12322, 4, 12352, EGL_OPENGL_ES2_BIT, 12344};
    protected int mAlphaSize;
    protected int mBlueSize;
    protected int mDepthSize;
    protected int mGreenSize;
    protected int mRedSize;
    protected int mStencilSize;
    private int[] mValue = new int[1];

    public C40041b(int i, int i2, int i3, int i4) {
        AppMethodBeat.m2504i(5046);
        this.mRedSize = i;
        this.mGreenSize = i2;
        this.mBlueSize = i3;
        this.mAlphaSize = i4;
        this.mDepthSize = 0;
        this.mStencilSize = 0;
        AppMethodBeat.m2505o(5046);
    }

    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        AppMethodBeat.m2504i(5047);
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, eZf, null, 0, iArr);
        int i = iArr[0];
        if (i <= 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No configs match configSpec");
            AppMethodBeat.m2505o(5047);
            throw illegalArgumentException;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        egl10.eglChooseConfig(eGLDisplay, eZf, eGLConfigArr, i, iArr);
        EGLConfig chooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
        AppMethodBeat.m2505o(5047);
        return chooseConfig;
    }

    private EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        AppMethodBeat.m2504i(5048);
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int a = m68615a(egl10, eGLDisplay, eGLConfig, 12325);
            int a2 = m68615a(egl10, eGLDisplay, eGLConfig, 12326);
            if (a >= this.mDepthSize && a2 >= this.mStencilSize) {
                a = m68615a(egl10, eGLDisplay, eGLConfig, 12324);
                a2 = m68615a(egl10, eGLDisplay, eGLConfig, 12323);
                int a3 = m68615a(egl10, eGLDisplay, eGLConfig, 12322);
                int a4 = m68615a(egl10, eGLDisplay, eGLConfig, 12321);
                if (a == this.mRedSize && a2 == this.mGreenSize && a3 == this.mBlueSize && a4 == this.mAlphaSize) {
                    AppMethodBeat.m2505o(5048);
                    return eGLConfig;
                }
            }
        }
        AppMethodBeat.m2505o(5048);
        return null;
    }

    /* renamed from: a */
    private int m68615a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        AppMethodBeat.m2504i(5049);
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue)) {
            int i2 = this.mValue[0];
            AppMethodBeat.m2505o(5049);
            return i2;
        }
        AppMethodBeat.m2505o(5049);
        return 0;
    }
}
