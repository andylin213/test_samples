# coding=utf-8

import testlib


def source():
  pass


def sink(a1, a2):
  pass


def spread(a1, a2):
  pass


def _main():
  a = source()
  aa = spread(a)
  sink(1, aa) # !
  sink(aa, 1)

  b = testlib.source()
  bb = testlib.spread(b)
  testlib.sink(1, bb) # !

  ignore()
  test(1) # !


def ignore():
  c = source()
  sink(1, c)


def test(x):
  sink(1, x)


if __name__ == '__main__':
  _main()

