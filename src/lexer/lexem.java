package lexer;

import java.util.regex.Pattern;

public enum lexem {
    VAR ("[a-zA-Z]+"),
    DIGIT ("0|([1-9][0-9]*)"),
    ASSIGN_OP ("="),
    OP ("+|-|*|/"),
    LOGICAL_OP (">|<|>=|<=|=="),
    SEMICOLON (";"),
    L_BRACKET ("\\("),
    R_BRACKET ("\\)"),
    L_QBRACKET ("\\{"),
    R_QBRACKET ("\\}"),
    IF_K ("if"),
    WHILE_K ("while"),
    FOR_K ("for");

    private final Pattern pattern;

    lexem(String regexp) {
        this.pattern = Pattern.compile(regexp);
    }

    public Pattern getPattern() {
        return pattern;
    }

}
