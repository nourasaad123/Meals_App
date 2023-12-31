import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
id("dagger.hilt.android.plugin")

}

android {
    namespace = "com.example.mealsapp"
    compileSdk = 33
    buildFeatures{
        viewBinding = true
    }
    hilt {
        enableAggregatingTask = true
    }
    defaultConfig {
        applicationId = "com.example.mealsapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")
    implementation("androidx.room:room-runtime:2.5.2")
    annotationProcessor("androidx.room:room-compiler:2.5.2")

    // To use Kotlin annotation processing tool (kapt)
   kapt("androidx.room:room-compiler:2.5.2")
    // To use Kotlin annotation processing tool (kapt)
    implementation("androidx.hilt:hilt-work:1.0.0")
    // When using Kotlin.
    kapt("androidx.hilt:hilt-compiler:1.0.0")
    // To use Kotlin Symbol Processing (KSP)
    // ksp("androidx.room:room-compiler:2.5.2")

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:2.5.2")

    // optional - RxJava2 support for Room
    implementation("androidx.room:room-rxjava2:2.5.2")

    // optional - RxJava3 support for Room
    implementation("androidx.room:room-rxjava3:2.5.2")

    // optional - Guava support for Room, including Optional and ListenableFuture
    implementation("androidx.room:room-guava:2.5.2")

    // optional - Test helpers
    testImplementation("androidx.room:room-testing:2.5.2")

    // optional - Paging 3 Integration
    implementation("androidx.room:room-paging:2.5.2")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    //implementation("com.jakewharton.retrofit2.kotlinx-serialization-converter:0.8.0")
// Coroutines for asynchronous programming
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1")
    implementation("androidx.hilt:hilt-work:1.0.0")


    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")

    // OPTIONAL: For instrumentation tests
    androidTestImplementation  ("com.google.dagger:hilt-android-testing:2.44.2")
    kaptAndroidTest ("com.google.dagger:hilt-compiler:2.44.2")

    // OPTIONAL: For local unit tests
    testImplementation ("com.google.dagger:hilt-android-testing:2.44.2")
    kaptTest ("com.google.dagger:hilt-compiler:2.44.2")
    // When using Kotlin.
    kapt("androidx.hilt:hilt-compiler:1.0.0")
    // When using Java.
    annotationProcessor("androidx.hilt:hilt-compiler:1.0.0")
    implementation("com.google.dagger:hilt-android:2.44")
   kapt("com.google.dagger:hilt-android-compiler:2.44")
    implementation("androidx.hilt:hilt-work:1.0.0")
    kapt("androidx.hilt:hilt-compiler:1.0.0")
    implementation("androidx.work:work-runtime-ktx:2.8.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    implementation ("androidx.navigation:navigation-compose:2.5.1")
    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.0-alpha05")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.0-alpha05")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.0-alpha05")
    implementation(project(path = ":domain"))
    implementation(project(path = ":data"))
    implementation ("androidx.activity:activity-ktx:1.3.1")

    implementation ("androidx.recyclerview:recyclerview:1.2.1")

    implementation ("com.github.bumptech.glide:glide:4.13.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.13.0")

    //

}