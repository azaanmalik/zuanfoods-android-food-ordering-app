# Upload the complete Android project

The GitHub connector commits text documentation and CI. Binary Android resources (PNG, JPEG, WebP and Gradle wrapper JAR) require uploading the prepared ZIP contents using GitHub Desktop.

1. Clone `https://github.com/azaanmalik/zuanfoods-android-food-ordering-app.git` in GitHub Desktop.
2. Extract **all contents** of `ZuanFoods-Professional-GitHub-Upload.zip` directly into the cloned repository root, **not** into an extra `ZuanFoods/` folder.
3. Commit all changes and push to `main`.
4. Check GitHub Actions for a successful Android debug build and unit tests.

The package preserves the original `app/`, `gradle/`, Java and XML sources and image assets while excluding `.gradle/`, `.idea/`, generated `build/` directories and `local.properties`.
