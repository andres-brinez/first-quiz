################################################################################
#     ____                          __     _                          ___
#    / __ \  __  __  ___    _____  / /_   (_)  ____    ____          <  /
#   / / / / / / / / / _ \  / ___/ / __/  / /  / __ \  / __ \         / / 
#  / /_/ / / /_/ / /  __/ (__  ) / /_   / /  / /_/ / / / / /        / /  
#  \___\_\ \__,_/  \___/ /____/  \__/  /_/   \____/ /_/ /_/        /_/   
#                                                                        
#  Question 1
################################################################################
#
# Instructions:
# The two functions below are used to tell the weather. They have some bugs that
# need to be fixed. The test suite in `question1_test.py` will verify the output.
# Read the test suite to know the values that these functions should return.

# Función que retorna la temperatura de una ciudad
# Se completa el código para las ciudades que faltan
def get_city_temperature(city):

   if city == "Quito":
      return 22
   if city == "New York":
      return 14
   if city == "Sao Paulo":
      return 17
   if city == "San Francisco":
      return 16


def get_city_weather(city):

   sky_condition = None
   
   if city == "Quito":
      sky_condition = "sunny"
   elif city == "Sao Paulo":
      sky_condition = "cloudy"
   elif city == "New York":
      sky_condition = "rainy"
   elif city == "San Francisco":
      sky_condition = "sunny"

   temperature = get_city_temperature(city)

   return str(temperature) + " degrees and " + sky_condition

   # El error era que estaba retornando un NoneType, porque las ciudades del test no estaban en la función

  