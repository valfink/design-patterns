package org.example;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private Interpreter() {
        super();
    }

    public static List<Token> lex(String text) {
        ArrayList<Token> tokens = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case '+' -> tokens.add(new Token(TokenType.PLUS, "+"));
                case '-' -> tokens.add(new Token(TokenType.MINUS, "-"));
                case '(' -> tokens.add(new Token(TokenType.LEFT_PARENTHESIS, "("));
                case ')' -> tokens.add(new Token(TokenType.RIGHT_PARENTHESIS, ")"));
                // default is for integers!
                default -> {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(text.charAt(i)));
                    for (int j = i + 1; j < text.length(); j++) {
                        if (Character.isDigit(text.charAt(j))) {
                            stringBuilder.append(text.charAt(j));
                            i++;
                        } else {
                            tokens.add(new Token(TokenType.INTEGER, stringBuilder.toString()));
                            break;
                        }
                    }
                }
            }
        }
        return tokens;
    }

    public static LexElement parse(List<Token> tokens) {
        LexBinaryOperation binaryOperation = new LexBinaryOperation();
        boolean completedLeftHandSide = false;

        for (int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);

            switch (token.type()) {
                case INTEGER -> {
                    LexInteger lexInteger = new LexInteger(Integer.parseInt(token.text()));
                    if (!completedLeftHandSide) {
                        binaryOperation.left = lexInteger;
                        completedLeftHandSide = true;
                    } else {
                        binaryOperation.right = lexInteger;
                    }
                }
                case PLUS -> binaryOperation.operationType = LexOperationType.ADDITION;
                case MINUS -> binaryOperation.operationType = LexOperationType.SUBTRACTION;
                case LEFT_PARENTHESIS -> {
                    int j = i + 1;
                    while (j < tokens.size()) {
                        if (tokens.get(j).type() == TokenType.RIGHT_PARENTHESIS) {
                            break;
                        }
                        j++;
                    }
                    List<Token> subExpression = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .toList();
                    LexElement element = parse(subExpression);
                    if (!completedLeftHandSide) {
                        binaryOperation.left = element;
                        completedLeftHandSide = true;
                    } else {
                        binaryOperation.right = element;
                    }
                    i = j;
                }
                case RIGHT_PARENTHESIS -> {
                    // this case should never happen, is covered by LEFT_PARENTHESIS!
                }
            }
        }

        return binaryOperation;
    }
}
