plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
}

android {
  namespace = "com.matrix159.mastadonclone.presentation"
  compileSdk = 33

  defaultConfig {
    minSdk = 24
    targetSdk = 33

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")
  }

  buildFeatures {
    compose = true
  }

  buildTypes {
    release {
      isMinifyEnabled = true
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  composeOptions {
    kotlinCompilerExtensionVersion = "1.4.0"
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }
}

dependencies {
  val composeVersion = "1.4.0-alpha04"
  val coilVersion = "2.2.2"

  implementation(project(":shared"))

  implementation("androidx.core:core-ktx:1.9.0")
  //implementation("androidx.activity:activity-compose:1.6.1")
  implementation("androidx.compose.ui:ui:$composeVersion")
  debugImplementation("androidx.compose.ui:ui-tooling:$composeVersion")
  implementation("androidx.compose.ui:ui-tooling-preview:$composeVersion")
  implementation("androidx.compose.material:material:$composeVersion")
  implementation("androidx.compose.material:material-icons-extended:$composeVersion")
  // Material3 in Compose
  implementation("androidx.compose.material3:material3:1.1.0-alpha04")

  implementation("androidx.activity:activity-compose:1.6.1")
  implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.0-alpha04")
  // Image loading
  implementation("io.coil-kt:coil:$coilVersion")
  implementation("io.coil-kt:coil-compose:$coilVersion")

  // timber
  implementation("com.jakewharton.timber:timber:5.0.1")


  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}