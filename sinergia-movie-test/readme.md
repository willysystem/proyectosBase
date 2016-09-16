Spring Boot sample - Movies 
------------------

An example of how use Spring boot

Two cases of use:

1. A button with touch events 
2. A Tree without touch events

·         Create a data model that fulfills the following requirements
o    Track users, movies, and movie ratings by users
o    Think through the modeling exercise and decide what tables fields will be useful/required
o    Save the DDL for the database to a file called "ddl.sql".

·         Populate each of the tables with some sample data, same these inserts in a file called "sample_data.sql". 
Read the queries below as they will require certain sample data to be populated.

·   Write RESTful API methods that return each of the following. We will evaluate based on correctness and code style.
o    Given a parameter of "age", return the top 10 movies ordered by average rating.

o    Given a userId, return all movies that user has watched and the total count, as well as the rating for that movie.

o    Given a parameter of "state", return the top 20 movies by average rating when that movie has been watched between 6pm and midnight, EST.

o    Given a parameter of "movieId", return its average rating.

o    Given a genre such as "action" and a userId, return the top 5 movies for that genre by average rating, where the rating was made by other users within 5 years
 (older and younger) of the user's age.

·         AFTER running your code, we will attempt to insert some additional data, perhaps for a movie that already exists. 
Ensure the behavior of the database will support this properly (referential integrity, proper primary keys, etc). 

Give consideration to where indexes may be needed (and include in ddl.sql if any are created).
