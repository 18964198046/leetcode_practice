package practice.leecode.Tencent.BackTrackAlgorithm;

import org.junit.Test;
import practice.utils.JacksonUtils;

public class SubsetsTest {

    @Test
    public void subsets() {

        Subsets subsets = new Subsets();
        System.out.println(JacksonUtils.toJson(subsets.subsets(new int[]{1,2,3})));
        System.out.println(JacksonUtils.toJson(subsets.subsets(new int[]{3,2,4,1})));


    }

}