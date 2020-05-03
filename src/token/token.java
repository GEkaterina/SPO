package token;
import lexer.lexem;


public class token {
    private lexem lexem;
    private String value;

    public token(lexem type, String value) {
        this.lexem = type;
        this.value = value;
    }

    public lexem getLexem() {
        return lexem;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Token{" +
                "lexem=" + lexem +
                ", value='" + value + '\'' +
                '}';
    }
}

