# pcm-data-type-language
Data type modeling language for the Palldio Component Model

The data type languages allows to model data types for Java entity beans
providing an abstraction which is close to EMF and UML class diagrams.

Fratures:
 * The language uses Java like imports and package declarations, but allows
   to define more than one entity per file.
 * Support for enumerations and entity types.
 * Enumerations may inherit from other enumerations.
 * Entities can have only one parent. Therefore, no support for interfaces
   or other means of multi inheritance.
 * By specifying a storage modifier, it is possible to control the 
   embeddable feature of JPA (see JPA documentation for detail).
 * Properties can be declared transient, or unchangable (value)
 * A property can be unique and a key.

For details, see grammar and generator (for now).
