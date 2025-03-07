# Natural-Language-Processing-Project
APCSA Natural Language Processing Project Period 2
# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.


![UML Diagram](image.png)
## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[![Thumbnail for my project](image-1.png)](https://youtu.be/nKgOkycsmf4?si=oAgXa5Eynwrzr-zN)

## Project Description


Write a description of the goal and/or problem that your application. Include descriptions of what text is being analyzed, either if its text files you are using to interpret text an how the user interacts with your project.
##

The goal of this application is to help users find specific words or phrases in a given text, similar to the Ctrl+F function on a computer. The program analyzes predefined text data stored in an ArrayList and returns sentences that contain the user’s input. Users interact with the project by entering a keyword, and the system then searches for matches and displays them.
## NLP Techniques

Write a description of what natural lanugage technique (NLP) you implemented in your project. State which methods in your project are associated with this, and a brief explanation of how those methods word and how they are necessary in the NLP technique. 
##
The project utilizes Keyword Extraction, a fundamental Natural Language Processing (NLP) technique. This method helps identify and retrieve sentences that contain the desired keyword.


KeywordExtraction() – This method loops through the stored text data and checks if each sentence contains the user’s input. If a match is found, the sentence is added to a list of results.

displayExtraction() – This method prints all sentences that include the user’s input. If no matches are found, it notifies the user accordingly.

These methods are essential in implementing Keyword Extraction, as they allow for efficient searching and retrieval of relevant text segments based on user input.
