import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ShortToUnicodeString extends ArrayInitBaseListener {
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) { System.out.print('"'); }
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) { System.out.print('"'); }
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
