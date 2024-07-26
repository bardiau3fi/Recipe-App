plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.navigationsafeargs)
    id("kotlin-kapt")
    id("kotlin-parcelize")
    alias(libs.plugins.daggerhiltandroid)



}

android {
    namespace = "com.example.recipeapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.recipeapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
buildFeatures{
    viewBinding=true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    //Navigation
    implementation (libs.navigation.fragment.ktx)
    implementation (libs.navigation.ui.ktx)
    //Dagger - Hilt
    implementation (libs.hilt.android)
    kapt (libs.hilt.compiler)
    //Room components
    implementation (libs.androidx.room.runtime)
    kapt (libs.room.compiler)
    implementation (libs.androidx.room.ktx)
    //DataStore
    implementation (libs.androidx.datastore.datastore.preferences)
    //Retrofit
    implementation (libs.retrofit2.retrofit)
    implementation (libs.converter.gson)
    //OkHTTP client
    implementation (libs.squareup.okhttp)
    implementation (libs.squareup.logging.interceptor)
    //Coroutines
    implementation (libs.jetbrains.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)
    //Lifecycle
    implementation (libs.androidx.lifecycle.extensions)
    implementation (libs.androidx.lifecycle.runtime.ktx)
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.androidx.lifecycle.livedata.ktx)

    //Image Loading
    implementation (libs.coil)
    //Gson
    implementation (libs.gson)
    //Calligraphy
    implementation (libs.calligraphy3)
    implementation (libs.viewpump)
    //Other
    implementation (libs.shimmer)
    implementation (libs.shimmer.recyclerview)
    implementation (libs.lottie)
    implementation (libs.dynamicSizes)
    implementation (libs.readmore.textview)

}