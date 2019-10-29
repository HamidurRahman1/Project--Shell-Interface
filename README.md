# <strong>Shell-Interface</strong>

<pre><strong>A simple shell interface implementation in Java. Supports below commands to play with it.
When the program is first launched it prints out the list of all commands that can be executed in here.</strong>

<ol>
    <li>!! - executes previously entered command. 
    IllegalArgumentException thrown if no previous command found.</li> 
    <li>cal - print out current month's calendar.</li>
    <li>cat [file] - prints out the valid given file content.</li>
    <li>cd - takes to home dir.</li> 
    <li>cd .. - goes 1 directory down if there is any.</li>
    <li>cd [dir] - takes to the given directory, given directory can be absolute or relative to cwd.</li>
    <li>date - prints out today's date</li>
    <li>env - prints out the environment variables.</li>
    <li>exit - exit the shell(java program)</li>
    <li>history - prints out list of commands that have been entered.</li>
    <li>logname - prints out the current calling user's name.</li>
    <li>ls - list the directory files</li>
    <li>mkdir [dir] - makes a directory with the given name</li>
    <li>os - prints out the os name</li>
    <li>pwd - prints out the current working directory.</li>
    <li>pbpaste - prints out if there is something on clipboard.</li>
    <li>touch [file] - creates a new file with the given filename and extension.
    If extension ignored then creates a .txt file.</li>
    <li>users - lists all the users</li>
    <li>who - users logged in</li>
    <li>whoami - prints out the current user name</li>
  </ol>
</pre>  
