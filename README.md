Just playing with linkrest:)<br />

mysql -u root -p < $(PATH_TO_PROJECT)/dump.sql<br />
mvn clean install; mvn exec:java -Dexec.mainClass="linkrest.demo.PlayingWithLinkedRestMain"<br />
URI: http://127.0.0.1:8082 | http://127.0.0.1:8082/constrained | constrained http://127.0.0.1:8082 (METHOD:PUT)