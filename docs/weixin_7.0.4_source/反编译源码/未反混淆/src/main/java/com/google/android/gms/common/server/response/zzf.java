package com.google.android.gms.common.server.response;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;

final class zzf implements zza<String> {
    zzf() {
    }

    public final /* synthetic */ Object zzh(FastParser fastParser, BufferedReader bufferedReader) {
        AppMethodBeat.i(61631);
        String zze = FastParser.zze(fastParser, bufferedReader);
        AppMethodBeat.o(61631);
        return zze;
    }
}
