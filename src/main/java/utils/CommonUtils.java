package utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Roman_Tretyak on 5/21/2015.
 */
public  class CommonUtils {
    protected static final Logger log = LogManager.getLogger(CommonUtils.class);

    public static boolean compareTwoLists(List<String> a, List<String> b){

        if (a.size() != b.size()){
            log.info("Collections are different by size");
            return false;
        }

        for (int i = 0; i < a.size(); i++) {
            log.info("Comparing two Lists: " + a.get(i) + " with " + b.get(i));
            if (!a.get(i).equalsIgnoreCase(b.get(i))) {
                log.info("Array " + a.get(i) + " are different with array " + b.get(i));
                return false;
            }
        }
        return true;
    }
}
