package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void inbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void closingBracketStarterFails() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }
    @Test
    public void noBracketsPasses() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test"));
    }
    @Test
    public void extraClosingBracketFails() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]][]]][[[]"));
    }
    @Test
    public void nestedBracketsPass() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[]]]]]"));
    }
    @Test
    public void mixedNestsPass() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][][[[]]]]"));
    }
    @Test
    public void nestedExtraClosingBracketsFails() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
    }
    @Test
    public void noClosingBracketFails() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    @Test
    public void codeWithTextPasses() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
}