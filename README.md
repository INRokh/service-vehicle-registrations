# Vehicle Registration Service

A simple Java Spring microservice that provides read access to vehicle registration data through hypermedia REST API.

## Data Model

The vehicle registration data consists of three entity types: `Insurer`, `Vehicle` and `VehicleRegistration`. They have the following relationships:

* `VehicleRegistration` has one `Insurer`, while one `Insurer` can be associated with many registrations
* `VehicleRegistration` has one `Vehicle`, while one `Vehicle` can be associated with many registrations

Expiry information, present in Registration is nested and hence annotated as `@Embedded` and stored in a separate class.

The test data is provided in `src/main/resources/data.sql`.

H2 is used as the database engine to simplify the installation and portability of the service.

## API

All the entities are exposed through heypermedia REST API and can be examined separately. `@Projection` is created for `VehicleRegistration` to unnest linked entities (such as `Insurer` and `Vehicle`).

The service has Swagger enabled that provides UI for querying the data, however full CRUD support is not added.

## Run and Test

Build and run using IntelliJ UI or using Maven: `./mvnw spring-boot:run`

Run `curl http://localhost:8080/registrations` to get the JSON.

Open `http://localhost:8080/swagger-ui/` in your browser to explore the API in user-friendly format.

## Possible improvements

1. Original JSON contract uses `snake_case` for attribute names, current implementation uses `camelCase`.
2. The same vehicle can't be registered twice, so there must be a validation that enforce that.
3. The registrations don't belong to any users since it's not clear how the authentication is implemented.
4. Car body types are can be converted to Enum (e.g. `SUV`, `Wagon`, ...)
