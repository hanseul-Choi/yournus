import com.yournus.shopping.configureCoroutineAndroid
import com.yournus.shopping.configureHiltAndroid
import com.yournus.shopping.configureKotlinAndroid

plugins {
    id("com.android.library")
}

configureKotlinAndroid()
configureCoroutineAndroid()
configureHiltAndroid()