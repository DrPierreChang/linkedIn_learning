# 
# Example file for variables
#

# Declare a variable and initialize it
f = 0
# print(f)


# # re-declaring the variable works
# f = 'abc'
# print(f)


# # ERROR: variables of different types cannot be combined
# print(str(1) + 'asd')


# Global vs. local variables in functions

def some_function():
    global f
    f = 'abc'
    print(f)

some_function()
print(f)


# del f
# print(f)