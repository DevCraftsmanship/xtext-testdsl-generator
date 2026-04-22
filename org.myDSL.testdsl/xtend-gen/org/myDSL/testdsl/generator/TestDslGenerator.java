package org.myDSL.testdsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.myDSL.testdsl.testDsl.Model;
import org.myDSL.testdsl.testDsl.Step;
import org.myDSL.testdsl.testDsl.TestCase;

@SuppressWarnings("all")
public class TestDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    String _name = model.getName();
    String _plus = (_name + ".txt");
    fsa.generateFile(_plus, this.compile(model));
  }

  private CharSequence compile(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"testSuite\": \"");
    String _name = m.getName();
    _builder.append(_name, "  ");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("\"testCases\": [");
    _builder.newLine();
    {
      EList<TestCase> _testCases = m.getTestCases();
      boolean _hasElements = false;
      for(final TestCase tc : _testCases) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "    ");
        }
        _builder.append("    ");
        _builder.append("{");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("  ");
        _builder.append("\"name\": \"");
        String _name_1 = tc.getName();
        _builder.append(_name_1, "      ");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("  ");
        _builder.append("\"steps\": [");
        _builder.newLine();
        {
          EList<Step> _steps = tc.getSteps();
          boolean _hasElements_1 = false;
          for(final Step step : _steps) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "        ");
            }
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("{");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("  ");
            _builder.append("\"type\": \"");
            String _name_2 = step.eClass().getName();
            _builder.append(_name_2, "          ");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("  ");
            _builder.append("\"key\": \"");
            String _key = step.getKey();
            _builder.append(_key, "          ");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("  ");
            _builder.append("\"value\": \"");
            String _value = step.getValue();
            _builder.append(_value, "          ");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("    ");
        _builder.append("  ");
        _builder.append("]");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
