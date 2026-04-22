\# TestDSL



A Domain Specific Language (DSL) built using Xtext to define and generate structured test cases.



\## Features

\- Define Test Suites and Test Cases

\- Add inputs and expected outputs

\- Generate JSON output format for automation in txt file



\## Example



```dsl

TestSuite LoginTest



TestCase validLogin:

&#x20;   input username = "admin"

&#x20;   input password = "1234"

&#x20;   expect status = SUCCESS

