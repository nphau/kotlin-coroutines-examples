# Kotlin Coroutines Examples
[![official JetBrains project](https://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)
[![Download](https://img.shields.io/maven-central/v/org.jetbrains.kotlinx/kotlinx-coroutines-core/1.6.0)](https://search.maven.org/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core/1.6.0/pom)
[![Kotlin](https://img.shields.io/badge/kotlin-1.6.10-blue.svg?logo=kotlin)](http://kotlinlang.org)

## 🔧 Project Setup
Create gradle file like below, and the version of libary is depends on you
```groovy
plugins {
    id 'org.jetbrains.kotlin.jvm' version '1.6.10'
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.jetbrains.kotlin:kotlin-stdlib-jdk8'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0-native-mt'

    testImplementation  'junit:junit:4.12'
    testImplementation 'org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.0-M2'
}

compileKotlin {
    kotlinOptions.jvmTarget = "1.8"
}
compileTestKotlin {
    kotlinOptions.jvmTarget = "1.8"
}
```
## ⚙️ Copyright
```
Created by $username on $today
Copyright (c) $today.year . All rights reserved.
Last modified $file.lastModified
```


[![-----------------------------------------------------](https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/colored.png)](#table-of-contents)

## 👇 Author
<p>
    <a href="https://nphau.medium.com/" target="_blank">
    <img src="https://avatars2.githubusercontent.com/u/13111806?s=400&u=f09b6160dbbe2b7eeae0aeb0ab4efac0caad57d7&v=4" width="96" height="96">
    </a>
</p>
