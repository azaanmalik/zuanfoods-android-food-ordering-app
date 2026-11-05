# ZuanFoods — Android Food Ordering UI

A Java Android food browsing and order-enquiry **prototype**, built with Android XML layouts, Material Components, fragments, tabs, and RecyclerView.

## Features
- Splash screen and food browsing dashboard
- Tabbed food categories and horizontal product cards
- Product detail page
- Bottom navigation with home, favourites and history screens
- Email-based order enquiry intent (requires a configured recipient and email app)

**Scope:** This is a UI prototype with static sample products. It does not implement payment processing, user accounts, persistent favourites/history, a backend API or real order fulfilment. The original placeholder food prices are illustrative. Do not present it as a live ordering service.

## Technology
- Java, Android Gradle Plugin 8.5.2, Gradle 8.7
- compileSdk 34, targetSdk 34, minSdk 24
- AndroidX AppCompat, Material Design, Fragments, RecyclerView, ViewPager

## Run locally
1. Clone this repository.
2. Open the repository root (containing `settings.gradle.kts`) in Android Studio.
3. Install Android SDK Platform 34 and configure JDK 17 for Gradle.
4. Allow Gradle sync, then launch the `app` configuration on an emulator or Android device running API 24+.

Terminal build:
```bash
# macOS/Linux
chmod +x gradlew
./gradlew :app:assembleDebug :app:testDebugUnitTest

# Windows
gradlew.bat :app:assembleDebug :app:testDebugUnitTest
```
The debug APK is generated under `app/build/outputs/apk/debug/`.

## Project layout
```text
app/src/main/java/com/practiceandeoid/zuanfoods/  Java activities, fragments and adapters
app/src/main/res/layout/                       Android XML screens
app/src/main/res/drawable/                     Icons and sample food images
app/src/main/res/menu/                         Bottom navigation
app/src/test/                                  Local starter tests
app/src/androidTest/                           Device/emulator tests
gradle/                                        Version catalog and wrapper
.github/workflows/android-ci.yml               Automated build and unit tests
```

## Configuration
The original sample order enquiry uses an email intent. Set your own recipient in `FoodDetailActivity.java` before testing that feature; **no API credentials or cloud services are needed** for browsing the static demo. The app cannot place a real paid order.

## Verification
GitHub Actions runs the Android debug build and local unit tests after the source files are uploaded. A passing build does not prove emulator UI navigation or order-email handling has been manually tested.

## License
Original software is distributed under the [MIT License](LICENSE), only to the extent contributors have the rights to grant it. Third-party images and libraries retain their own licenses.
