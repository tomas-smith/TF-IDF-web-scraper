# TF-IDF-web-scraper
A Java application that applies jsoup and apache OPEN NLP to scrape a website and measure word values in search results, giving a weight and understanding which key words are important.


Main.Java

Input method takes in the the desired website's URL and stores it. 

In main, it uses the HTMLParser class from HTMLParser.java to parse the text into plaintext, that later on is used in TFIDF to calculate its value.


HTMLParser.java

Used to clean up the text into plaintext, removing HTML tags, also tagging POS to help remove redundant stopwords such as "the", "a" , "it" and so on.

TF.IDF.java

returns the values of any given word to the main.java whiles applying IDF =(t,D) = log2(N/DF) formula.

Libraries Used:

Jsoup- to scrape the site and put into plaintext

openNPL - used to apply tokenization
