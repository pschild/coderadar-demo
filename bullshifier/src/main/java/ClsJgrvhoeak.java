import helpers.Config;
import helpers.Context;

import java.util.*;
import java.io.IOException;


public class ClsJgrvhoeak {
    public static final int classId = 166;

    public static void metZlypv(Context context) throws Exception {
        int methodId = 0;
        Map<Object, Object> root = new HashMap();
        Object[] mapValHjoffmakwgr = new Object[6];
        Set<Object> valMaailsulpcf = new HashSet<Object>();
        long valRppnifldhcl = -9087315916170497559L;

        valMaailsulpcf.add(valRppnifldhcl);
        boolean valWsslyacttnk = false;

        valMaailsulpcf.add(valWsslyacttnk);

        mapValHjoffmakwgr[0] = valMaailsulpcf;
        for (int i = 1; i < 6; i++) {
            mapValHjoffmakwgr[i] = Config.get().getRandom().nextInt(1000);
        }


        List<Object> mapKeySnjtsmozsow = new LinkedList<Object>();
        List<Object> valXpvtwxvislt = new LinkedList<Object>();
        long valUgfpadybyla = -617122945266996267L;

        valXpvtwxvislt.add(valUgfpadybyla);

        mapKeySnjtsmozsow.add(valXpvtwxvislt);

        root.put("mapValHjoffmakwgr", "mapKeySnjtsmozsow");
        Object[] mapValSkskuitbtup = new Object[6];
        List<Object> valEneiogsbzcj = new LinkedList<Object>();
        long valEyjsjpdykep = 400133810397120569L;

        valEneiogsbzcj.add(valEyjsjpdykep);
        boolean valGtuidyjtkby = false;

        valEneiogsbzcj.add(valGtuidyjtkby);

        mapValSkskuitbtup[0] = valEneiogsbzcj;
        for (int i = 1; i < 6; i++) {
            mapValSkskuitbtup[i] = Config.get().getRandom().nextInt(1000);
        }


        List<Object> mapKeyGvwqjhunwrf = new LinkedList<Object>();
        List<Object> valXebzhpwakwp = new LinkedList<Object>();
        String valDvctnhmtyzk = "StrSoldkuoizcq";

        valXebzhpwakwp.add(valDvctnhmtyzk);

        mapKeyGvwqjhunwrf.add(valXebzhpwakwp);

        root.put("mapValSkskuitbtup", "mapKeyGvwqjhunwrf");

        if (Config.get().shouldThrowSomething(methodId, classId)) {
            if (Config.get().shouldThrow1000()) {
                for (int i = 0; i < 1000; i++) {
                    try {
                        throw new IllegalStateException("Time for Illegal state exception, context is " + context);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }

            if (Config.get().shouldThrowIllegal(context)) {
                throw new IllegalStateException("Time for Illegal state exception, context is " + context);

            }

            if (Config.get().shouldThrowIO(context)) {
                throw new IOException("Time for IO exception, context is " + context);

            }
        }

        if (Config.get().shouldSuicide()) {
            System.out.println("shouldSuicide.. ");
            System.exit(0);
        }

        if (Config.get().shouldRunAway(context)) {
            return;
        }

        Config.get().updateContext(context);
        int methodToCall = Config.get().getRandom().nextInt(5);
    }

}