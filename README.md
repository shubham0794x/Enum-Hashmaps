# Enum-Hashmaps

- Use Enums to create grouped constants
- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters.

- Use HashMaps to store easily searchable items
- The most common use case for HashMaps is creating constant time lookup capability to a collection of data.

Often HashMaps are used for lookups on objects that are held in memory (SQL is much more powerful for lookups on objects that are not in memory). For example, we may want to lookup country objects by countryName
