*Remember: The point of these problems is not to have a working business-wise piece of code, but to write the code as extensible, readable and maintainable as possible which often times implies the usage of design patterns. Still the programs must be demonstratable (may well be console apps).*

Please implement the following tasks.

# Creational Patterns

1. **Factory Method.** Depending on the value of a String parameter ("doc", "docx", "xls", "xlsx") you need to export (convert) the file of the corresponding format to HTML. (Can it be done without factory methods? How?)
2. **Abstract Factory.** Imagine you need to develop a generic documents builder. Each _document_ is known to have the _header_ and the _body_. Those parts are to be programmatically processed later. Considering the requirements, you come up with the following entities: _Header_, _Body_, _Document_ (with properties _header_ and _body_). What is left is to develop a mechanism to create specific document parts (like _HTTPResponseHeader_ or _HTMLHeader_) via abstract calls like _factory.createHeader(List<Header>)_ or _factory.createBody(String)_. Please implement all class hierarchies needed for several document types (_HTTPResponse_, _Email_, _HTML_, _SOAP_).

##### READING

| Resource      | Comment       |
| ------------- | ------------- |
| https://en.wikipedia.org/wiki/Factory_method_pattern | Factory Method at Wiki |
| http://www.oodesign.com/factory-method-pattern.html | Also worth reading |
| https://en.wikipedia.org/wiki/Abstract_factory_pattern | Abstract Factory at Wiki |
| http://www.oodesign.com/abstract-factory-pattern.html | The same at OODesign |
