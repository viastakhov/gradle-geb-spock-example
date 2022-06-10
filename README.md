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
* https://www.gebish.org/
* https://www.browserstack.com/guide/run-selenium-tests-in-docker
* https://www.selenium.dev/documentation/
* https://github.com/SeleniumHQ/docker-selenium