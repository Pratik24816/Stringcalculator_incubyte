# Stringcalculator_incubyte

## ✅ Test Cases Implemented

- ✅ Empty string returns 0  
- ✅ Single number returns the number itself  
- ✅ Two numbers return their sum  
- ✅ Any amount of numbers can be added  
- ✅ Newlines between numbers are handled  
- ✅ Custom delimiters (e.g., `//;\n1;2`)  
- ✅ Negative number validation  
- ✅ Multiple negative numbers throw exception with proper message  

## ▶️ Running the Application

#### calculator.add("");           // Returns 0
#### calculator.add("1");          // Returns 1
#### calculator.add("1,2");        // Returns 3
#### calculator.add("1,2,3,4,5");  // Returns 15
#### calculator.add("1\n2,3");     // Returns 6
#### calculator.add("//;\n1;2");   // Returns 3
#### // Negative numbers (throws exception)
#### calculator.add("-1,2");  
