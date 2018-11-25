./gradlew build
mongod --fork --logpath ./build/mongo.log
java -jar build/libs/musicforbooks-1.0.0.jar
