package com.yournus.shopping

import org.gradle.api.Project

fun Project.setNamespace(name: String) {
    androidExtension.apply {
        namespace = "com.yournus.shopping.$name"
    }
}