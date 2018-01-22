Just playing with linkrest:)<br />

mysql -u root -p < $(PATH_TO_PROJECT)/dump.sql<br />
mvn clean install; mvn exec:java -Dexec.mainClass="linkrest.demo.PlayingWithLinkedRestMain"