#
# Read and write files using the built-in Python file methods
#

def main():  
  # Open a file for writing and create it if it doesn't exist
  # fin = open("textfile.txt", "w+")

  
  # Open the file for appending text to the end
  fin = open("textfile.txt", "r")


  # write some lines of data to the file
  # for i in range(11, 21):
  #   fin.write("This is line" + str(i) + "\r\n")

  
  # close the file when done
  # fin.close()
  
  # Open the file back up and read the contents
  if fin.mode == 'r':
    # contents = fin.read()
    fl = fin.readlines()
    for x in fl:
      print(x)
    # print(contents)

    
if __name__ == "__main__":
  main()
