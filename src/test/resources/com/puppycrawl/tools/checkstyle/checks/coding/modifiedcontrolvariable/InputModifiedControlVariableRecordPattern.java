/*
ModifiedControlVariable
skipEnhancedForLoopVariable = (default)false

*/

package com.puppycrawl.tools.checkstyle.checks.coding.modifiedcontrolvariable;

public class InputModifiedControlVariableRecordPattern {
    record Pair(int x, int y) {}

    public void test(Pair[] pairs, String[] lines) {
        for (String line : lines) {
            for (Pair(int x, int y) : pairs) {
            }
            line = "modified"; // violation 'Control variable 'line' is modified.'
        }
    }
}
