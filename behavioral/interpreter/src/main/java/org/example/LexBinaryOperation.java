package org.example;

public class LexBinaryOperation implements LexElement {
    public LexOperationType operationType;
    public LexElement left;
    public LexElement right;

    @Override
    public int eval() {
        return switch (operationType) {
            case ADDITION -> left.eval() + right.eval();
            case SUBTRACTION -> left.eval() - right.eval();
            // purposely left out default case, in video it returned 0
        };
    }
}
