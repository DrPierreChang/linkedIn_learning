# Working Efficently with jupyter
## Shortcuts

Move to begining of raw
~~~~
ctrl + up
~~~~
Move to the end of raw
~~~~
ctrl + down
~~~~

Add comment
~~~~
ctrl + /
~~~~

Skeep few words left
~~~~
ctrl + left
~~~~
Skeep few words right
~~~~
ctrl + right
~~~~

Move left and delete whole word
~~~~
ctrl + backspace 
~~~~

different ways of running cell
1) run and stay on the same positon 2)run and make blank cell 3) run and move to the next cell
~~~~
ctrl + enter
alt + enter
shift + enter
~~~~

split cell
~~~~
ctrl + shift + minus
~~~~
combine cells
~~~
shift + up
shift + m
~~~

copy cell
~~~~
c
~~~~

past cell
~~~~
v
~~~~

hide output
~~~~
o
~~~~

open all available shortcuts
~~~~
h
~~~~


command pallete
~~~~
p
~~~~
## Line magic commands

some bash commands can be executed from cell
~~~~
ls
pwd
cp
mv
rm
cat
~~~~

load information from file
~~~~
%load
~~~~

look at the script
~~~~
%cat script_name.py
~~~~

run script
~~~~
%run script_name.py
~~~~

time of execution
~~~~
%time print(3+3)
%timeit print(3+3)
~~~~

## Cell magic commands

write cell to file
~~~~python
%%writefile get_mean_function.py
def get_mean(column):
    return df[column].mean()
~~~~
save chart to variable
~~~~python
%%capture chart to variable chart
run plot_numbers.py 2 4 7 8
chart.show()
~~~~

see all magic
~~~~
%lsmagic
~~~~
