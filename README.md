# ZuanFoods - Android Food Ordering UI

Java Android food browsing and order-enquiry prototype featuring a splash screen, tabbed food cards, product details, favourites/history UI, and bottom navigation.

## Requirements
Android Studio, JDK 17, Android SDK 34, and Android 7.0 (API 24) or later.

## Build and run
Open the repository root in Android Studio, sync Gradle, and run the `app` configuration on an emulator or device.

Terminal: `./gradlew :app:assembleDebug :app:testDebugUnitTest` (Windows: `gradlew.bat`).

## Configuration
In `FoodDetailActivity.java`, replace the demonstration recipient `orders@example.com` with your own email address. The app opens a mail client for an order enquiry; it does not implement payments, accounts, real checkout, backend orders, or persistent favourites/history. Food items and prices are static examples.

## License
Original software is MIT-licensed only where contributors own or control the rights. Third-party assets retain their own licenses.
