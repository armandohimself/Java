
# Jan 2, 2026

1. Installed JDK 17
    * Used `brew install temurin@17`
    * Confirmed installation with `/usr/libexec/java_home -V`

```bash
23.0.1 (arm64) "Oracle Corporation" - "OpenJDK 23.0.1" /Library/Java/JavaVirtualMachines/jdk-23.0.1.jdk/Contents/Home
    21.0.9 (arm64) "Eclipse Adoptium" - "OpenJDK 21.0.9" /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home
    17.0.17 (arm64) "Eclipse Adoptium" - "OpenJDK 17.0.17" /Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home
    17.0.12 (arm64) "Oracle Corporation" - "Java SE 17.0.12" /Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
    1.8.0_321 (x86_64) "Oracle Corporation" - "Java SE 8" /Library/Java/JavaVirtualMachines/jdk1.8.0_321.jdk/Contents/Home
/Library/Java/JavaVirtualMachines/jdk-23.0.1.jdk/Contents/Home
```

2. Verified Gradle Installation
   * Using `brew install gradle`, terminal verified that I have `gradle 9.2.1` already installed and up-to-date.
   * In `java-dojo/` folder added `build.gradle` and `settings.gradle` files.
   * Generated `Gradle Wrapper` by using `gradle wrapper --gradle-version 8.10.2` and gradle created `gradlew`, `gradlew.bat`, and `gradle/wrapper/**`. 

> After this, you no longer need a system Gradle install, we can rely on `./gradlew`. 