#
# Example file for working with filesystem shell methods
#
import os
from os import path
import shutil
from shutil import make_archive
from zipfile import ZipFile

def main():
  # make a duplicate of an existing file
  if path.exists("textfile.txt"):
    # get the path to the file in the current directory
    src = path.realpath("textfile.txt")

    
    # let's make a backup copy by appending "bak" to the name
    dst = src + ".bak"

    
    # copy over the permissions, modification times, and other info
    # shutil.copy(src, dst)
    # shutil.copystat(src, dst)

    
    # rename the original file
    # os.rename("textfile.txt", "renamed_textfil.txt")

    
    # # now put things into a ZIP archive
    # root_dir, tail = path.split(src)
    # shutil.make_archive("archive", "zip", root_dir)
    # with ZipFile("testZip.zip", "w") as newZip:
    #   newZip.write("textfile.txt")
    #   newZip.write("textfile.txt.bak")

    # more fine-grained control over ZIP files

      
if __name__ == "__main__":
  main()