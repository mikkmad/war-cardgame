# Game Description
This is based on the Card Game "War!" that I've played a lot as a child. It is a game where two players evenly distribute a single deck of cards between them, with the stacks face-down. Each player then in unison draws a card and places it face-up. The player with the higher card wins the "round". If the cards are of equal value, a "battle" starts. Each player then draws three cards face-down and one face-up. The player with the higher card wins the "battle" and all the cards. The won cards - either by a "round" or by a "battle" - are placed in a pile, near the player. Once the running deck is out of cards, the pile of won cards is shuffled and then used as the active deck. The game is over when either player has **all** the cards.

## Project Description

This is a Kotlin Multiplatform project targeting Android, iOS, Web and Desktop (JVM).

### Building and Running the Application
<details>
<summary>Build and Run Android Application</summary>

---
To build and run the development version of the Android app, use the run configuration from the run widget in your IDE’s toolbar or build it directly from the terminal:
- on macOS/Linux
  ```shell
  ./gradlew :composeApp:assembleDebug
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:assembleDebug
  ```
</details>

<details>
<summary>Build and Run Desktop (JVM) Application</summary>

---
To build and run the development version of the desktop app, use the run configuration from the run widget
in your IDE’s toolbar or run it directly from the terminal:
- on macOS/Linux
  ```shell
  ./gradlew :composeApp:run
  ```
- on Windows
  ```shell
  .\gradlew.bat :composeApp:run
  ```
</details>

<details>
<summary>Build and Run Web Application</summary>

---
To build and run the development version of the web app, use the run configuration from the run widget
in your IDE's toolbar or run it directly from the terminal:
- for the Wasm target (faster, modern browsers):
  - on macOS/Linux
    ```shell
    ./gradlew :composeApp:wasmJsBrowserDevelopmentRun
    ```
  - on Windows
    ```shell
    .\gradlew.bat :composeApp:wasmJsBrowserDevelopmentRun
    ```
- for the JS target (slower, supports older browsers):
  - on macOS/Linux
    ```shell
    ./gradlew :composeApp:jsBrowserDevelopmentRun
    ```
  - on Windows
    ```shell
    .\gradlew.bat :composeApp:jsBrowserDevelopmentRun
    ```
</details>

<details>
<summary>Build and Run iOS Application</summary>

---
To build and run the development version of the iOS app, use the run configuration from the run widget in your IDE’s toolbar or open the [/iosApp](./iosApp) directory in Xcode and run it from there.
</details>

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html), [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform) and [Kotlin/Wasm](https://kotl.in/wasm/).
