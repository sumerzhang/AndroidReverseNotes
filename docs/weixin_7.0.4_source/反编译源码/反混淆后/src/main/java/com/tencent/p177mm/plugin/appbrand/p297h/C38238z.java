package com.tencent.p177mm.plugin.appbrand.p297h;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.ipcinvoker.C45413i;
import com.tencent.p177mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p177mm.ipcinvoker.type.IPCString;
import com.tencent.p177mm.ipcinvoker.type.IPCVoid;
import com.tencent.p177mm.kernel.C1720g;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import com.tencent.p177mm.sdk.platformtools.C5046bo;

/* renamed from: com.tencent.mm.plugin.appbrand.h.z */
public final class C38238z {
    private static String htk;

    /* renamed from: com.tencent.mm.plugin.appbrand.h.z$a */
    static final class C33214a implements C45413i<IPCVoid, IPCString> {
        private C33214a() {
        }

        /* renamed from: am */
        public final /* synthetic */ Object mo4785am(Object obj) {
            AppMethodBeat.m2504i(131679);
            String str = C1720g.m3536RP().cachePath;
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            IPCString iPCString = new IPCString(str + "appbrand/jscache");
            AppMethodBeat.m2505o(131679);
            return iPCString;
        }
    }

    public static String aBv() {
        AppMethodBeat.m2504i(131680);
        String absolutePath;
        if (C5046bo.isNullOrNil(htk)) {
            IPCString iPCString;
            try {
                iPCString = (IPCString) XIPCInvoker.m83628a("com.tencent.mm", IPCVoid.eGH, C33214a.class);
            } catch (Exception e) {
                C4990ab.m7413e("MicroMsg.V8CodeCachePathRetriever", "retrieve ipc ex = %s", e);
                iPCString = null;
            }
            if (iPCString == null) {
                absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                if (!absolutePath.endsWith("/")) {
                    absolutePath = absolutePath + "/";
                }
                absolutePath = absolutePath + "Tencent/MicroMsg/wxajscache";
                AppMethodBeat.m2505o(131680);
                return absolutePath;
            }
            absolutePath = iPCString.value;
            htk = absolutePath;
            AppMethodBeat.m2505o(131680);
            return absolutePath;
        }
        absolutePath = htk;
        AppMethodBeat.m2505o(131680);
        return absolutePath;
    }
}
