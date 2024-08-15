//this is a function that converts temperatures from Celsius to Fahrenheit and vice versa. it does the math of the conversion for the user and makes it so all the user has to do is input the temperature they want converted.

fun main() { //the function is named main and has no parameters so it runs when the program starts.
    val temperatures = list(0.0, 32.0, 100.0, -40.0, 75.0) //a list of temperatures in Celsius, they are doubles but you can use ints. I made this a Value/constant because it's immutable and shouldn't be changed while the function is running.

    for (temp in temperatures) {  // this is a for loop, it runs through all the temperatures in the list and prints them out in the console. for each temperature in the list, the function is called and executed. it will never leave out a number unless the value is null.
        val celsiusToFahrenheit = celsiusToFahrenheit(temp) //inside the loop, this line converts the current temp (which is assumed to be celsius) to fahrenheit using the celsiusToFahrenheit function. the result is stored in celsiusToFahrenheit variable.
        val fahrenheitToCelsius = fahrenheitToCelsius(temp) //this line converts the same temperature "temp", but this time treating it as if it were in fahrenheit. the result is store in the fahrenheitToCelsius variable.
        
        println("$temp°C is ${"%.2f".format(celsiusToFahrenheit)}°F") //this line prints the current temperature in celsius and the converted temperature in fahrenheit. the %.2f is used to limit the number of decimal places to 2 so we don't get long doubles. realistically this could probably be shortened down to one.
        println("$temp°F is ${"%.2f".format(fahrenheitToCelsius)}°C") //this line prints the current temperature in fahrenheit and the converted temperature in celsius. same thing as above, the %.2f is used to limit the number of decimal places to 2.
        println() // this simply puts a blank line between outputs for beter readability.
    }
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32 // this is the formula for converting celsius to fahrenheit, the formula we are using is fahrenheit = celsius * 9 / 5 + 32. celsius * 9/5 + 32 performs the calculation and returns the result.
}

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9 // this is the formula for converting fahrenheit to celsius, the formula we are using is celsius = (fahrenheit - 32) * 5 / 9. (fahrenheit - 32) * 5/9 performs the calculation and returns the result.
}