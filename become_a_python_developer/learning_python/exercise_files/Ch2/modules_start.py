# import the math module, which contains features for working with mathematics


# the math module contains lots of pre-built functions


# in addition to functions, some modules contain useful constants


# try some of the math functions for yourself here:
def SetAnnual():
  global annual
  annual=10000
def PrintMonthly():
  print("Your monthly payment is "+str(annual/12)+" USD.")
SetAnnual()
PrintMonthly()