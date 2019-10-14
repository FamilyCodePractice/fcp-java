package com.fcp.sols;

import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Slf4j
public class BalanceStringSplitTests {
    private static BalanceStringSplit bss;

    @BeforeClass
    public static void init() {
        bss = new BalanceStringSplit();
    }

    @Test
    public void testLeetCodeExamples() {
        String[] strs = new String[] { "RLRRLLRLRL", "RLLLLRRRLR", "LLLLRRRR", "RRLRRLRLLLRL" };
        int[] expected = new int[] { 4, 3, 1, 2 };

        for (int i = 0; i < strs.length; ++i) {
            log.info("i = {}", i);
            int val = bss.balancedStringSplit(strs[i]);
            assertEquals(val, expected[i]);
        }
    }
}
