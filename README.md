![pantalla](https://github.com/user-attachments/assets/8b5f9180-176e-4d78-af06-7c1ba50242f1)

### 1. Habilito viewbinding y databinding:

 ```
 buildFeatures {
        compose = true
        viewBinding = true
    }
    
    dataBinding {
        enable = true
    }
```

### 2. Agrego dependencias (Reemplazar por versión actual y Sincronizar):
```
val nav_version = "2.7.7"
    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
```

### 3. Configuro activity_main:

en res 
creo directory -> layout -> layout resource file -> activity_main

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    >

</androidx.constraintlayout.widget.ConstraintLayout>
```

### 4. Configuro themes (res -> values -> themes.xml):

```
<?xml version="1.0" encoding="utf-8"?>
<resources>

    <style name="Theme.Estado" parent="Theme.AppCompat" />
</resources>
```

### 5. Configuro Manifest:

```
<activity
    android:name=".MainActivity"
    android:exported="true"
    android:label="@string/app_name"
    android:theme="@style/Theme.AppCompat.DayNight.NoActionBar">
       <intent-filter>
          <action android:name="android.intent.action.MAIN" />
             <category android:name="android.intent.category.LAUNCHER" />
       </intent-filter>
</activity>
```

### 6. Agrego Permiso Internet en Manifest:

```
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <uses-permission android:name="android.permission.INTERNET" />

    <application
```
