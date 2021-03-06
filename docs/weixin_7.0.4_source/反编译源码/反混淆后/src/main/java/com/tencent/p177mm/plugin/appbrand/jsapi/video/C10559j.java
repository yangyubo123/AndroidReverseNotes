package com.tencent.p177mm.plugin.appbrand.jsapi.video;

import android.view.View;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.plugin.appbrand.jsapi.C33303e;
import com.tencent.p177mm.plugin.appbrand.jsapi.base.C45578c;
import com.tencent.p177mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p177mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.j */
public final class C10559j extends C45578c {
    private static final int CTRL_INDEX = 87;
    public static final String NAME = "updateVideoPlayer";

    /* renamed from: r */
    public final int mo6130r(JSONObject jSONObject) {
        AppMethodBeat.m2504i(126568);
        int optInt = jSONObject.optInt("videoPlayerId");
        AppMethodBeat.m2505o(126568);
        return optInt;
    }

    /* renamed from: c */
    public final boolean mo6167c(C33303e c33303e, int i, View view, JSONObject jSONObject) {
        AppMethodBeat.m2504i(126569);
        C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView : videoPlayerId=%d", Integer.valueOf(i));
        if (view instanceof CoverViewContainer) {
            AppBrandVideoView appBrandVideoView = (AppBrandVideoView) ((CoverViewContainer) view).mo60996ah(AppBrandVideoView.class);
            if (appBrandVideoView == null) {
                C4990ab.m7412e("MicroMsg.JsApiUpdateVideoPlayer", "view not AppBrandVideoView");
                AppMethodBeat.m2505o(126569);
                return false;
            }
            try {
                if (jSONObject.has("showDanmuBtn")) {
                    appBrandVideoView.setShowDanmakuBtn(jSONObject.getBoolean("showDanmuBtn"));
                }
            } catch (JSONException e) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showDanmuBtn", e.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("danmuList")) {
                    appBrandVideoView.setDanmakuItemList(jSONObject.getJSONArray("danmuList"));
                }
            } catch (JSONException e2) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "danmuList", e2.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("objectFit")) {
                    appBrandVideoView.setObjectFit(jSONObject.getString("objectFit"));
                }
            } catch (JSONException e22) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "objectFit", e22.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("autoplay")) {
                    appBrandVideoView.setAutoPlay(jSONObject.getBoolean("autoplay"));
                }
            } catch (JSONException e222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "autoplay", e222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("showBasicControls")) {
                    appBrandVideoView.setIsShowBasicControls(jSONObject.getBoolean("showBasicControls"));
                }
            } catch (JSONException e2222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showBasicControls", e2222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("poster")) {
                    appBrandVideoView.setCover$16da05f7(jSONObject.getString("poster"));
                }
            } catch (JSONException e22222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "poster", e22222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has(TencentLocation.EXTRA_DIRECTION)) {
                    appBrandVideoView.setFullScreenDirection(jSONObject.getInt(TencentLocation.EXTRA_DIRECTION));
                }
            } catch (Exception e3) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", TencentLocation.EXTRA_DIRECTION, e3.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("muted")) {
                    appBrandVideoView.setMute(jSONObject.getBoolean("muted"));
                }
            } catch (JSONException e222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "muted", e222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("loop")) {
                    appBrandVideoView.setLoop(jSONObject.getBoolean("loop"));
                }
            } catch (JSONException e2222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "loop", e2222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("data")) {
                    appBrandVideoView.setCookieData(jSONObject.getString("data"));
                }
            } catch (JSONException e22222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "data", e22222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("pageGesture")) {
                    appBrandVideoView.setPageGesture(jSONObject.getBoolean("pageGesture"));
                }
            } catch (JSONException e222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "pageGesture", e222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("pageGestureInFullscreen")) {
                    appBrandVideoView.setPageGestureInFullscreen(jSONObject.getBoolean("pageGestureInFullscreen"));
                }
            } catch (JSONException e2222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "pageGestureInFullscreen", e2222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("showControlProgress")) {
                    appBrandVideoView.setShowControlProgress(jSONObject.getBoolean("showControlProgress"));
                }
            } catch (JSONException e22222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showControlProgress", e22222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("showProgress")) {
                    appBrandVideoView.setShowProgress(jSONObject.getBoolean("showProgress"));
                }
            } catch (JSONException e222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showProgress", e222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("showFullScreenBtn")) {
                    appBrandVideoView.setShowFullScreenBtn(jSONObject.getBoolean("showFullScreenBtn"));
                }
            } catch (JSONException e2222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showFullScreenBtn", e2222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("showPlayBtn")) {
                    appBrandVideoView.setShowPlayBtn(jSONObject.getBoolean("showPlayBtn"));
                }
            } catch (JSONException e22222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showPlayBtn", e22222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("showCenterPlayBtn")) {
                    appBrandVideoView.setShowCenterPlayBtn(jSONObject.getBoolean("showCenterPlayBtn"));
                }
            } catch (JSONException e222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showCenterPlayBtn", e222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("enableProgressGesture")) {
                    appBrandVideoView.mo34626eq(jSONObject.getBoolean("enableProgressGesture"));
                }
            } catch (JSONException e2222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "enableProgressGesture", e2222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has(FFmpegMetadataRetriever.METADATA_KEY_DURATION)) {
                    appBrandVideoView.setDuration(jSONObject.getInt(FFmpegMetadataRetriever.METADATA_KEY_DURATION));
                }
            } catch (JSONException e22222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "disableScroll", e22222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has(MessengerShareContentUtility.SHARE_BUTTON_HIDE) && jSONObject.getBoolean(MessengerShareContentUtility.SHARE_BUTTON_HIDE)) {
                    C4990ab.m7416i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView hide stop");
                    appBrandVideoView.stop();
                }
            } catch (JSONException e222222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", MessengerShareContentUtility.SHARE_BUTTON_HIDE, e222222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("initialTime")) {
                    appBrandVideoView.setInitialTime((double) jSONObject.getInt("initialTime"));
                }
            } catch (JSONException e2222222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "initialTime", e2222222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("needEvent")) {
                    if (jSONObject.getBoolean("needEvent")) {
                        int i2;
                        if (appBrandVideoView.hZf != null) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (i2 == 0) {
                            appBrandVideoView.setCallback(new C33404k(appBrandVideoView, c33303e));
                        }
                    } else {
                        appBrandVideoView.setCallback(null);
                    }
                }
            } catch (JSONException e22222222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "needEvent", e22222222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("showMuteBtn")) {
                    appBrandVideoView.setShowMuteBtn(jSONObject.getBoolean("showMuteBtn"));
                }
            } catch (JSONException e222222222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "showMuteBtn", e222222222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("title")) {
                    appBrandVideoView.setTitle(jSONObject.getString("title"));
                }
            } catch (JSONException e2222222222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "title", e2222222222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("playBtnPosition")) {
                    appBrandVideoView.setPlayBtnPosition(jSONObject.getString("playBtnPosition"));
                }
            } catch (JSONException e22222222222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "playBtnPosition", e22222222222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("enablePlayGesture")) {
                    appBrandVideoView.setEnablePlayGesture(jSONObject.getBoolean("enablePlayGesture"));
                }
            } catch (JSONException e222222222222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "enablePlayGesture", e222222222222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("autoPauseIfOpenNative")) {
                    appBrandVideoView.setAutoPauseIfOpenNative(jSONObject.getBoolean("autoPauseIfOpenNative"));
                }
            } catch (JSONException e2222222222222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "autoPauseIfOpenNative", e2222222222222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("autoPauseIfNavigate")) {
                    appBrandVideoView.setAutoPauseIfNavigate(jSONObject.getBoolean("autoPauseIfNavigate"));
                }
            } catch (JSONException e22222222222222222222222222) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "autoPauseIfNavigate", e22222222222222222222222222.getLocalizedMessage());
            }
            try {
                if (jSONObject.has("filePath")) {
                    appBrandVideoView.mo34625e(jSONObject.getString("filePath"), jSONObject.optBoolean("live"), jSONObject.optInt(FFmpegMetadataRetriever.METADATA_KEY_DURATION));
                }
            } catch (JSONException e4) {
                C4990ab.m7417i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", "filePath", e4.getLocalizedMessage());
            }
            AppMethodBeat.m2505o(126569);
            return true;
        }
        C4990ab.m7421w("MicroMsg.JsApiUpdateVideoPlayer", "the view(%s) is not a instance of CoverViewContainer", Integer.valueOf(i));
        AppMethodBeat.m2505o(126569);
        return false;
    }
}
