package com.tencent.mars.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import com.tencent.p177mm.sdk.platformtools.C4996ah;
import com.tencent.p177mm.sdk.platformtools.C5023at;
import com.tencent.p177mm.sdk.platformtools.C7306ak;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.io.PrintWriter;
import java.io.StringWriter;

public class PlatformComm {
    static final int EMobile = 2;
    static final int ENoNet = -1;
    static final int EOtherNet = 3;
    static final int EWifi = 1;
    private static final boolean IS_PROXY_ON = false;
    static final int NETTYPE_2G = 3;
    static final int NETTYPE_3G = 4;
    static final int NETTYPE_4G = 5;
    static final int NETTYPE_NON = -1;
    static final int NETTYPE_NOT_WIFI = 0;
    static final int NETTYPE_UNKNOWN = 6;
    static final int NETTYPE_WAP = 2;
    static final int NETTYPE_WIFI = 1;
    private static final String TAG = "PlatformComm";
    private static Context context = null;
    private static C7306ak handler = null;
    public static IResetProcess resetprocessimp = null;

    static class APNInfo {
        public String extraInfo;
        public int netType;
        public int subNetType;

        APNInfo() {
        }
    }

    static class Assert {
        Assert() {
        }

        static void assertTrue(String str, boolean z) {
        }

        static void assertTrue(boolean z) {
        }
    }

    public static class C2Java {

        /* renamed from: com.tencent.mars.comm.PlatformComm$C2Java$1 */
        static class C10191 implements Runnable {
            C10191() {
            }

            public final void run() {
                PlatformComm.resetprocessimp.restartProcess();
            }
        }

        private static String exception2String(Exception exception) {
            StringWriter stringWriter = new StringWriter();
            exception.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        public static int getNetInfo() {
            NetworkInfo activeNetworkInfo;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) PlatformComm.context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    return -1;
                }
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return -1;
                }
                try {
                    switch (activeNetworkInfo.getType()) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            return 2;
                        case 1:
                            return 1;
                        default:
                            return 3;
                    }
                } catch (Exception e) {
                    C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                    return 3;
                }
            } catch (Exception e2) {
                activeNetworkInfo = null;
            }
        }

        public static int getProxyInfo(StringBuffer stringBuffer) {
            return -1;
        }

        public static int getStatisticsNetType() {
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return 0;
            }
            try {
                int netType = C5023at.getNetType(PlatformComm.context);
                if (netType == -1) {
                    return -1;
                }
                if (C5023at.is2G(PlatformComm.context)) {
                    return 3;
                }
                if (C5023at.is3G(PlatformComm.context)) {
                    return 4;
                }
                if (C5023at.is4G(PlatformComm.context)) {
                    return 5;
                }
                if (C5023at.isWifi(netType)) {
                    return 1;
                }
                if (C5023at.isWap(netType)) {
                    return 2;
                }
                return 6;
            } catch (Exception e) {
                C4990ab.m7412e(PlatformComm.TAG, exception2String(e));
                C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + VideoMaterialUtil.FRAMES_ID_SEPARATOR_3D + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return -1;
            }
        }

        public static boolean startAlarm(int i, int i2) {
            boolean z = false;
            if (PlatformComm.context == null) {
                Assert.assertTrue(z);
                return z;
            }
            try {
                return Alarm.start((long) i, i2, PlatformComm.context);
            } catch (Exception e) {
                C4990ab.m7412e(PlatformComm.TAG, exception2String(e));
                C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[z]);
                Assert.assertTrue(e.getClass().getSimpleName() + VideoMaterialUtil.FRAMES_ID_SEPARATOR_3D + e.getStackTrace()[z] + ", " + e.getStackTrace()[1], z);
                return z;
            }
        }

        public static boolean stopAlarm(int i) {
            boolean z = false;
            if (PlatformComm.context == null) {
                Assert.assertTrue(z);
                return z;
            }
            try {
                return Alarm.stop((long) i, PlatformComm.context);
            } catch (Exception e) {
                C4990ab.m7412e(PlatformComm.TAG, exception2String(e));
                C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[z]);
                Assert.assertTrue(e.getClass().getSimpleName() + VideoMaterialUtil.FRAMES_ID_SEPARATOR_3D + e.getStackTrace()[z] + ", " + e.getStackTrace()[1], z);
                return z;
            }
        }

        public static void restartProcess() {
            if (PlatformComm.resetprocessimp != null) {
                try {
                    PlatformComm.handler.post(new C10191());
                } catch (Exception e) {
                    C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                }
            }
        }

        public static WifiInfo getCurWifiInfo() {
            try {
                if (PlatformComm.context == null) {
                    return null;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) PlatformComm.context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    return null;
                }
                NetworkInfo activeNetworkInfo;
                try {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (Exception e) {
                    C4990ab.m7412e(PlatformComm.TAG, "getActiveNetworkInfo failed.");
                    activeNetworkInfo = null;
                }
                if (activeNetworkInfo != null) {
                    if (1 == activeNetworkInfo.getType()) {
                        WifiInfo wifiInfo = new WifiInfo();
                        wifiInfo.ssid = C5023at.m7474gE(C4996ah.getContext());
                        wifiInfo.bssid = C5023at.m7475gF(C4996ah.getContext());
                        return wifiInfo;
                    }
                }
                return null;
            } catch (Exception e2) {
                C4990ab.printErrStackTrace(PlatformComm.TAG, e2, "", new Object[0]);
                return null;
            }
        }

        public static SIMInfo getCurSIMInfo() {
            try {
                if (PlatformComm.context == null) {
                    return null;
                }
                int iSPCode = C5023at.getISPCode(PlatformComm.context);
                if (iSPCode == 0) {
                    return null;
                }
                SIMInfo sIMInfo = new SIMInfo();
                sIMInfo.ispCode = String.valueOf(iSPCode);
                C4990ab.m7411d(PlatformComm.TAG, "getISPCode MCC_MNC=%s", sIMInfo.ispCode);
                sIMInfo.ispName = C5023at.getISPName(PlatformComm.context);
                return sIMInfo;
            } catch (Exception e) {
                C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                return null;
            }
        }

        public static APNInfo getAPNInfo() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) PlatformComm.context.getSystemService("connectivity")).getActiveNetworkInfo();
                APNInfo aPNInfo = new APNInfo();
                if (activeNetworkInfo != null) {
                    aPNInfo.netType = activeNetworkInfo.getType();
                    aPNInfo.subNetType = activeNetworkInfo.getSubtype();
                    if (1 != activeNetworkInfo.getType()) {
                        String str;
                        if (activeNetworkInfo.getExtraInfo() == null) {
                            str = "";
                        } else {
                            str = activeNetworkInfo.getExtraInfo();
                        }
                        aPNInfo.extraInfo = str;
                        return aPNInfo;
                    }
                    aPNInfo.extraInfo = getCurWifiInfo().ssid;
                    return aPNInfo;
                }
            } catch (Exception e) {
                C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
            }
            return null;
        }

        public static long getSignal(boolean z) {
            try {
                if (PlatformComm.context == null) {
                    Assert.assertTrue(false);
                    return 0;
                } else if (z) {
                    return NetworkSignalUtil.getWifiSignalStrength();
                } else {
                    return NetworkSignalUtil.getGSMSignalStrength();
                }
            } catch (Exception e) {
                C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                return 0;
            }
        }

        public static boolean isNetworkConnected() {
            boolean z = false;
            if (PlatformComm.context == null) {
                Assert.assertTrue(z);
                return z;
            }
            try {
                return C5023at.isNetworkConnected(PlatformComm.context);
            } catch (Exception e) {
                C4990ab.m7412e(PlatformComm.TAG, exception2String(e));
                C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[z]);
                Assert.assertTrue(e.getClass().getSimpleName() + VideoMaterialUtil.FRAMES_ID_SEPARATOR_3D + e.getStackTrace()[z] + ", " + e.getStackTrace()[1], z);
                return z;
            }
        }

        public static int getCurRadioAccessNetworkInfo() {
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return 0;
            }
            try {
                return ((TelephonyManager) PlatformComm.context.getSystemService("phone")).getNetworkType();
            } catch (Exception e) {
                C4990ab.m7412e(PlatformComm.TAG, exception2String(e));
                C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + VideoMaterialUtil.FRAMES_ID_SEPARATOR_3D + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return 0;
            }
        }

        public static WakerLock wakeupLock_new() {
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return null;
            }
            try {
                return new WakerLock(PlatformComm.context, PlatformComm.TAG);
            } catch (Exception e) {
                C4990ab.m7412e(PlatformComm.TAG, exception2String(e));
                C4990ab.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + VideoMaterialUtil.FRAMES_ID_SEPARATOR_3D + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return null;
            }
        }
    }

    public interface IResetProcess {
        void restartProcess();
    }

    static class SIMInfo {
        public String ispCode;
        public String ispName;

        SIMInfo() {
        }
    }

    static class WifiInfo {
        public String bssid;
        public String ssid;

        WifiInfo() {
        }
    }

    public static void init(Context context, C7306ak c7306ak) {
        context = context;
        handler = c7306ak;
        NetworkSignalUtil.InitNetworkSignalUtil(context);
    }
}
