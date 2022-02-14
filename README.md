#### Build JAR ####

Build `JAR` for the application for version `1.0.0`
* `mvn clean install -DskipTests`

Build `Image` for the application & for migration for version `1.0.0`
* `docker build -t app:1.0.0 .`
* `docker build -t app-migration:1.0.0 -f MigrationDockerfile .`

Modify the script `db/migration/V2__insert_new_user.sql_` and remove the `_` in the end.

Build `JAR` for the application for version `1.0.1`
* `mvn clean install -DskipTests`

Build `Image` for the application & for migration for version `1.0.1`
* `docker build -t app:1.0.1 .`
* `docker build -t app-migration:1.0.1 -f MigrationDockerfile .`

Deploy all K8S resources `kubectl apply -f app.yml`

Application accessible via `http://localhost:5555/users` and verify only 1 user is retrieved.

modify `app.yml` and update `app` & `app-migration` to version 1.0.0 and deploy all K8S resources `kubectl apply -f app.yml`

Application accessible via `http://localhost:5555/users` and verify 2 users are retrieved.

To remove all k8s resources `kubectl delete daemonsets,replicasets,services,deployments,pods,rc --all`