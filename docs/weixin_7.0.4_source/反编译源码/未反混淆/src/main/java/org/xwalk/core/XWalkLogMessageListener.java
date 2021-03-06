package org.xwalk.core;

import java.util.ArrayList;

public abstract class XWalkLogMessageListener {
    static final /* synthetic */ boolean $assertionsDisabled = (!XWalkLogMessageListener.class.desiredAssertionStatus());
    private Object bridge;
    private ArrayList<Object> constructorParams = new ArrayList();
    private ArrayList<Object> constructorTypes = new ArrayList();
    private XWalkCoreWrapper coreWrapper;
    private ReflectMethod postWrapperMethod;

    public abstract void onLogMessage(int i, String str, int i2, String str2);

    /* Access modifiers changed, original: protected */
    public Object getBridge() {
        return this.bridge;
    }

    public XWalkLogMessageListener() {
        reflectionInit();
    }

    public XWalkLogMessageListener(XWalkCoreWrapper xWalkCoreWrapper) {
        this.coreWrapper = xWalkCoreWrapper;
        reflectionInit();
    }

    /* Access modifiers changed, original: 0000 */
    public void reflectionInit() {
        if (this.coreWrapper == null) {
            XWalkCoreWrapper.initEmbeddedMode();
            this.coreWrapper = XWalkCoreWrapper.getInstance();
        }
        if (this.coreWrapper == null) {
            XWalkCoreWrapper.reserveReflectObject(this);
            return;
        }
        int size = this.constructorTypes.size();
        Class[] clsArr = new Class[(size + 1)];
        for (int i = 0; i < size; i++) {
            Object obj = this.constructorTypes.get(i);
            if (obj instanceof String) {
                clsArr[i] = this.coreWrapper.getBridgeClass((String) obj);
                this.constructorParams.set(i, this.coreWrapper.getBridgeObject(this.constructorParams.get(i)));
            } else if (obj instanceof Class) {
                clsArr[i] = (Class) obj;
            } else if (!$assertionsDisabled) {
                throw new AssertionError();
            }
        }
        clsArr[size] = Object.class;
        this.constructorParams.add(this);
        try {
            this.bridge = new ReflectConstructor(this.coreWrapper.getBridgeClass("XWalkLogMessageListenerBridge"), clsArr).newInstance(this.constructorParams.toArray());
            if (this.postWrapperMethod != null) {
                this.postWrapperMethod.invoke(new Object[0]);
            }
        } catch (UnsupportedOperationException e) {
        }
    }
}
