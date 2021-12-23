# javax-sample

The jboss/wildfly is using java 8.

```
docker build -t javax-app .
docker run -d -p 8080:8080 javax-app
```

## API Strutcture

/api/test

/api/test-xml

/api/test-xml-name?payload=\<input\>

