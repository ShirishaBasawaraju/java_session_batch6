public class day_4_conditional {
#problem1
public String fizzString(String str) {
  if(str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b'){
    return "FizzBuzz";
  }
  else if (str.charAt(str.length()-1) == 'b'){
    return "Buzz";
  } else if (str.charAt(0) == 'f'){
    return "Fizz";
  }
  return str;
}
#problem2
public boolean squirrelPlay(int temp, boolean isSummer) {
    int upperLimit;
         if (isSummer) {
             upperLimit = 100;
         } else {
             upperLimit = 90;
         }
         if (temp >= 60 && temp <= upperLimit) {
             return true;
         } else {
             return false;
         }
     }
#problem3
public String alarmClock(int day, boolean vacation) {
    if (vacation) {
             if (day >= 1 && day <= 5) {
                 return "10:00"; 
             } else {
                 return "off"; 
             }
         } else {
             if (day >= 1 && day <= 5) {
                 return "7:00"; 
             } else {
                 return "10:00"; 
             }
         }
     }
}
