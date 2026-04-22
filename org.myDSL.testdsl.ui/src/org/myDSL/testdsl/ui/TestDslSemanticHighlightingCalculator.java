package org.myDSL.testdsl.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.resource.XtextResource;

public class TestDslSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

	@Override
	protected void doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
	    if (resource == null || resource.getParseResult() == null)
	        return;

	    
	    resource.getParseResult().getRootNode().getLeafNodes().forEach(node -> {
	        String text = node.getText().trim();  // 🔥 IMPORTANT FIX
	        
	        System.out.println("NODE: [" + node.getText() + "]");

	        if ((text.equals("TestSuite") || text.equals("TestCase")
	                || text.equals("input") || text.equals("expect"))) {
	            acceptor.addPosition(node.getOffset(), node.getLength(),
	                    TestDslHighlightingConfiguration.MY_KEYWORD_ID);
	        }

	        if (text.startsWith("\"") && text.endsWith("\"")) {
	            acceptor.addPosition(node.getOffset(), node.getLength(),
	                    TestDslHighlightingConfiguration.MY_STRING_ID);
	        }
	    });
	}

}
