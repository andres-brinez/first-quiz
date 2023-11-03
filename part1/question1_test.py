# Prueba unitaria para la función get_city_weather  en el módulo question1
from question1 import get_city_weather

# Retorna resultados de la prueba unitaria  para las ciudades 
def test_get_city_weather():

  assert get_city_weather("Quito") == "22 degrees and sunny"

  assert get_city_weather("New York") == "14 degrees and rainy"
