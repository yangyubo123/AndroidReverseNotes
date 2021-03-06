package org.xwalk.core.extension;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.xwalk.core.Log;

public class BindingObjectStore {
    private String TAG = "BindingObjectStore";
    private Map<String, BindingObject> mBindingObjects = new HashMap();
    private ExtensionInstanceHelper mInstance;

    public BindingObjectStore(MessageHandler messageHandler, ExtensionInstanceHelper extensionInstanceHelper) {
        AppMethodBeat.m2504i(86083);
        this.mInstance = extensionInstanceHelper;
        messageHandler.register("JSObjectCollected", "onJSObjectCollected", this);
        messageHandler.register(JsStubGenerator.MSG_TO_OBJECT, "onPostMessageToObject", this);
        messageHandler.register(JsStubGenerator.MSG_TO_CLASS, "onPostMessageToClass", this);
        AppMethodBeat.m2505o(86083);
    }

    public boolean addBindingObject(String str, BindingObject bindingObject) {
        AppMethodBeat.m2504i(86084);
        if (this.mBindingObjects.containsKey(str)) {
            Log.m81051w(this.TAG, "Existing binding object:\n".concat(String.valueOf(str)));
            AppMethodBeat.m2505o(86084);
            return false;
        }
        bindingObject.initBindingInfo(str, this.mInstance);
        this.mBindingObjects.put(str, bindingObject);
        bindingObject.onJsBound();
        AppMethodBeat.m2505o(86084);
        return true;
    }

    public BindingObject getBindingObject(String str) {
        AppMethodBeat.m2504i(86085);
        BindingObject bindingObject = (BindingObject) this.mBindingObjects.get(str);
        AppMethodBeat.m2505o(86085);
        return bindingObject;
    }

    public BindingObject removeBindingObject(String str) {
        AppMethodBeat.m2504i(86086);
        BindingObject bindingObject = (BindingObject) this.mBindingObjects.remove(str);
        if (bindingObject != null) {
            bindingObject.onJsDestroyed();
        }
        AppMethodBeat.m2505o(86086);
        return bindingObject;
    }

    public void onJSObjectCollected(MessageInfo messageInfo) {
        AppMethodBeat.m2504i(86087);
        removeBindingObject(messageInfo.getObjectId());
        AppMethodBeat.m2505o(86087);
    }

    public Object onPostMessageToClass(MessageInfo messageInfo) {
        Object obj = null;
        AppMethodBeat.m2504i(86088);
        JSONArray args = messageInfo.getArgs();
        try {
            MessageInfo messageInfo2 = new MessageInfo(messageInfo);
            String string = args.getString(0);
            args = args.getJSONArray(1);
            String string2 = args.getString(0);
            args = args.getJSONArray(1);
            messageInfo2.setJsName(string);
            messageInfo2.setArgs(args);
            obj = messageInfo.getExtension().getTargetReflect(string2).handleMessage(messageInfo2, null);
        } catch (JSONException e) {
            Log.m81046e(this.TAG, e.toString());
        } catch (Exception e2) {
            Log.m81046e(this.TAG, e2.toString());
        }
        AppMethodBeat.m2505o(86088);
        return obj;
    }

    public Object onPostMessageToObject(MessageInfo messageInfo) {
        AppMethodBeat.m2504i(86089);
        Object obj = null;
        try {
            BindingObject bindingObject = getBindingObject(messageInfo.getObjectId());
            MessageInfo messageInfo2 = new MessageInfo(messageInfo);
            if (messageInfo.getArgs() != null) {
                JSONArray args = messageInfo.getArgs();
                String string = args.getString(0);
                args = args.getJSONArray(1);
                messageInfo2.setJsName(string);
                messageInfo2.setArgs(args);
            } else {
                ByteBuffer binaryArgs = messageInfo.getBinaryArgs();
                binaryArgs.order(ByteOrder.LITTLE_ENDIAN);
                int position = binaryArgs.position();
                int i = binaryArgs.getInt(position);
                position += 4;
                int i2 = (4 - (i % 4)) + i;
                String str = new String(binaryArgs.array(), position, i);
                position += i2;
                binaryArgs = ByteBuffer.wrap(binaryArgs.array(), position, binaryArgs.array().length - position);
                messageInfo2.setJsName(str);
                messageInfo2.setBinaryArgs(binaryArgs);
            }
            if (bindingObject != null) {
                obj = bindingObject.handleMessage(messageInfo2);
            }
        } catch (IndexOutOfBoundsException | NullPointerException | JSONException e) {
            Log.m81046e(this.TAG, e.toString());
        }
        AppMethodBeat.m2505o(86089);
        return obj;
    }

    public void onStart() {
        AppMethodBeat.m2504i(86090);
        for (Entry value : this.mBindingObjects.entrySet()) {
            ((BindingObject) value.getValue()).onStart();
        }
        AppMethodBeat.m2505o(86090);
    }

    public void onResume() {
        AppMethodBeat.m2504i(86091);
        for (Entry value : this.mBindingObjects.entrySet()) {
            ((BindingObject) value.getValue()).onResume();
        }
        AppMethodBeat.m2505o(86091);
    }

    public void onPause() {
        AppMethodBeat.m2504i(86092);
        for (Entry value : this.mBindingObjects.entrySet()) {
            ((BindingObject) value.getValue()).onPause();
        }
        AppMethodBeat.m2505o(86092);
    }

    public void onStop() {
        AppMethodBeat.m2504i(86093);
        for (Entry value : this.mBindingObjects.entrySet()) {
            ((BindingObject) value.getValue()).onStop();
        }
        AppMethodBeat.m2505o(86093);
    }

    public void onDestroy() {
        AppMethodBeat.m2504i(86094);
        for (Entry value : this.mBindingObjects.entrySet()) {
            ((BindingObject) value.getValue()).onDestroy();
        }
        AppMethodBeat.m2505o(86094);
    }
}
