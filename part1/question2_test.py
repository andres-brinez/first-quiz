from question2 import run_swapper 

# se prueba la funcion run_swapper con diferentes casos
def test_run_swapper():
  # Toma una lista de tuplas y devuelve una lista de tuplas con los valores intercambiados
  assert run_swapper(
    [ ("a", "b"), ("c", "d"), ("e", "f") ]
  ) == [ ("b", "a"), ("d", "c"), ("f", "e")]

  assert run_swapper(
    [ (1, 1), ("foo", "bar"), (13, "cows"), (None, "Some") ]
  ) == [ (1, 1), ("bar", "foo"), ("cows", 13), ("Some", None) ]