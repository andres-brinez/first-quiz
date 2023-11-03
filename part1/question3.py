################################################################################
#     ____                          __     _                          _____
#    / __ \  __  __  ___    _____  / /_   (_)  ____    ____          |__  /
#   / / / / / / / / / _ \  / ___/ / __/  / /  / __ \  / __ \          /_ < 
#  / /_/ / / /_/ / /  __/ (__  ) / /_   / /  / /_/ / / / / /        ___/ / 
#  \___\_\ \__,_/  \___/ /____/  \__/  /_/   \____/ /_/ /_/        /____/  
#                                                                          
#  Question 3
################################################################################
#
# Instructions:
# Make a Python class for a magical oven that can combine ingredients at 
# different temperatures to craft special materials.
# 
# The oven class should have the methods:
# - add(item) to add an oven to be combined
# - freeze() to freeze the ingredients
# - boil() to boil the ingredients
# - wait() to combine the ingredients with no change in temperature
# - get_output() to get the result 
#
# You will need to change the `make_oven()` function to return a new instance
# of your oven.
#
# The `alchemy_combine()` function will use your oven. You can see the expected 
# formulas and their outputs in the test file, `question3_test.py`.


# This function should return an oven instance!
def make_oven():
  return Oven() # Se crea una instancia de la clase Oven

def alchemy_combine(oven, ingredients, temperature):
  
  for item in ingredients:
    oven.add(item)

  if temperature < 0:
    oven.freeze()
  elif temperature >= 100:
    oven.boil()
  else:
    oven.wait()

  return oven.get_output()


# Funcion Oven
class Oven:
    
  # Se inicializa la clase con los atributos items y temperature 
  # Constructor
  def __init__(self):
    self.items = []
    self.temperature = None

  def add(self, item):
    self.items.append(item)

  def freeze(self):
    self.temperature = 'freezing'

  def boil(self):
    self.temperature = 'boiling'

  def wait(self):
    self.temperature = 'normal'


  def get_output(self):  
  # Retorna el resultado de la combinacion de los ingredientes
    if set(self.items) == {"lead", "mercury"} and self.temperature == 'boiling':
      return "gold"
    elif set(self.items) == {"water", "air"} and self.temperature == 'freezing':
      return "snow"
    elif set(self.items) == {"cheese", "dough", "tomato"} and (self.temperature == 'normal' or self.temperature == 'boiling'):
      return "pizza"
    else:
      return "unknown"