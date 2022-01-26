import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String[] args) {
        try {
            String source = args[0];
            CharStream cs = fromFileName(source);
            AniLangLexer lexer = new AniLangLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AniLangParser parser = new AniLangParser(token);
            ParseTree tree = parser.program();

//            ParseTreeWalker walker = new ParseTreeWalker();
//            TranslatorListener extractor = new TranslatorListener(parser);
//            walker.walk(extractor, tree);

            TranslatorVisitor visitor = new TranslatorVisitor(parser);
            visitor.visit(tree);

        } catch (Exception e) {
//            e.printStackTrace(); //aby pozbyc sie wyswietlania niepokrytych bledów javowych
        }
    }
}
