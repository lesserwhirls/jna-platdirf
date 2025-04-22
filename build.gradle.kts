plugins {
    java
    `jvm-test-suite`
}

repositories {
    mavenCentral()
    maven("https://artifacts.unidata.ucar.edu/repository/unidata-all/")
}

dependencies {
    implementation(libs.libaec.jna)
    runtimeOnly(libs.libaec.native)
}

testing {
    suites {
        // Using JVM Test Suite feature to configure our test task.
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter(libs.versions.junit)
        }
    }
}

tasks.wrapper {
    version = "8.13"
    distributionType = Wrapper.DistributionType.BIN
}