# Εκκίνηση του περιβάλλοντος

Για να δημιουργήσουμε ένα νέο περιβάλλον τρέχουμε:
```
docker-compose up -d
```


Για να πάρουμε backup τη MongoDB (το master του replica set) τρέχουμε:
```
docker exec -it root_mongo_1 mongodump --host "rs0/localhost:27017" -d rocketchat -o mydump
```
