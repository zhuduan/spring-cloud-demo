cd target

java -jar cloud.demo.eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=node1 &
java -jar cloud.demo.eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=node2 &
