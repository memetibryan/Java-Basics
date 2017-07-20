> import java.util.Map;
Imported java.util.Map

>  import java.util.HashMap;
Imported java.util.HashMap

> Map<Integer, String> numbersAndWords = new HashMap<Integer, String>();
java.util.Map<java.lang.Integer, java.lang.String> numbersAndWords = {}

> numbersAndWords.put(1, "one");
java.lang.Object res13 = null

> numbersAndWords.put(2, "two");
java.lang.Object res14 = null

> numbersAndWords.put(3, "three");
java.lang.Object res15 = null

> numbersAndWords;
java.util.HashMap res16 = {1=one, 2=two, 3=three}

//to retrieve Hash Info
==================
//.get(value);
-----------------------------------------------------


// Returning all Keys
======================
// words.keySet();
// java.util.HashMap.keySet res = [fish, shoes, rain]
=========================================================
// This returns a key set that can be used in a for each loop.
-------------------------------------------------------------------

//Returning All Values
======================
//numbers.values()
//java.util.HashMap.Values res = [503-555-1212, 415-999-0000, 202-111-5599]
==================================================================
// This returns all values in the hash map saved into an array.
------------------------------------------------------------------------

//Checking if a HashMap Contains a Specific Key
==============================================
//words.containsKey("fish");
//java.lang.boolean res9 = true
==================================================
// This returns true if the hash map contains the key.
-----------------------------------------------------------------

//Checking if a HashMap Contains a Specific Value
=====================================================
//> capitols.containsValue("123-456-7890");
//java.lang.boolean res10 = false
===================================================
// This returns true if hash map contains the value.
-------------------------------------------------------------

//Iterating Through HashMap (We can iterate through a hash map by using the .keySet(); method. )
=================================================================================================
// for ( Object key : numbers.keySet() ) {
//   System.out.println(numbers.get(key));
// }
-------------------------------------------------------------

//or we can use the .values() method:
================================================== 
// for ( Object value : words.values() ) {
//   System.out.println(value);
// }
----------------------------------------------------

//example 2
> import java.util.Map;
Imported java.util.Map

> import java.util.HashMap;
Imported java.util.HashMap

> Map<String, String> numbers = new HashMap();
java.util.Map numbers = {}

> numbers.put("michael", "503-555-1212");
java.lang.Object res1 = null

> numbers.put("jessica", "415-999-0000");
java.lang.Object res2 = null

> numbers.put("chris", "202-111-5599");
java.lang.Object res3 = null

> numbers.get("michael");
java.lang.String res4 = "503-555-1212"

> numbers.get("chris");
java.lang.String res5 = "202-111-5599"
