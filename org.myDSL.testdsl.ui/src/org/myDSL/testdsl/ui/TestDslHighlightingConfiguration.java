package org.myDSL.testdsl.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class TestDslHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String MY_KEYWORD_ID = "mydsl_keyword";
	public static final String MY_STRING_ID = "mydsl_string";

    @Override
    public void configure(IHighlightingConfigurationAcceptor acceptor) {
        super.configure(acceptor);

        acceptor.acceptDefaultHighlighting(MY_KEYWORD_ID, "MyDSL Keyword", keywordTextStyle());
        acceptor.acceptDefaultHighlighting(MY_STRING_ID, "MyDSL String", stringTextStyle());
    }

    public TextStyle keywordTextStyle() {
        TextStyle style = defaultTextStyle().copy();
        style.setColor(new RGB(127, 0, 85));
        style.setStyle(SWT.BOLD);
        return style;
    }

    public TextStyle stringTextStyle() {
        TextStyle style = defaultTextStyle().copy();
        style.setColor(new RGB(42, 0, 255));
        return style;
    }
}
