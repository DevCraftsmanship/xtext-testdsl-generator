package org.myDSL.testdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.myDSL.testdsl.testDsl.Model

class TestDslGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val model = resource.contents.head as Model
        
        fsa.generateFile(model.name + ".txt", model.compile)
    }

 def private compile(Model m) '''
{
  "testSuite": "«m.name»",
  "testCases": [
    «FOR tc : m.testCases SEPARATOR ','»
    {
      "name": "«tc.name»",
      "steps": [
        «FOR step : tc.steps SEPARATOR ','»
        {
          "type": "«step.eClass.name»",
          "key": "«step.key»",
          "value": "«step.value»"
        }
        «ENDFOR»
      ]
    }
    «ENDFOR»
  ]
}
'''
}
