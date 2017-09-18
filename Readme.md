
This is a test project.

### Getting started

- Clone this repo.
- Run `./mvnw clean package` to build the jar for the project.
- To run the jar execute `java -jar target/spring5test-0.0.1-SNAPSHOT.jar`
- This will import the `sample-data.csv` file included in the jar it self(for the test only).
- This will also start an API server for the imported data.

Note that this app does not have any special configs for different envs as this is just a test.

### API

- You can make simple queries on the database using `http://localhost:8080/api/`
- You can see all the imported data by navigating to `http://localhost:8080/api/persons`.
- You can see individual person by id using `http://localhost:8080/api/persons/{id}`.
- You can search persons by first name and email using
`http://localhost:8080/api/persons/search/by?name={any-part-of-name}&email={any-part-of-email}`.
    - Eg: `http://localhost:8080/api/persons/search/by?name=adeu&email=nge6w`

### Docker build

To build a docker image run `./mvnw clean package docker:build`.