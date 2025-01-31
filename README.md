# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: KAMINDLA RAVICHARAN

*INTERN ID*: CT12QFG

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 8 WEEKS

*MENTOR*: NEELA SANTHOSH KUMAR


 How the Program Works
This Java program performs basic file-handling operations—reading, writing, and modifying (appending) a file. It interacts with users through the command line, allowing them to specify a file, input content, and modify it dynamically. The program utilizes Java's BufferedReader and BufferedWriter to handle file operations efficiently.

The working process can be summarized as follows:

User Input Handling:
The program prompts the user to enter a file path.
It then asks for content to write to the file.

Writing to a File (writeFile method):
The program uses BufferedWriter to write user input to the specified file.
If the file already exists, its content is completely overwritten.

Reading the File (readFile method):
After writing, the file is read using BufferedReader.
The program reads the file line by line and prints it to the console.

Modifying (Appending) File Content (modifyFile method):
The user is prompted to enter additional content.
This content is appended to the existing file without overwriting it.
The program uses BufferedWriter in append mode (new FileWriter(filePath, true)) to ensure the new content is added at the end of the file.

Final Read and Display:
The modified file is read again and displayed.
The program closes all resources before exiting.


Key Components Used in the Program
To perform these operations, the program relies on several Java classes and concepts:

BufferedReader and BufferedWriter:
These classes provide efficient reading and writing capabilities by buffering data.
BufferedReader reads text from an input stream, while BufferedWriter writes text to an output stream.

FileReader and FileWriter:
FileReader is used with BufferedReader to read from a file.
FileWriter is used with BufferedWriter to write or append data to a file.

Scanner for User Input:
The program uses Scanner to take user input for file paths and content.

Exception Handling (try-catch):
Prevents the program from crashing due to file-related errors (e.g., missing files, permission issues).


Where It Is Applicable
This program is useful in various scenarios where file management is required:

Log File Management:
Used for maintaining log files where new entries need to be appended instead of overwriting existing data.

Configuration Files:
Helpful in applications that need to store and update configuration settings in text files.

Data Storage:
Can be used in applications where small amounts of structured data need to be stored without a database.

User Notes or Simple File Editors:
Can be modified to function as a simple text editor where users can create and modify text documents.


Applications and Uses

Programming and Development:
Useful for handling configuration files, logs, or storing temporary data.

Automated Report Generation:
Programs that generate and store reports in text files.

Data Processing:
Applications that process and manipulate text-based data files.

Backup Systems:
Storing and updating critical data backups in text format.

This program provides a foundation for file handling in Java and can be extended for real-world applications like text processing tools, logging mechanisms, or simple document editors.

#OUTPUT

![Image](https://github.com/user-attachments/assets/d53af2b1-0262-47ad-8edd-a18351c46531)
![Image](https://github.com/user-attachments/assets/af507044-7c97-4a1f-b13b-f3711415b5b4)
![Image](https://github.com/user-attachments/assets/2beee7d5-9213-4b39-8ded-447883b6ace7)











