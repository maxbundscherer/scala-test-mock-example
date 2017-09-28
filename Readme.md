# Scala test mock example

[![shields.io](http://img.shields.io/badge/license-Apache2-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

**Scala test example with normal and mocked server**

Author: Maximilian Bundscherer (https://bundscherer-online.de)

## Overview / Features
- Simple example server and client included (see ``src/main/scala/com/mb/scalamockexample/*``)
- Server and client communicate over simple messages
- Include **normal** and **mocked server** test
    - normal-test - see ``src/test/scala/com/mb/scalamockexample/ExampleTest``
    - test with mocked server - see ``src/test/scala/com/mb/scalamockexample/ExampleMockedTest``
    
    
## Let's get started
1. See requirements!
2. Run tests ``sbt clean coverage test``
3. Generate coverage report(s) ``sbt coverageReport``

### Requirements
- SBT