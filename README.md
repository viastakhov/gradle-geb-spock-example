# gradle-geb-spock-example

### Starting test environment:
```bash
docker-compose up -d
```

### Run tests:
```bash
gradle wrapper
./gradlew test
```

### Verify test report:
```
./build/spock-reports/index.html
```

### Shutdown test environment:
```bash
docker-compose down -v
```

References: