cd target

java -jar cloud.demo.commodity-0.0.1-SNAPSHOT.jar --spring.profiles.active=commodity_node1 &
java -jar cloud.demo.commodity-0.0.1-SNAPSHOT.jar --spring.profiles.active=commodity_node2 &