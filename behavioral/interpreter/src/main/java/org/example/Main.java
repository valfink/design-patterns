package org.example;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String calculation = "(13-4)-(12+7)";
        List<Token> tokenList = Interpreter.lex(calculation);
        System.out.println(tokenList.stream()
                .map(Objects::toString)
                .collect(Collectors.joining("\n")));
        LexElement parsed = Interpreter.parse(tokenList);
        System.out.println(calculation + " = " + parsed.eval());
    }
}